/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.basics;


/**
 *
 * @author v-andick
 */
public class Dog implements Pet {
    String name;
    int age;
    String[] fetchedItems ={"bone", "stick","ball"};
    private int fetchCounter = 0 ;
    public Dog(String name,int age ){
        this.name=name;
        this.age=age;
    }
    public void bark(){
        System.out.println("Woof");
    }
    public int getDogYears(){
        return this.age*7;
    }
    public void getFetchedItems(){
        //
        this.fetchCounter=(this.fetchCounter+1)%3;
        String item = this.fetchedItems[this.fetchCounter];
        System.out.println("The dog fetched the "+ item);
    }
    public void play(){
        System.out.println("The dog plays fetch with owner");
    }
    
}
