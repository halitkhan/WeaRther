package com.wearther.wearapi.service;

import com.wearther.wearapi.domain.enums.BodyPart;
import com.wearther.wearapi.domain.enums.ClothesCondition;
import com.wearther.wearapi.domain.enums.Gender;
import com.wearther.wearapi.domain.model.Clothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WearService {

    @Autowired
    ClothesService service;

    /*
    For Female
    Head : thick
    Accessory : thin, thick
    Jacket : normal, thick
    Top : thin, normal, thick
    Hand : thick
    Bottom : thin, normal
    Foot : thin, normal, thick
    One Piece : thin
    */

    /*
    For Male
    Head : thick
    Accessory : thin, thick
    Jacket : normal, thick
    Top : thin, thick
    Hand : thick
    Bottom : normal
    Foot : thin, normal, thick
     */

    public List<Clothes> wearClothes(String weatherCondition, String gender) {
        Map<String, List<Clothes>> mapClothes = getClothes();
        Random rand = new Random();
        List<Clothes> wearClothes = new ArrayList<>();
        int randomValue;
        if (Objects.equals(gender, "Female")) {
            if (Objects.equals(weatherCondition, "Freezing")) {
                wearClothes.add(getRandomClothes(mapClothes.get("thick_head_female")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_female")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_female")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_female")));
                wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
            } else if (Objects.equals(weatherCondition, "Cold")) {
                randomValue = rand.nextInt(6);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_head_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_head_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_head_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                    case 5:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                }
            } else if (Objects.equals(weatherCondition, "Cool")) {
                randomValue = rand.nextInt(9);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 5:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_head_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                    case 6:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 7:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 8:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_female")));
                        break;
                }
            } else if (Objects.equals(weatherCondition, "Warm")) {
                randomValue = rand.nextInt(9);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 5:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 6:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 7:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 8:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_one_piece_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                }

            } else if (Objects.equals(weatherCondition, "Normal")) {
                randomValue = rand.nextInt(7);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_one_piece_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_one_piece_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 5:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 6:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_one_piece_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                }

            } else {
                randomValue = rand.nextInt(6);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_one_piece_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_one_piece_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_female")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_bottom_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                    case 5:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_one_piece_female")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_female")));
                        break;
                }

            }
        } else {
            if (Objects.equals(weatherCondition, "Freezing")) {
                wearClothes.add(getRandomClothes(mapClothes.get("thick_head_male")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_male")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_male")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_male")));
                wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
            } else if (Objects.equals(weatherCondition, "Cold")) {
                randomValue = rand.nextInt(6);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_head_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_head_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_head_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
                        break;
                    case 5:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_hand_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
                        break;
                }
            } else if (Objects.equals(weatherCondition, "Cool")) {
                randomValue = rand.nextInt(4);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                }
            } else if (Objects.equals(weatherCondition, "Warm")) {
                randomValue = rand.nextInt(5);
                switch(randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_male")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                }
            } else if (Objects.equals(weatherCondition, "Normal")) {
                randomValue = rand.nextInt(5);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_male")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_male")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_male")));
                        break;
                    case 4:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                }
            } else {
                randomValue = rand.nextInt(4);
                switch (randomValue){
                    case 0:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_male")));
                        break;
                    case 1:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_foot_male")));
                        break;
                    case 2:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_top_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_foot_male")));
                        break;
                    case 3:
                        wearClothes.add(getRandomClothes(mapClothes.get("thin_accessory_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_jacket_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("normal_bottom_male")));
                        wearClothes.add(getRandomClothes(mapClothes.get("thick_foot_male")));
                        break;
                }
            }
        }
        return wearClothes;
    }

    private Map<String,List<Clothes>> getClothes() {
        Map<String, List<Clothes>> clothesMap = new HashMap<>();
        for (BodyPart bodyPart : BodyPart.values()) {
            for (ClothesCondition clothesCondition : ClothesCondition.values()) {
                for (Gender gender : Gender.values()) {
                    List<Clothes> wearClothes = getWearClothes(bodyPart, clothesCondition, gender);
                    clothesMap.put(clothesCondition.toString().toLowerCase() + "_" +
                            bodyPart.toString().toLowerCase() + "_" +
                            gender.toString().toLowerCase(), wearClothes);
                }
            }
        }

        return clothesMap;
    }

    private List<Clothes> getWearClothes(BodyPart bodyPart, ClothesCondition clothesCondition, Gender gender) {
        List<Clothes> clothesList = service.getClothesFromCsv();
        List<Clothes> wearClothesList = new ArrayList<>();
        for(Clothes clothes : clothesList){
            if(clothes.getBodyPart() == bodyPart
                    && clothes.getClothesCondition() == clothesCondition
                    && clothes.getGender() == gender){
                wearClothesList.add(clothes);
            }
        }
        return wearClothesList;
    }

    private Clothes getRandomClothes(List<Clothes> clothesList) {
        Random rand = new Random();
        return clothesList.get(rand.nextInt(clothesList.size()));
    }

}
