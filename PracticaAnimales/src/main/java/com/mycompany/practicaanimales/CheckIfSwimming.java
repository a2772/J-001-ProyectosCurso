package com.mycompany.practicaanimales;

public class CheckIfSwimming implements CheckTrait{
    public boolean test(Animal a){
        return a.canSwim();
    }
}