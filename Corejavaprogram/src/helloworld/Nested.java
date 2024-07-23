package helloworld;

import com.tnsif.interfacedemo.Nestedinterface;

public class Nested implements inter.innerinner{
	@Override
	public void print() {
		System.out.println("inner interface");
		
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		int b=4;
		int a=4;
		n.print(a+b);
	}
	

}
