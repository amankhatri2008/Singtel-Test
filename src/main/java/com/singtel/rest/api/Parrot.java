package com.singtel.rest.api;

import com.singtel.rest.api.characterstics.Fly;
import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.Constant;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Parrot extends Bird implements Fly {
    public Parrot() {
        super(new SoundHelper(EnglishSound.DEFAULT));
    }

    public Parrot(SoundHelper soundHelper) {
        super(soundHelper);
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
