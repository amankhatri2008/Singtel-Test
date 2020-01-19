package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.Swim;
import com.singtel.rest.api.utils.Constant;

public class Dolphin extends Animal implements Swim {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
