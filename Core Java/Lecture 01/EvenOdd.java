import java.util.Scanner;
public class EvenOdd{
	public static void main(String args[]){
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a % 2 == 0) System.out.println("The given number is even.");
		else System.out.println("The given number is odd.");
	}
}