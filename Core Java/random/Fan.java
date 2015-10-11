import java.util.Scanner;
import static java.lang.System.out;
import java.lang.Exception;
public class Fan{
	public static void main(String... x){
		out.print("Please choose a number between 1 to 6: ");
		Scanner scanner = new Scanner(System.in);
		try{			
			int a = scanner.nextInt();
			if(a>0 && a <= 6){
				out.println("Multiplying the number by 3");
				int temp = a * 3;
				int product = temp;
				out.println("the product is: "+product);
				temp = product + 2;
				product = temp * 3;
				out.println("The product is: "+product);
				int firstNo = product % 10;
				int secondNo = product / 10;
				int sum = firstNo + secondNo;
				out.println("The sum is: "+sum);
				switch(sum){
					case 1: out.println("You are VIJAY's Fan");
						break;
					case 2: out.println("You are AJITH's Fan");
						break;
					case 3: out.println("You are VIKRAM'S Fan");
						break;
					case 4: out.println("You are SURIYA's Fan");
						break;
					case 5: out.println("You are RAJINI's Fan");
						break;
					case 6: out.println("No matter what you do which number you choose, you will end up here...");
						break;
				}
			}else{
				out.println("Enter a number between 1 and 6");
			}	
		}
		catch(Exception e){
			out.println(e);
		}finally{
			scanner.close();
		}
	}
}