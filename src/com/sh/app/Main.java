package com.sh.app;

import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Eagle;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello Git");
		
//		new Foo().test();
		new Dog().bark();
		new Cat().jump();
		new Eagle().fly();
	}
}
