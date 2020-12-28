
public class CastingTest2{

    public static void main(String args[]){

        Car c = new Car();
		FireEngine fe = null;
		
		fe = (FireEngine) c; // compile OK, ERROR occurs while running the codes
		fe.water();
    }
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}