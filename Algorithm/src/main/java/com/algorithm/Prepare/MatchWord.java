package com.algorithm.Prepare;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by AlexJIANG on 10/28/15.
 */
public class MatchWord {
    public static void main(String args[]){
        String temp = "hello hi hello hi this is a test hello!";
        String[] tempArray= temp.split(" ");
        System.out.println(tempArray.length);
        HashMap <String,Integer> map = new HashMap<String,Integer>();
        for(String word:tempArray){
            if (map.containsKey(word))
                map.put(word,map.get(word)+1);
            else{
                map.put(word,1);
            }
        }
        System.out.println(map.get("hello"));

    }
}

