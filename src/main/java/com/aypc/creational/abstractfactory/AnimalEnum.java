package com.aypc.creational.abstractfactory;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnimalEnum {
    dog("dog"),
    duck("duck");

    private final String code;

}
