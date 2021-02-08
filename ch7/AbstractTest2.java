public class AbstractTest2 {
	public static void main(String args[]) {
		Unit group[] = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		for(int i=0;i<group.length;i++) {
			group[i].move(100,200);
			System.out.println();
		}
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("현재 위치에 멈춥니다."); }
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.printf("(%d, %d)까지 걸어서 이동합니다.", x, y);
	}
	void stimPack() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.printf("(%d, %d)까지 전차로 이동합니다.", x, y);
	}
	void changeMode() {}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.printf("(%d, %d)까지 날아서 이동합니다.", x, y);
	}
	void load() {}
	void unload() {}
}

