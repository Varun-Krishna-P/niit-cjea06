import static java.lang.System.out;
interface AInterface{
	void aMethod();
}
interface AInterface2 extends AInterface{
	void aMethod();
}
interface AInterface3 extends AInterface2{
	void aMethod();
	void aMethod1();
	void aMethod2();
}
class AClass{
	public void aMethod(){
		out.println("Inside a concrete method inside the class AClass...");
	}
	
}
public class OverrideInterfaceDemo extends AClass implements AInterface3{
	void aMethod1(){
	}
	void aMethod2(){
	}
	void aMethod(){
		out.println("Trying to override this method inisde the class which has a main method.");
	}
	static public void main(String... x){
		OverrideInterfaceDemo oID = new OverrideInterfaceDemo();
		oID.aMethod();
	}
}