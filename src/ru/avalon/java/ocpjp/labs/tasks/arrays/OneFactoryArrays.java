/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author 
 */
public class OneFactoryArrays implements Factory<int[]>{

    @Override
    public int[] create() {
        int RandomLenght = 10 + (int)(Math.random()*10);
        int[] arr = new int[RandomLenght];
        for (int i = 0; i < RandomLenght; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    } 
        
}
