package com.huajie.educomponent.thoughtworks;

public enum PriceConvertEnum {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int price;

    PriceConvertEnum(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
