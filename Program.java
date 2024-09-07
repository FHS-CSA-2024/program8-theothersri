//import stuff here
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int diff = 0;
        int dist = 0;
        int prod = 0;
        int sum = 0;
        double avg = 0;
        int min = 0;
        int max = 0;
        
        
        
        System.out.println("Enter first number: ");
        n1 = myScanner.nextInt(); 
        
        System.out.println("Enter second number: ");
        n2 = myScanner.nextInt(); 
        
        
        //Original num
        System.out.println("Original numbers are " +n1 +" and " + n2);
        
        //distance
        dist = n1-n2;
        System.out.println("Distance = "+dist);
        
        //difference
        diff = Math.abs(dist);
        System.out.println("Difference = "+diff);
        
        //sum
        sum = n1+n2;
        System.out.println("Sum = "+sum);
        
        //product
        prod = n1*n2;
        System.out.println("Product = "+prod);
        
        //avg
        avg = (double)(n1+n2)/2;
        System.out.println("Average = "+avg);
        
        //min
        if (n1<n2){
            min = n1;
            max = n2;
        }
        else{
            min = n2;
            max = n1;
        }

    }
}
//Paste console output below:
/*

Enter first number: 
13
Enter second number: 
20
Original numbers are 13 and 20
Distance = -7
Difference = 7
Sum = 33
Product = 260
Average = 16.5

*/
