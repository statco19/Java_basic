import java.util.*;

public class FlowEx10{

    public static void main(String args[]){
		char grade = ' ';

        System.out.println("당신의 점수를 입력하세요. (1~100)>");
		Scanner scn = new Scanner(System.in);
		
		String tmp = scn.nextLine();
		int score = Integer.parseInt(tmp);
		
		switch(score / 10) { // '/'은 정수 몫 반환
			
			case 10: case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';		
						
		} // switch
		System.out.println("당신의 학점은 " + grade + "입니다.");
    } // main
}



