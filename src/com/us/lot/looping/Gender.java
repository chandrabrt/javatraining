package com.us.lot.looping;

/*
  @author : Chandra Khadka
  @since : 2021-01-17
*/
public enum Gender {
    M("MALE"),
    F("FEMALE"),
    O("OTHERS");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
