/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.basics;

import java.util.Random;

/**
 *
 * @author v-andick
 */
public class Dice {
    Random rand;
    int previousRoll =-1;
    public Dice(){
        this.rand = new Random();
    }   
    public int roll(){
        int currentRoll = this.rand.nextInt(6)+1;
        previousRoll = currentRoll;
        return currentRoll;
    }
    //          Dice myDice = new Dice();
    //          System.out.println(myDice.roll());
    //          System.out.println(myDice.roll());
}
