package com.tnsif.lambdaexpression;

public class Lambdademo {
public static void main(String[] args) {
		
		Message m=()->{return "hello world";};
		System.out.println(m.greet());
	}


}
