package com.singtel.rest.api;

import com.singtel.rest.api.utils.Constant;

public class Shark extends Fish {


    @Override
    public String bodyType() {
        return "large";
    }

    @Override
    public String bodyColor() {
        return "grey";
    }

    public void canEat() {
        System.out.println(Constant.I_EAT_FISH);
    }
}
