package com.singtel.rest.api;

import com.singtel.rest.api.utils.Constant;

public class Clownfish extends Fish {


    @Override
    public String bodyType() {
        return "small";
    }

    @Override
    public String bodyColor() {
        return "orange";
    }

    public void makeJoke() {
        System.out.println(Constant.I_MAKE_JOKES);
    }
}
