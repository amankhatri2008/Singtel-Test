package com.singtel.rest.api;

import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Rooster extends Chicken {

    SoundHelper soundHelper;

    public Rooster() {
        this.soundHelper = new SoundHelper(EnglishSound.ROOSTER);
    }


    @Override
    public void canFly() {
        super.canFly();
    }

    @Override
    public void callSound() {
        System.out.println(EnglishSound.ROOSTER.getSound());

    }
}
