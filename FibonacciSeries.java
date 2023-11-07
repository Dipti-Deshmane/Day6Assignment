package Day6Assign;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of series");
        int length = sc.nextInt();
        for(int i=0;i<length;i++)
        {
            System.out.println(fibonacci(i));
        }
    }
public static int fibonacci(int num)
{
if(num<=1){
    return num;
}
return fibonacci(num-1)+fibonacci(num-2);
}



}





