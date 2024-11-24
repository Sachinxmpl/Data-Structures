package OOP.part3;

public class beautyOfInheritance {
    public static void main(String[] args) {
        Box box1 = new Boxweight(20, 10, 30);
        System.out.println(box1.length);
        System.out.println(box1.breadth);
        // System.out.println(box1.weight); error 
        //The type of reference variable determines which variable can be accessed

    }
}

class Box{
    int length ; 
    int breadth ; 
    public Box(int length , int breadth){
        // no error although Box is not child class 
        //but in java every class extends object Class 
        super(); //calls object class 
        this.length = length ; 
        this.breadth = breadth;
    }
    public Box(Box other) {
        this.length = other.length;
        this.breadth = other.breadth;
    }
}

class Boxweight extends Box{
    int weight ;

    public Boxweight(int l , int b , int w){
        super(l,b);
        weight = w ; 
    }

    Boxweight(Boxweight other){
        super(other);
        this.weight = other.weight;
    }

    public void print(){
        //super.length access the length of parent class with no conflict as well 
        System.out.println(super.length);
    }
}