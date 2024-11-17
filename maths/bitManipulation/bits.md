##### In java integer occupies 4 bytes it 32 bits 

In these 32 bits the rightmost bit represent weather the number is positive or negative 

if 1 negative and 0 positive 



Suppose we are storing numbers in 1 byte (8 bits)
The rightmost bit represent the sign and rest seven bit represent the value of a number 

10 ===> 00001010 

(-10) in binary is 2s complement of 10 
-10 ===> (11110110)2


### What about (-0)  (-0) = 0 
simply 2s complement of 0 = 0 


# Range of numbers 

### How many numbers can be stored in 1 byte 
1 byte = 8 bits ==> each bit can be 0 or 1 so 2^8 = 256 numbers

since rightmost bit represent the sign so only the rest seven bits are used to store magnitude 
2^7 = 128 
So range is -128 to 127

### Consider float in java
4 byte = 32 bits total 2^32
range -2^31 to 2^31-1


### short 
2 byte = 16 bits
reange = -2^15 to 2^15-1 including 0 
