package Calendar;

import java.util.Scanner;

public class MaxDaysArray {
	
	public static void main(String[] args) {
		System.out.println("최대일수 출력할 달을 입력하세요."); //println함수는 줄바꿈을 자동으로 한다.
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("%d월의 최대일수는 %d일 입니다.\n", month, maxDays[(month-1)]);
		
		scan.close();
	}

}
