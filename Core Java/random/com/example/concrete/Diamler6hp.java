package com.example.concrete;
import com.example.abstractclass.Car;
import static java.lang.System.out;
public class Diamler6hp extends Car{
	private double price;
	private String color;
	private String year;
	private String model;
	static public void main(String... x){
		Diamler6hp diamler = new Diamler6hp();
		Diamler6hp.main();
		diamler.accelerate(4.5);
		diamler.horsePower(13.9);
		diamler.setPrice(1.1);
		out.println("The price of the diamler: "+diamler.getPrice());
		diamler.setColor("Maroon");
		out.println("The color of the diamler is: "+diamler.getColor());
		diamler.setYear("1860");
		out.println("The year of the diamler: "+diamler.getYear());
		diamler.setModel("6hp");
		out.println("The model of the diamler is: "+diamler.getModel());
	}
	public static void main(){out.println("Overloaded main");}
	public double accelerate(double d){
		out.println("Dialmer accelerates at: "+d);
		return d;
	}
	public double horsePower(double d){
		out.println("Horse power is at: "+d);
		return d;
	}
	public void setPrice(double price){ this.price = price;}
	public double getPrice(){ return price;}

	public void setColor(String color){ this.color = color;}
	public String getColor(){ return color;}

	public void setYear(String year){ this.year = year;}
	public String getYear(){ return year;}
	
	public void setModel(String model){this.model = model;}
	public String getModel(){ return model;}
	
	
	
}