package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.Speak;
import com.singtel.rest.api.characterstics.Walk;
import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.Constant;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public abstract class Mammal extends Animal implements Walk, Speak {
    private SoundHelper soundHelper;

    public Mammal() {
        this.soundHelper = new SoundHelper(EnglishSound.DEFAULT);
    }

    public Mammal(SoundHelper soundHelper) {
        this.soundHelper = soundHelper;
    }

    public void callSound() {
        soundHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
