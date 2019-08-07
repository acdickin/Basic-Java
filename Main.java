/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.basics;

import java.awt.Color;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author v-andick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Move commented code from examples
//        Predicate isOdd = n ->n%2 !=0;
//        System.out.println(isOdd.test(3));
//        System.out.println(isOdd.test(4));
//        Predicate isEven = n ->n%2 ==0;
//        System.out.println(isEven.test(4));
//        System.out.println(isEven.test(3));
        PlaneRows pr = new PlaneRows();
        System.out.println(pr.solution(3,"1B 2F"));
    }
}

