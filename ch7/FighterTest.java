public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("child of Unit");
			
		if (f instanceof Fightable)
			System.out.println("implemented Fightable");
		
		if (f instanceof Movable)
			System.out.println("implemented Movable");
			
		if (f instanceof Attackable)
			System.out.println("implemented Attackable");
			
		if (f instanceof Object)
			System.out.println("child of Object");
	}
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}

class Unit {
	int currentHP;
	int x, y;
}

interface Fightable extends Movable, Attackable {}

interface Movable { void move(int x, int y); }

interface Attackable { void attack(Unit u); }