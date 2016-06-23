package com.algorithm.Prepare;

public class ReverseInteger {
    public int reverse(int x) {
        int ret = 0;
        while(x!=0){
            if(Math.abs(ret) > Math.pow(2,31)/10){
                return 0;
             }
             ret = ret*10 + x%10;
             x/=10;
        }
       return ret;     
    }

}