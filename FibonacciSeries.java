package Day6Assign;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(perfectNum(num)){
            System.out.println("This perfect number");
        }
        else {
            System.out.println("This is not perfect number");
        }


    }

    public static boolean perfectNum(int num){
        if(num<1){
            return false;
        }
        int sum=0;
        for(int i=0;i<num;i++){
            if(num%2==0){
                sum+=i;
            }

        }
        return sum==num;
    }
}
