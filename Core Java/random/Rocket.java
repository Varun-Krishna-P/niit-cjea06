class Rocket{
	private void blastOff(){ System.out.println("Bang....");}
}
class Shuttle extends Rocket{
	public static void main(String... x){
		new Shuttle().go();
	}
	public void go(){
		blastOff();
		//Rocket.blastOff();
	}
	public void blastOff(){
		System.out.println("sh-band....");
	}
}