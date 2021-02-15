class A {
	public void methodA(I i) {
		i.methodB();
	}
}

interface I {
	void methodB(); // public abstract
}

class B implements I {
	public void methodB() {
		System.out.println("Class B's method");
	}
}

class C implements I {
	public void methodB() {
		System.out.println("Class C's method");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new C());
	}
}