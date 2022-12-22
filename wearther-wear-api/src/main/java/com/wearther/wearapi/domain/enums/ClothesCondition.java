package com.wearther.wearapi.domain.enums;

public enum ClothesCondition {
    THIN(0),
    NORMAL(1),
    THICK(2);

    private final int clothesCondition;

    private ClothesCondition(int clothesCondition){
        this.clothesCondition = clothesCondition;
    }
}
