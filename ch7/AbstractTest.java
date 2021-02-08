abstract class Player {
	abstract void player(int pos);
	abstract void stop();
}

class Audioplayer extends Player {
	void player(int pos) { System.out.println(pos + " 부터 재생합니다."); }
	void stop() {System.out.println("재생을 중단합니다."); }
}

public class AbstractTest {
	public static void main(String args[]) {
		Audioplayer ap = new Audioplayer();
		ap.player(100);
	
		Player p = new Audioplayer();
		p.stop();
		
	}
}