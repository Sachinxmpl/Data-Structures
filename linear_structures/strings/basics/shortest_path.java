package linear_structures.strings.basics;

public class shortest_path {
    public static void main(String[] args) {
        String str = "WEENSWENSNESEN";
        System.out.println(path(str));
    }

    static double path(String str){
        int x =  0 ; 
        int y = 0 ; 
        for ( int i = 0 ;i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == 'E'){
                x++;
            }
            else if(ch == 'W'){
                x--;
            }
            else if(ch == 'N'){
                y++;
            }
            else if(ch == 'S'){
                y--;
            }
        }
        return (Math.sqrt(x*x + y*y));
    }
}
