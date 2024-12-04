package others.HandlingLargeData.stringBuffer;


public class main {
    public static void main(String[] args) {

        //contructor 1 
        StringBuffer sb = new StringBuffer();
        sb.append("we make devs");
        System.out.println(sb.toString());

        //constructor 2 
        StringBuffer sb2 = new StringBuffer("sachin khatri");
        sb2.append(" is good");
        System.out.println(sb2.toString());

        //constructor 3
        //initailize inital size 
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb3.insert(0, "rahul");
        System.out.println(sb3.toString());

    }
}


//? StringBuffer is mutable set of characters

//?Advantages
//Can edit object without making new object 
//Ofcourse more efficient than string as mutable 
//Thread safe

//IF any one thread is working on StringBuffer than it prevents other threads working on it 
//Meaning it is thread safe 
//ONly one thread on a data so slow 

//StringBuilder are also imutable but are not thread safe 
//StringBUilder are faster than StringBuilder as multithreading supported