public class VariableArgs{
	static public void main(String... a){
		VariableArgs.doMore(1,2,3,4);
	}
	public static void doMore(int... x){
		for(int z:x){
			System.out.println(z);
		}
	}
}