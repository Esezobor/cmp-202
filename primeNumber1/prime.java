package primeNumber;
import java.util.Scanner;
public class prime {
	public static void main(String arg[]){
	int temp;
	Scanner input =new Scanner (System.in);
	System.out.println("Please enter a number: ");
	int num =input.nextInt();
	int i;
	for(i=2;i<num/3;i++);
	temp=num%i;
	if (temp==0){
		System.out.println(num+" Is not a prime number");
	}
	else if(temp!=0) {
		System.out.println(num+" Is a prime number");
	}
	}

}
