package com.example.concrete;
import com.example.abstractclass.Car;
import static java.lang.System.out;
public class Ferrari extends Car{
	private double price;
	private String color;
	private String year;
	private String model;
	public static void main(String... x){
		Ferrari ferrari = new Ferrari();
		ferrari.accelerate(100.5);
		ferrari.horsePower(14.8);
		ferrari.setPrice(110.110);
		out.println(ferrari.getPrice());
		ferrari.setColor("Green");
		out.println(ferrari.getColor());
		ferrari.setYear("2014");
		out.println(ferrari.getYear());
		ferrari.setModel("ABX");
		out.println(ferrari.getModel());
		
	}
	public double accelerate(double d){
		out.println("Accelerate at: "+d);
		return d;
	}
	public double horsePower(double d){
		out.println("horse power is at: "+d);
		return d;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setYear(String year){
		this.year = year;
	}
	public String getYear(){
		return year;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	
	
	
}