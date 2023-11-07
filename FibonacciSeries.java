package Day6Assign;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int reverseNum = reNum(num);
        System.out.println("Reversed number: " + reverseNum);
sc.close();
    }
    public static int reNum(int num){

        int reverseNum=0;
        while (num!=0)
        {
            int reminder = num%10;
            reverseNum=reverseNum*10+reminder;
            num=num/10;

        }
        return reverseNum;
    }
}

