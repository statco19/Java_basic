class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}
public class TvTest{

    public static void main(String args[]){
        Tv t; // Tv 클래스 타입의 참조변수 t 선언
		t = new Tv(); // Tv 인스턴스 생성
		t.channel = 7;
		t.channelDown();
		
		System.out.println("현재 채널은 "+t.channel+" 입니다.");
    }
}



