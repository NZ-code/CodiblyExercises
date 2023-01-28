package org.example;

import java.util.List;

public class BubbleSort {
    public static List<Comparable> sort(List<Comparable> input){
        if(input == null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        int size = input.size();
        for(int i =0; i< size -1;i++){
            Boolean sortedFlag = true;
            for(int j = 0; j < size-1 -i; j++){

                Comparable c1 =input.get(j);
                Comparable c2 =input.get(j+1);
                if(c1 == null){
                    input.remove(input.get(j));
                    continue;
                }
                if((c1 ).compareTo(c2 ) >=0){
                    sortedFlag = false;
                    swap(j,j+1,input);
                }
            }
            if(sortedFlag == true){
                break;
            }
        }
        return input;
    }
    private static void swap(int index1,int index2, List<Comparable> input){
        var tmp = input.get(index1);
        input.set(index1, input.get(index2));
        input.set(index2, tmp);
    }
}
