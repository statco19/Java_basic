
public class TvTeste4{

    public static void main(String args[]){

        Tv[] tvArr = new Tv[3];
		for(int i=0;i<tvArr.length;i++){
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int j=0;j<tvArr.length;j++){
			tvArr[j].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", j, tvArr[j].channel);
		}
    } // main
}


class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
