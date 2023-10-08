package DemoGITTest;

public class Second_Largest_Number_In_Array_with_Dupes {

    public static void main(String[] args) {
        int[] a = {98,99,88,99,88,99,888,111}; 
        
        int temp ;  
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println("Second Largest element is " + a[1]);
    }
}