package com.algorithm.Prepare;

/**
 * Created by AlexJIANG on 12/23/15.
 */
public class Duplicate {
    public static int rDuplicate(int[] array, int len){
        int i=1,j=0;
        for(;i<len;i++){
            if(array[j]!=array[i])
                array[++j]=array[i];
        }
        return j+1;

    }
    public static int rDuplicateCount(int[] array, int len){
        int i=1;
        int j=0;
        int count=1;
        for(;i<len;i++){
            if(array[i]==array[j])
                count++;
            else{
                count=1;
            }
            if(count<3) {
                array[++j] = array[i];
               // System.out.println(array[j]);

            }

        }
        return j+1;

    }
    public static void main(String args[]){
        int a[]={1,2,2,2,3,5,5,6};
        //System.out.println(rDuplicate(a,8));
        System.out.println(rDuplicateCount(a,8));

    }
}
