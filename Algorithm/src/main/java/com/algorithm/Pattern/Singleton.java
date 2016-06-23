package Pattern;

/**
 * Created by AlexJIANG on 12/15/15.
 */
class Singleton {
    private static volatile Singleton instance=null;



    private int count=0;
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();

                }

            }
        }
        return instance;

    }
    public int getCount() {
        count++;
        return count;
    }

}

