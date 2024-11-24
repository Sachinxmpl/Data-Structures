package OOP.lecture2;

//singeletonClass can have only one instance(object)

public class singletonClass {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        //both obj1 , obj2 point to same object 
    }
}


class Singleton{
    //make the constructor private if you don't want to create many objects 
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        //i have to return instance
        if(instance == null){
            instance = new Singleton();
        }else{
           
        }
        return instance ; 
    }
}