import static java.lang.System.out;
class GCD{
	public static void main(String... x){
		out.println(GCD.gcd(10,2));
	}
	public static int gcd(int a, int b){
		if(b == 0) return a;
		int c = a % b;
		return gcd(b,c);
	}
}