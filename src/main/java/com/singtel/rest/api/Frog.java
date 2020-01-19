package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.Speak;
import com.singtel.rest.api.characterstics.Swim;
import com.singtel.rest.api.characterstics.Walk;
import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.Constant;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Frog extends Animal implements Swim, Walk, Speak {
    SoundHelper soundHelper;

    public Frog() {
        soundHelper = new SoundHelper(EnglishSound.DEFAULT);
    }

    public Frog(SoundHelper soundHelper) {
        soundHelper = soundHelper;
    }

    public void callSound() {
        soundHelper.makeSound();
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
