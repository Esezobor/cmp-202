package primeNumber;
import java.util.Scanner;
public class prime {
	public static void main(String arg[]){
	int temp;
	Scanner input =new Scanner (System.in);
	System.out.println("Please enter a number: ");
	int num =input.nextInt();
	int i;
	for(i=2;i<num/5;i++);
	temp=num%i;
	if (temp==0){
		System.out.println("false");
	}
	else if(temp!=0) {
		System.out.println("True");
	}
	}

}
