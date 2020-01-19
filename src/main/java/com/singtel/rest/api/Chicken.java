package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.Fly;
import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.Constant;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Chicken extends Bird implements Fly {
    public Chicken() {
        super(new SoundHelper(EnglishSound.CHICKEN));
    }

    public Chicken(SoundHelper soundHelper) {
        super(soundHelper);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    @Override
    public void canFly() {
        System.out.println(Constant.I_CANT_FLY);
    }
}
