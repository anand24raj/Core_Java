package com.core_java.oops.method_overloading;

public class MethodOverloading {
	void main() {
		IO.println("Sum of two integer is: " + this.accept(12, 90));
		IO.println("Sum of three integer is: " + this.accept(12, 90, 10));
	}

	int accept(int x, int y) {
		return x + y;
	}

	int accept(int x, int y, int z) {
		return (x + y + z);
	}
}
