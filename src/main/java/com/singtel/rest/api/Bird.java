package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.Fly;
import com.singtel.rest.api.characterstics.Speak;
import com.singtel.rest.api.characterstics.Walk;
import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.Constant;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Bird extends Animal implements Walk, Speak, Fly {

    private SoundHelper soundHelper;

    public Bird() {
        this.soundHelper = new SoundHelper(EnglishSound.DEFAULT);
    }

    public Bird(SoundHelper soundHelper) {
        this.soundHelper = soundHelper;
    }

    public void callSound() {
        soundHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }


    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
