package com.wearther.weartherapi.dto.model;

import com.wearther.weartherapi.dto.enums.BodyPart;
import com.wearther.weartherapi.dto.enums.ClothesCondition;
import com.wearther.weartherapi.dto.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clothes {

private String url;
private String img;
private String name;
private float price;
private BodyPart bodyPart;
private ClothesCondition clothesCondition;
private Gender gender;
}
