package com.sh.app;

import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Eagle;
import com.sh.app.animal.Snake;
import com.sh.app.animal.Tiger;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		System.out.println("동물기능 시작~");
		System.out.println("Animal Go~");
		new Dog().bark();
		new Cat().jump();
		new Eagle().fly();
		new Snake().crawl();
		new Tiger().ride();
	}
	
	public void test() {
		System.out.println("Main#test");
	}
}
