package linear_structures.strings.syntax_memory;

public class stringjava {
        public static void main(String[] args) {
                String name = "Sachin khatri" ; 

                String a = "sachin" ; 
                a = "khatri";


               
        }
}


// String is one of the most used class of java 
// every string you create is an object of type String 

// String name = "Sachin khatri" ; 
// Datatype(ClassName) referenceVariable = object


//Memory management of Strings  , string pool
// String a = "Sachin khatri" 
// reference varaible a is created in stack which point to object "Sachin khatri" in heap memory . Object "Sachin khatri" exists in separate string pool inside the heap memory 

// String b = "Sachin khatri"  
// since another reference varaible b is created , it poinsts to same object of string pool 
//same objects are not created again and again , only one copy exists in string pool


//?Immutability 
// string objects are immutalble , because many reference variable might point to same object . 
// String a = "Sachin khatri" 
// here object "Sachin khatri" is now immutable as there can be String b = "Sachin khatri"

// String a = "Sachin" ; 
// a = "khatri"

// Here i am not modifying object "Sachin" , new object "khatri" is created and now a  just points to "Khatri" not "Sachin"
