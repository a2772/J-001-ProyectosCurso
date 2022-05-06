/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptions;

/**
 *
 * @author paris
 */
public class TestArray {
    int[] intArray;
    public TestArray(int size){
        intArray = new int[size];
    }
    public void addElement(int index, int value){
        intArray[index]=value;
    }
}
