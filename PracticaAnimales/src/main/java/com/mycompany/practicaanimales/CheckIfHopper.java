package com.mycompany.practicaanimales;

public class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a){
        return a.canHop();
    }
}

/*
#!java --source 11
public class SheBang {

    public static void main(String[] args) {

        System.out.println("Feliz día del niño!!!");

    }
}
*/
