package com.company;
public class Main {
    public static void main(String[] args) {
        int[]myList = {2, 3, 42, 45, 96, 102, 322, 343, 545, 645, 664, 757};
        int key = 45;

        int pos = binarySearching(myList, key);
        if(pos < 0) {
            System.out.println("Input " + key + " is NOT found in the list");
         }
        else{
            System.out.println("Input "+ key +" is found in the list at " + pos);
        }
    }
    //overload method
    public static int binarySearching(int[] arrayExample, int keys){
        int low = 0; int high = arrayExample.length - 1;
        while (high >= low){
            int mid = (high + low) / 2;
            if(keys < arrayExample[mid]){
                high = mid - 1;
            }else if(keys == arrayExample[mid]){
                return mid;
            }else
                low = mid + 1;
        }
        return -1;
    }
}
