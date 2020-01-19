package com.singtel.rest.api.restControllers;

import com.singtel.rest.api.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AnimalRestControllerTest {
    @Test
   public void getFlyingAninmalCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Cat()
        };
        int flyingAnimalCount = new AnimalResourceController().getFlyingAnimalCount(animals);
        assertEquals(flyingAnimalCount, 5);
    }

}