package org.launchcode.java.studios.chpthree;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Stream;

public class CountingCharacters {
    public static void main(String[] args){
        String s="hello dave";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(charCountMap.containsKey(s.charAt(i))){
                charCountMap.put(s.charAt(i),charCountMap.get(s.charAt(i))+1);
            }else{
                charCountMap.put(s.charAt(i),1);
            }
        }

        for (Map.Entry<Character, Integer> character : charCountMap.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

        //for (Map.Entry<Character, Integer> character : charCountMap.entrySet().stream().sorted(Map.Entry.<Character,Integer>comparingByKey()) ) {
        //    System.out.println(character.getKey() + ": " + character.getValue());
        //}
        // NOT SORTED
        //charCountMap=(HashMap<Character,Integer>()) charCountMap.entrySet().stream().sorted();
        //charCountMap.entrySet().stream().sorted();
        //Map<String, Integer> lengthMap
         //       = charCountMap.entrySet().stream().sorted()
        //        .collect(Collectors.toMap(
        //                value
         //                       -> value,
        //                value -> value.length()));
        for (Map.Entry<Character, Integer> character : charCountMap.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }
}
