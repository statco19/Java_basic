
public class FlowEx30{

    public static void main(String args[]){
        int sum = 0, i = 0;
		while (true){
			if(sum > 100) break;
			sum += ++i;
		} // while
		System.out.printf("i=%d%n", i);
		System.out.printf("sum=%d%n", sum);
    }
}



