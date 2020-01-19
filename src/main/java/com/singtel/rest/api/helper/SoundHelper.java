package com.singtel.rest.api.helper;

import com.singtel.rest.api.utils.enmus.EnglishSound;

public class SoundHelper {
    private EnglishSound englishSound;

    public SoundHelper(EnglishSound englishSound) {
        this.englishSound = englishSound;
    }

    public void makeSound() {
        System.out.println(englishSound.getSound());
    }
}
