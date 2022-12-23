package com.wearther.weartherapi.dto.enums;

public enum Gender {

    FEMALE(0),
    MALE(1);

    private final int gender;

    private Gender(int gender){
        this.gender = gender;
    }
}
