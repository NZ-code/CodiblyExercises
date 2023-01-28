package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BalanceWordCounter {

    public static Integer count(String input){
        // all substrings = all subwords
        int cnt =0;
        for(int i=0;i<input.length();i++){
            for(int j = i; j<input.length();j++){
                var subStr = input.substring(i,j+1);
                if(checkBalanced(subStr)){
                    cnt+=1;
                }
            }
        }
        return cnt;
    }
    private static Boolean checkBalanced(String input){
        HashMap<Character, Integer> occurrencesMap = getOccurrencesMap(input);
        HashSet<Integer> uniqueOccurrences = new HashSet<>(occurrencesMap.values());
        if(uniqueOccurrences.size() > 1){
            return false;
        }
        return true;
    }

    private static HashMap<Character, Integer> getOccurrencesMap(String input){
        HashMap<Character, Integer> occurrencesMap = new HashMap<>();
        for(int i =0;i < input.length();i++){
            char c = input.charAt(i);
            if(!Character.isAlphabetic(c)) throw new IllegalArgumentException("Input should contain letters only");
            if(occurrencesMap.containsKey(c)){
                int prevCount = occurrencesMap.get(c);
                occurrencesMap.put(c, prevCount+1);
            }
            else{
                occurrencesMap.put(c,1);
            }
        }
        return occurrencesMap;
    }

}
