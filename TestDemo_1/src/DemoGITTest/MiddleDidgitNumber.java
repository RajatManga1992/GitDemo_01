package DemoGITTest;

public class MiddleDidgitNumber
{  
//function that finds the mid-digit  
static int middleDigitNumber(int mid_digit)  
{  
//determines the total number of digits or length of the given number  
int total_digits = (int)Math.log10(mid_digit) + 1;  
//determines the middle digit  
mid_digit = (int)(mid_digit / Math.pow(10, total_digits / 2)) % 10;  
//returns the mid digit  
return mid_digit ;  
}  
//driver Code  
public static void main(String args[])  
{  
//number whose mid digit is to be find  
int num = 12534;  
//calling the user-defined function and prints the mid digit  
System.out.println("The middle digit number is: "+ middleDigitNumber(num));  
}  
}  