from bs4 import BeautifulSoup
from datetime import datetime
import pandas as pd
import requests


def scrap():

    clothes_list = list()
    page = 1
    default_link = "https://www.boyner.com.tr"
    clothes_data = pd.read_excel("clothes.xlsx")
    #print(clothes_list.values)

    for link, body_part, condition, gender in clothes_data.values:
        print(link)
        if "&orderOption=Editor" in link:
            #print(link)
            splitted_link = link.split("/1/")
            while True:
                #print(splitted_link[0] + f'/{page}/' + splitted_link[1])
                r = requests.get(splitted_link[0] + f'/{page}/' + splitted_link[1])
                soup = BeautifulSoup(r.content, 'lxml')
                
                product_list = soup.find_all("div", {"id":"pagedListContainer"})

                for div in product_list:
                    try:
                        url = default_link + div.find("a", {"class":"product-figure"})["href"]

                        img = div.find("img", {"class":"lazy"})["data-original"]

                        name = div.find("span", {"class":"product-name"})
                        stripped_name = name.text.strip()

                        price = div.find("ins", {"class":"price-payable"})
                        stripped_price = price.text.strip("TL").replace(",", "").strip()

                        clothes_list.append([url, img, stripped_name, stripped_price, body_part, condition, gender])
                        #print(img)
                    except Exception as e:
                        print(e)

                page += 1
                if soup.find("li", {"class":"next-item"}) == None:
                    page = 1
                    break
        else:
            while True:
                r = requests.get(link + f'/{page}/?orderOption=Editor')
                soup = BeautifulSoup(r.content, 'lxml')
                product_list = soup.find_all("div", {"id":"pagedListContainer"})

                for div in product_list:
                    try:
                        url = default_link + div.find("a", {"class":"product-figure"})["href"]

                        img = div.find("img", {"class":"lazy"})["data-original"]

                        name = div.find("span", {"class":"product-name"})
                        stripped_name = name.text.strip()

                        price = div.find("ins", {"class":"price-payable"})
                        stripped_price = price.text.strip("TL").replace(",", "").strip()

                        clothes_list.append([url, img, stripped_name, stripped_price, body_part, condition, gender])
                        #print(img)
                    except Exception as e:
                        print(e)

                page += 1
                if soup.find("li", {"class":"next-item"}) == None:
                    page = 1
                    break

    data = pd.DataFrame(clothes_list, columns = ["url", "img", "name", "price", "body_part", "weather_condition", "gender"])
    data.to_csv(f'clothes_data.csv', encoding='utf-8', index=False)


if __name__ == '__main__':
    scrap()
