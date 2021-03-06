package com.singtel.rest.api.restControllers;


import com.singtel.rest.api.Animal;
import com.singtel.rest.api.countingAnimals.AnimalCount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalResourceController {
    @RequestMapping(method = RequestMethod.GET, value = "/animal/getFlyingAnimalCount")
    @ResponseBody
    public int getFlyingAnimalCount(@RequestBody Animal[] animals) {
        AnimalCount animalCount = new AnimalCount(animals);
        int flyingAnimal = animalCount.getFlyingAnimal();
        return flyingAnimal;
    }
}
