class A{
	A get(){return this;}
}
class CovariantExample extends A{
	CovariantExample get(){return this;}
	void message(){System.out.println("Hello World");}
	static public void main(String... x){
		new CovariantExample().get().message();
	}
}