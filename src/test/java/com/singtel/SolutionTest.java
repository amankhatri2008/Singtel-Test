package com.singtel;

import com.singtel.rest.api.*;
import com.singtel.rest.api.helper.SoundHelper;
import com.singtel.rest.api.countingAnimals.AnimalCount;
import com.singtel.rest.api.utils.enmus.EnglishSound;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforAll - Executes");
    }

    @BeforeEach
    public void init() {
        System.out.println("@BeforeEach - Executes");
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }


    @Test
    public void fly() {
        new Duck().canFly();
        assertThat(outContent.toString(), containsString("flying"));
        new Parrot().canFly();
        assertThat(outContent.toString(), containsString("flying"));

    }

    @Test
    public void walk() {

        new Bird().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Chicken().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Duck().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Rooster().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));

    }



    @Test
    public void sing() {
        new Bird().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new Duck().callSound();
        assertThat(outContent.toString(), containsString("Quack, quack"));
        new Chicken().callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));

        new Chicken(new SoundHelper(EnglishSound.CHICKEN)).callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
        new Rooster().callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));

        new Dog(new SoundHelper(EnglishSound.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new Cat(new SoundHelper(EnglishSound.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));

        new Parrot().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new Parrot(new SoundHelper(EnglishSound.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new Parrot(new SoundHelper(EnglishSound.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));
        new Parrot(new SoundHelper(EnglishSound.ROOSTER)).callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));



    }
    @Test
    public void bodyColor() {
        assertEquals(new Fish().bodyColor(), null);
        assertEquals(new Shark().bodyColor(), "grey");
        assertEquals(new Clownfish().bodyColor(), "orange");

    }

    @Test
    public void swim() {
        new Duck().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
        new Fish().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
        new Dolphin().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
    }


    @Test
    public void extraFishTest() {
        new Shark().canEat();
        assertThat(outContent.toString(), containsString("I eat fish"));
        new Clownfish().makeJoke();
        assertThat(outContent.toString(), containsString("I make jokes"));
    }

    @Test
    public void bodySize() {
        assertEquals(new Fish().bodyType(), null);
        assertEquals(new Shark().bodyType(), "large");
        assertEquals(new Clownfish().bodyType(), "small");
    }



    @Test
    public void CountingAnimals() {

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
        AnimalCount animalCount = new AnimalCount(animals);

        assertEquals(animalCount.getFlyingAnimal(), 5);
        assertEquals(animalCount.getWalkingAnimal(), 8);
        assertEquals(animalCount.getSpeakingAnimal(), 8);
        assertEquals(animalCount.getSwimingAnimal(), 6);


    }

}