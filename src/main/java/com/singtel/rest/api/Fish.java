package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.BodyType;
import com.singtel.rest.api.characterstics.Swim;
import com.singtel.rest.api.utils.Constant;

public class Fish extends Animal implements Swim, BodyType {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public String bodyType() {
        return null;
    }

    public String bodyColor() {
        return null;
    }
}
