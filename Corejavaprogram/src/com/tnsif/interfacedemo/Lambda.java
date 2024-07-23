package com.tnsif.interfacedemo;

import com.tnsif.lambdaexpression.Message;

public class Lambda {
	public static void main(String[] args) {
		Message m=()->{return "helloworld";};
		System.out.println(m.greet());
		
	}
}
