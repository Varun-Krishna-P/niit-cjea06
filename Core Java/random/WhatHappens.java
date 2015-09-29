class WhatHappens{
	static public void main(String... x){
		Integer integer1 = 10;
		Integer integer2 = 11;
		String string1 = new String("Hello");
		String string2 = "Hello";
		if(integer1 == integer2){ System.out.println("Integer i and integer 2 are equal");}
		else{ System.out.println("NOt Equal");}

		if(string1 == string2){ System.out.println("Strings are equal");}
		else{ System.out.println("Not Equal");}
	}
}