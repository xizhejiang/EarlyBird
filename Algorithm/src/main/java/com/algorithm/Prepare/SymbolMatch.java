package Prepare;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by AlexJIANG on 11/30/15.
 * Booking interview question
 */
public class SymbolMatch {
    Stack <Character> stack=new Stack<>();
    Map<Character,Character> syTable=null;
    public SymbolMatch(){
        this.syTable=createSYTable();
    }
    public SymbolMatch(HashMap<Character,Character> syTable){
        this.syTable=syTable;
    }

    private Map<Character,Character> createSYTable(){
        Map<Character,Character> temp=new HashMap<>();
        temp.put('<','>');
        temp.put('{','}');
        temp.put('[',']');
        temp.put('(',')');
        return temp;
    }

    public boolean match(String words){
        for(int i=words.length()-1;i>=0;i--) {
            Character temp = words.charAt(i);
            if ((temp - 'A' >= 0 && temp - 'A' <= 25) || (temp - 'a' >= 0 && temp - 'a' <= 25))
                continue;
            else{
                if(syTable.containsValue(temp))
                    stack.push(temp);
                else if(syTable.containsKey(temp))
                {
                    if(stack.size()==0)
                        return false;
                    if(!syTable.get(temp).equals(stack.pop()))
                        return false;
                }
                else
                    continue;
            }
        }
        if(stack.size()!=0)
            return false;
        return true;
    }
    public static void main(String args[]){
        SymbolMatch sm=new SymbolMatch();
        if(sm.match("({1{&*}(())})"))
            System.out.println("match");
        else
            System.out.println("not match");


    }
}
