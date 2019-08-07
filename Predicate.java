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
public interface Predicate {
    boolean test(int n);
}
//Predicate isOdd = n ->n%2 !=0;
//System.out.println(isOdd.test(3));
//Predicate isEven = n ->n%2 ==0;
//System.out.println(isEven.test(4));