package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.Fly;
import com.singtel.rest.api.characterstics.Swim;
import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.Constant;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Duck extends Bird implements Swim, Fly {

    public Duck() {
        super(new SoundHelper(EnglishSound.DUCK));
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
