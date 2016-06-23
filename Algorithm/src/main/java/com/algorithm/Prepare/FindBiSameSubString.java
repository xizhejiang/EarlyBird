package Prepare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by AlexJIANG on 1/30/16.
 */
public class FindBiSameSubString {

    static private String findStr;
    Stack origin;
    Stack compare;
    public FindBiSameSubString(String testStr){
        this.findStr = testStr;
    }
    public String getFindStr() {
        return findStr;
    }

    public static void main(String args[]){
        FindBiSameSubString fss=new FindBiSameSubString("sbsdfssb");
        MatrixLinkedList mll = new MatrixLinkedList();
        String teststr = fss.getFindStr();
        for(char inputChr:teststr.toCharArray()){
            fss.addOrigin(inputChr);
        }


    }

    public void addOrigin(Character chr){
        origin.push(chr);
    }
    public void addCompare(Character chr){
        compare.push(chr);
    }
    public void popOrgin(Character chr){
        origin.pop();
    }
    public void popCompare(Character chr){
        compare.pop();
    }

    public boolean testIfmatch(){
        char ochr;
        char cchr;
        char middle=' ';
        int tail=-1;
        int length=-0;
        boolean startCompare=false;
        while (true){
            if(!origin.isEmpty()){
                cchr=(Character)origin.pop();
                if(startCompare){
                    if(cchr==(char)compare.peek()){
                        //probably occur issues
                        tail=origin.indexOf(cchr);
                        length+=2;
                    }
                }else{
                    compare.push(cchr);
                }
                if(cchr==(char)origin.peek()){
                    startCompare=true;
                }else{
                    char temp=(char)origin.pop();
                    if(cchr==(char)origin.peek()){
                        startCompare=true;
                    }else{
                        origin.push(temp);
                    }
                }
            }
        }
    }



}
class MatrixLinkedList{
    private ArrayList<LinkedList<Character>> matrix;
    public static ArrayList<LinkedList<Character>> create(){
        return new ArrayList<LinkedList<Character>>();
    }
    public boolean addLinkList(LinkedList<Character> ll){
        if(ll!=null){
            try{
                matrix.add(ll);
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }



}
