package com.algorithm.Prepare;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by AlexJIANG on 11/30/15.
 */
public class HMP {


    public static void main(String args[]){
        System.out.println(((Object) new HMP()).getClass());
        Map<String,Object> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        String m1=new String("m");
        String m2=new String("m");
        map.put(m1,m2);
        set.add(m2);
        Object o=new Object();

        System.out.println(map.containsKey(m2));
        System.out.println(map.containsValue(m1));
        System.out.println(set.contains(m1));
        System.out.println(m1.hashCode()+":"+m2.hashCode());


    }
}
