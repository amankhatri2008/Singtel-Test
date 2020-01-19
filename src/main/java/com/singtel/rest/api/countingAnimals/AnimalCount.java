package com.singtel.rest.api.countingAnimals;

import com.singtel.rest.api.Animal;
import com.singtel.rest.api.characterstics.Fly;
import com.singtel.rest.api.characterstics.Speak;
import com.singtel.rest.api.characterstics.Swim;
import com.singtel.rest.api.characterstics.Walk;


public class AnimalCount {
    Animal[] animals;
    int speakingAnimal = 0;
    int swimingAnimal = 0;
    int flyingAnimal = 0;
    int walkingAnimal = 0;



    public AnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Fly) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof Speak) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof Swim) {
                swimingAnimal += 1;
            }
            if (animals[i] instanceof Walk) {
                walkingAnimal += 1;
            }

        }
    }
    public int getSpeakingAnimal() {
        return speakingAnimal;
    }

    public void setSpeakingAnimal(int speakingAnimal) {
        this.speakingAnimal = speakingAnimal;
    }

    public int getSwimingAnimal() {
        return swimingAnimal;
    }

    public void setSwimingAnimal(int swimingAnimal) {
        this.swimingAnimal = swimingAnimal;
    }

    public int getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(int flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public int getWalkingAnimal() {
        return walkingAnimal;
    }

    public void setWalkingAnimal(int walkingAnimal) {
        this.walkingAnimal = walkingAnimal;
    }


}
