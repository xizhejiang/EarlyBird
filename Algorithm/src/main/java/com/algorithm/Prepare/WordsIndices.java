package com.algorithm.Prepare;

import java.util.*;

/**
 * Created by AlexJIANG on 3/19/16.
 */

public class WordsIndices {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<String, Integer> map= new HashMap<String, Integer>();
        for(String word:words){
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word,1);
            }
        }
        int l=words.length; int sl=s.length(); int wl=words[0].length();
        int i=0;
        while(sl-i>=wl*l){
            HashMap<String,Integer> match = new HashMap<>(map);
            for(int j=0;j<l;j++){
                String str;
                if(match.containsKey((str=s.substring(i+j*wl,i+(j+1)*wl)))){
                    if(match.get(str)==1){
                        match.remove(str);
                    }else{
                        match.put(str,match.get(str)-1);
                    }
                }else{
                    break;
                }
            }
            if(match.size()==0){
                res.add(i);
            }
            i++;
        }
        return res;

    }
}