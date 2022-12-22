package com.wearther.wearapi.domain.model;

import com.wearther.wearapi.domain.enums.BodyPart;
import com.wearther.wearapi.domain.enums.ClothesCondition;
import com.wearther.wearapi.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Clothes {
    private String url;
    private String img;
    private String name;
    private float price;
    private BodyPart bodyPart;
    private ClothesCondition clothesCondition;
    private Gender gender;

}
