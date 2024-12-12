While creating arrays 

int[] arr = new arr[5] ; 


int a  ; 

why we don't use new operator with primitive 

Unlike objects , primitives are created in stack memory 

int b = 10 ; 

In stack primitive varaible b is created 
//no created in heap to reduce unecessary memory useusage 



### Primitive final 
final int a = 10 ;
//nothig in world can change a 


//Here final makes sure that kunal points to same object but the value of object can be changed
final Student kunal = new Student("kunal")
kunal.name = "sachin"

