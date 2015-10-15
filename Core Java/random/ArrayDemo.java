import static java.lang.System.out;
class ArrayDemo{
	static public void main(String... x){
		String[] listOne = {"24/7", "multitier","30,000","foot","B-to-B","win-win","frontend","web based", "pervasive","smart","sixsigma","critical path","dynamic"}; 
		String[] listTwo = {"empowerment", "sticky", "value-added", "oriented", "centric", "distribution", "clustered", "branded", "outside-the-box", "positioned", "network", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		String[] listThree = {"process", "tipping point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		int listOneLength = listOne.length;
		int listTwoLength = listTwo.length;
		int listThreeLength = listThree.length;
		int rand1 = (int) (Math.random() * listOneLength);
		int rand2 = (int) (Math.random() * listTwoLength);
		int rand3 = (int) (Math.random() * listThreeLength);
		String phrase = listOne[rand1]+ " "+listTwo[rand2]+ " "+listThree[rand3];
		out.println("The phrase is: "+phrase);
	}
}