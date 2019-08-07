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
public class Coin {
    public final static int HEADS= 0;
    public final static int TAILS= 1;
    private int faceUp;
    public Coin(int start){
        faceUp= start;
    }
    public void flip(){
        Random rand = new Random();
        this.faceUp= rand.nextInt(2);
    }
    public String getFaceUp(){
        if(faceUp==HEADS){
            return "HEADS";
        } else if(faceUp==TAILS){
            return "TAILS";
        } else {
            return "Invalid";
        }
    }
    //        Coin c = new Coin(Coin.HEADS);
    //        System.out.println("inital: " + c.getFaceUp());
    //        for (int i=0; i<10; i++){
    //            c.flip();
    //            System.out.println("inital: " + c.getFaceUp());
    //        }

}
