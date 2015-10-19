class TestA{
	private void privateMethod(){
		System.out.println("Inside a private method in Test A class");
	}
}
public class MethodHiding extends TestA{
	void privateMethod(){
		System.out.println("Overriding this method.");
	}
	public static void main(String args[]){
		new MethodHiding().privateMethod();
	}
}