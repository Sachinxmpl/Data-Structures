## Take arr = 5 , 4, 3, 2 ,1 

 choose any pivot element 

 after first pass , all the elements less than pivot will be on left hand side of pivot and elements that are greater than pivot will be on right hand side of pivot 

The array might be sorted or not , but the pivot is at its correct position

Recurrsive take the lower part , choose new pivot and repeat 
If array length is 1 , return 




## How to put pivot at correct postion?
Take violation approach , s = 0 , end = arr.length - 1; and take a pivot 
s p     e
5 4 3 2 1 

check if(arr[s] > arr[p] and arr[e] < arr[p])