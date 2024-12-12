package OOP.part6.Comparing;
import java.util.* ; 

public class main {
    public static void main(String[] args) {
        Student kunal = new Student(23, 99.5f);
        Student sachin = new Student(40,30.01f) ; 
        Student karan = new Student(1, 88.4f) ; 
        Student bhim = new Student(4, 89.4f) ; 

        if(kunal.compareTo(sachin) > 0){
            System.out.println("Work hard sachin");
        }else{
            System.out.println("Will execute this condition");
        }

        Student[] list = {kunal , sachin , karan , bhim} ; 
        Arrays.sort(list) ; 
        //sorted array based on marks 
        System.out.println(Arrays.toString(list));
    }
}
