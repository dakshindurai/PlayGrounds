package com;

public class NestedLoopPlay {
    public static void main(String[] args){
        /*
        Declaring a multidimensional array
         */
        int[][] twoDimeArray = {{1,2,3,4},{5,6,7}};
        NestedLoopPlay obj1 = new NestedLoopPlay();
        obj1.Print2D(twoDimeArray);
        }
        public void Print2D(int[][] twoDimeArray){
            for (int i=0; i< twoDimeArray.length;i++){
                for (int j=0; j<twoDimeArray[i].length; j++){
                    System.out.println(twoDimeArray[i][j]);
                }
            }
    }
}