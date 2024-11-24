package OOP.part4;

public class dataHiding {
    public static void main(String[] args) {
        
    }
}

class A{
    private int num ; 
    public String name ; 

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num ; 
    }
}


//protected , accessed in same package ,accessed by  sub class in different package
 