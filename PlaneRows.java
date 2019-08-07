/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.basics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author v-andick
 */
public class PlaneRows {
    
    public int solution(int N, String S) {

        String[] occupied = S.split(" ");
        
        //turn string into map to make it easier to check across the row
        int total=N*3;
        Map<Integer, String> map = getMap(occupied);
               
        //loop through each row
        for(int key: map.keySet()){
            String[] col = map.get(key).split("");
            // Using int instead of boolean so I could add them together
            // instead of counting number of true
            int group1=0;
            int group2=0;
            int group3=0;
            
            for(String seat : col){
                List<String> list = new ArrayList();
                switch(seat.toUpperCase()){
                    // skip if a, b, c, h, j ,k in the row
                    case "A" :
                    case "B" :
                    case "C" :
                        group1=1;
                        break;    
                    case "H" :
                    case "J" :
                    case "K" :
                        group3=1;
                        break; 
                    case "D" :
                    case "E" :
                    case "F" :
                    case "G" :
                        list.add(seat);
                        break; 
                }
                // Conditions when the middle set of seats is fill
                // Check if the end seat is taken and one other
                // or if e and f are taken
                boolean endPlusOne = (list.contains("D") || list.contains("G")) && list.size()>1;
                boolean middle = list.contains("E") || list.contains("F");
                if( endPlusOne || middle){
                    group2=1;
                }
                total=total-group1-group2-group3;
            }
        }
    
        return total;   
    }
    
    private Map<Integer, String> getMap(String[] occupied){
        Map<Integer, String> map= new HashMap<Integer, String>();
        for(String seat:occupied){
            String seatCol= seat.substring(seat.length()-1);   
            int seatRow= Integer.parseInt(seat.substring(0,seat.length()-1));
            String current = map.get(seatRow); 
            if (current != null){
                current=current+seatCol;
                map.put(seatRow,current);
            } else{
                map.put(seatRow,seatCol);
            }
        }
        return map;
    }
}
