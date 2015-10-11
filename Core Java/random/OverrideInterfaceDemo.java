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
	public void aMethod1(){
	}
	public void aMethod2(){
	}
	/*void aMethod(){
		out.println("Trying to override this method inisde the class which has a main method.");
	}*/

	/* **********************************************************************************************
	* http://stackoverflow.com/questions/11296789/same-method-in-interface-and-abstract-class *******
	* You can only override methods defined in another class. ***************************************
	* Methods declared in an interface are merely implemented. This distinction exists in Java to ***
	* tackle the problem of multiple inheritance. A class can only extend one parent class,  ********
	* therefore any calls to super will be resolved without ambiguity. Classes however can **********
	* implement several interfaces, which can all declare the same method. It's best to think of ****
	* interfaces as a list of "must have"s: to qualify as a Comparable your cluss must have a *******
	* compareTo() method but it doesn't matter where it came from or what other interfaces require **
	* that same method.******************************************************************************
	*So technically you override Abs.m1() and implement Intr.m1() in one fell swoop. ****************
	*Note that this would be fine too:***************************************************************
	* public class B extends Abs implements Intr {***************************************************
	**	//m1() is inherited from Abs, so there's no need to override it to satisfy the interface*
	*}***********************************************************************************************
	*************************************************************************************************/




	static public void main(String... x){
		OverrideInterfaceDemo oID = new OverrideInterfaceDemo();
		oID.aMethod();
	}
}