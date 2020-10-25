import java.util.*;

public class FlowEx27{

    public static void main(String args[]){
        int num;
		int sum = 0;
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		Scanner scn = new Scanner(System.in);
		
		while(flag){
			System.out.print(">>");
			num = scn.nextInt();
			System.out.printf("%d%n", num);
			
			if(num!=0) sum += num;
			else flag = false;
		}
		System.out.println("합계:" + sum);
    } // main
}