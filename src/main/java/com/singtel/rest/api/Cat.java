package com.singtel.rest.api;

import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Cat extends Mammal {
    public Cat() {
        super(new SoundHelper(EnglishSound.CAT));
    }

    public Cat(SoundHelper soundHelper) {
        super(soundHelper);
    }
}
