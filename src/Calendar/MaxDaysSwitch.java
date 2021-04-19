package Calendar;

import java.util.Scanner;

public class MaxDaysSwitch {

	public static void main(String[] args) {
		
		System.out.println("몇월인지 입력하세요. 최대일수를 출력합니다.\n");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		int a=Integer.parseInt(s1);
		
		if (a>0 && a<13) {
			
			switch (a) {
			
			case 1 : System.out.printf("%d 월의 최대일수는 30일 입니다.\n", a);
			break;
			case 2 : System.out.printf("%d 월의 최대일수는 29일 입니다.\n", a);
			break;
			case 3 : System.out.printf("%d 월의 최대일수는 31일 입니다.\n", a);
			break;
			case 4 : System.out.printf("%d 월의 최대일수는 30일 입니다.\n", a);
			break;
			case 5 : System.out.printf("%d 월의 최대일수는 31일 입니다.\n", a);
			break;
			case 6 : System.out.printf("%d 월의 최대일수는 30일 입니다.\n", a);
			break;
			case 7 : System.out.printf("%d 월의 최대일수는 31일 입니다.\n", a);
			break;
			case 8 : System.out.printf("%d 월의 최대일수는 31일 입니다.\n", a);
			break;
			case 9 : System.out.printf("%d 월의 최대일수는 30일 입니다.\n", a);
			break;
			case 10 : System.out.printf("%d 월의 최대일수는 31일 입니다.\n", a);
			break;
			case 11 : System.out.printf("%d 월의 최대일수는 30일 입니다.\n", a);
			break;
			case 12 : System.out.printf("%d 월의 최대일수는 31일 입니다.\n", a);
			break;
			}
			
		} else {
				System.out.println("1부터 12월까지의 값을 입력하세요.");
		}
		scan.close();
		
		
	}
}
