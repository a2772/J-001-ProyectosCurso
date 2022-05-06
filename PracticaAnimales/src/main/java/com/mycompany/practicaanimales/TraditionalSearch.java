package com.mycompany.practicaanimales;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals=new ArrayList<Animal>();
        animals.add(new Animal("Kangoroo",true,false));
        animals.add(new Animal("Rabbit",true,false));
        animals.add(new Animal("Turtle",false,true));
        print(animals, new CheckIfSwimming());
        //print(animals, b->b.canSwim());
    }
    
    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal:animals){
            if(checker.test(animal)){
                System.out.println(animal+ " ");
            }
        }
    }
    
}
