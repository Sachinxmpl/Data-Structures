package others.HandlingLargeData.stringBuffer;

//we are not using string as unused object are created 
public class randomString {
    public static void main(String[] args) {
        String random = generateRandomString(12);
        System.out.println(random);
        System.out.println((int)(Math.random() * 26));
    }



    //its not making many objects but making changes in same 
    static String generateRandomString(int size){
        StringBuffer sb = new StringBuffer();
        for ( int i = 1 ; i <= size ; i++){
           int vl = 'a' + (int)(Math.random() * 26);
           sb.append((char)vl);
        }
        return sb.toString() ;
    }
}
