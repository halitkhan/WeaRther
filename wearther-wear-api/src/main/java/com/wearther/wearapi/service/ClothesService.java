package com.wearther.wearapi.service;

import com.opencsv.CSVReader;
import com.wearther.wearapi.domain.enums.BodyPart;
import com.wearther.wearapi.domain.enums.ClothesCondition;
import com.wearther.wearapi.domain.enums.Gender;
import com.wearther.wearapi.domain.model.Clothes;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClothesService {

    public List<Clothes> getClothesFromCsv(){
        List<Clothes> clothesList = new ArrayList<>();
        try(CSVReader csvReader = new CSVReader(new FileReader("C:/Users/ASUS/IdeaProjects/COMP301/COMP301_Proje/WeaRther/clothes_data.csv"))) {
            String[] nextLine;
            csvReader.readNext();
            while ((nextLine = csvReader.readNext()) != null){
                Clothes clothes = new Clothes(
                        nextLine[0],
                        nextLine[1],
                        nextLine[2],
                        Float.parseFloat(nextLine[3]),
                        getBodyPart(nextLine[4]),
                        getClothesCondition(nextLine[5]),
                        getGender(nextLine[6])
                );
                clothesList.add(clothes);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return clothesList;
    }

    private BodyPart getBodyPart(String bodyPart) {
        return switch (bodyPart) {
            case "Head" -> BodyPart.HEAD;
            case "Jacket" -> BodyPart.JACKET;
            case "Top" -> BodyPart.TOP;
            case "Hand" -> BodyPart.HAND;
            case "Bottom" -> BodyPart.BOTTOM;
            case "Foot" -> BodyPart.FOOT;
            case "Accessory" -> BodyPart.ACCESSORY;
            case "One Piece" -> BodyPart.ONE_PIECE;
            default -> null;
        };
    }

    private ClothesCondition getClothesCondition(String clothesCondition) {
        return switch (clothesCondition) {
            case "Thin" -> ClothesCondition.THIN;
            case "Normal" -> ClothesCondition.NORMAL;
            case "Thick" -> ClothesCondition.THICK;
            default -> null;
        };
    }

    private Gender getGender(String gender) {
        return switch (gender) {
            case "Female" -> Gender.FEMALE;
            case "Male" -> Gender.MALE;
            default -> null;
        };
    }
}
