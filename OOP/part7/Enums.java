package OOP.part7;

public class Enums {
    enum Week{
        Monday , 
        Tuesday , 
        Wednesday , 
        Thursday , 
        Friday , 
        Saturday , 
        Sunday ;
    }
    //these are enums constants 
    //they are static and final by default 

    public static void main(String[] args) {
        Week day1 ; 
        day1 = Week.Monday ; 
        System.out.println(day1);

        System.out.println("___________");

        for ( Week day : Week.values()){
            System.out.println(day);
        }
    }
}
