import java.util.Scanner;
/****************************************************************************************
when the class is declared as public, then 						*
the class name and the file name should be the 						*
same. if the class is not declared public, you 						*
can compile the program with javac filename.java,					*
you should run the program with the following command					*
java ClassName instead of FileName							*
example											*
-------											*
F:\Lang\Java\NIIT CJEA06\Core Java\Lecture 01>javac add.java				*
add.java:4: error: class Add is public, should be declared in a file named Add.java	*
public class Add{									*
       ^										*
1 error											*
											*
F:\Lang\Java\NIIT CJEA06\Core Java\Lecture 01>javac add.java				*
											*
F:\Lang\Java\NIIT CJEA06\Core Java\Lecture 01>java Add					*
Enter first number: 123									*
Enter second number: 123								*
The sum of two numbers is: 246								*
****************************************************************************************/
class Add{
	public static void main(String args[]){
		System.out.print("Enter first number: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		int c = a + b;
		System.out.println("The sum of two numbers is: "+c);
	}
}