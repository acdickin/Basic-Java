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
public class Insect {
    int age;
    int numberOfLegs;
    public Insect( int age, int numberOfLegs){
        this.age = age;
        this.numberOfLegs= numberOfLegs;
    }
    public void says(){
        System.out.println("...");
    }
    public void crawl(){
        System.out.println("The inscet crawled");
    }
    // Inheritance example
//        Insect insect = new Insect(5, 6);
//        Spider spider = new Spider(13, true);
//        Cricket cricket = new Cricket(2, 1.25);
//        insect.crawl();
//        insect.says();
//
//        spider.crawl();
//        spider.says();
//
//        cricket.jump();
//        cricket.says();
//        cricket.crawl();
//      
//        if (spider instanceof Insect && spider instanceof Spider){
//            System.out.println("spider is an insect");
//        }
}
