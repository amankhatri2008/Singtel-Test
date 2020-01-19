package com.singtel.rest.api;

import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.utils.enmus.EnglishSound;

public class Dog extends Mammal {
    public Dog() {
        super((new SoundHelper(EnglishSound.DOG)));
    }

    public Dog(SoundHelper soundHelper) {
        super(soundHelper);
    }
}
