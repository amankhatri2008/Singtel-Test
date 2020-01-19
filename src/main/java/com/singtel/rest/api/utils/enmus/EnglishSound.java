package com.singtel.rest.api.utils.enmus;

public enum EnglishSound {
    DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CATERPILLAR("caterpillar"),
    CAT("Meow"),
    DEFAULT("I am singing"),
    NO_SOUND("");
    private String sound;

    EnglishSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
