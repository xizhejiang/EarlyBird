package com.algorithm.QuickSort;

import java.util.Collections;

/**
 * Created by AlexJIANG on 10/26/15.
 */
public class QuickSort{

    public static void sort(Comparable a[],int lo, int hi){
        if (lo >= hi)
            return ;
        int j = paritition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);


    }
    public static int paritition(Comparable[]a, int lo, int hi){
        int i=lo;
        int j=hi+1;
        while(true){
            while(less(a[++i],a[lo]))
                if(i==hi)
                    break;
            while(less(a[lo],a[--j]))
                if(j==lo)
                    break;
            if(i>=j)
                break;
            excg(a,i,j);
        }
        excg(a,lo,j);
        return j;
    }

    public static boolean less(Comparable a, Comparable b){
        int temp = a.compareTo(b);
        //int result = temp;
        return temp<0?true:false;
    }
    public static void excg(Comparable [] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String args[]){
        Integer[] a = new Integer[] {2,4,1,23,12,34,14,55,33};
        sort(a, 0, a.length - 1);
        for(Integer b: a){
            System.out.println(b);
        }



    }
}
