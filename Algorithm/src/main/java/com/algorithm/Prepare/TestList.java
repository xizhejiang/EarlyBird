package Prepare;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AlexJIANG on 11/29/15.
 */
public class TestList {
    static List<Integer> list=new ArrayList<Integer>();
    public static void main(String args[]){
        for(int i=0; i<10; i++) {
            list.add(i);
        }

        for(Integer in:list){
            list.remove(in);
        }
    }



}
