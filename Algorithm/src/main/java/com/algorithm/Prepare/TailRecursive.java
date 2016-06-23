package Prepare;

/**
 * Created by AlexJIANG on 10/28/15.
 */
public class TailRecursive {

    public static int tailRecursiveFactorial(int n,int total){
        if (0==n){
            return total;
        }
        return tailRecursiveFactorial(1,n*total);
    }



    public static int tailRecursiveAdd(int n,int total){

        if(n==1){
            return total+1;
        }
        return tailRecursiveAdd(n-1,n+total);
    }

    public static int RecursiveAdd(int n){
        if (n==0)
            return 0;
        return n+RecursiveAdd(n-1);
    }

    public static void main(String []args){
        System.out.println(tailRecursiveAdd(10,0));
    }
}
