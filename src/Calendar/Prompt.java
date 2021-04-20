package Calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calender pcal = new Calender();
		int year = 0;
		int month = 0;
		String weekday ="";
		
		while (true) {
			System.out.println("년도를 입력하시오.");
			System.out.print(PROMPT);
			year = scan.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하시오.");
			System.out.print(PROMPT);
			month = scan.nextInt(); // 다음입력을 기다리기 때문에 print문이 무한히 빠르게 출력되지 않는다.
			if (month == -1) {
				break;
			}
			System.out.println("첫째날의 요일을 입력하시오.(su, mo, tu, we, th, fr, sa)");
			System.out.print(PROMPT);
			weekday = scan.next();

			pcal.printCalenderMethod(year, month, weekday);

		}
		scan.close();
	}
	
	public static void main(String[] args) {
				
		Prompt p = new Prompt();
		p.runPrompt();
		System.out.println("종료됩니다.");
		
		
	}

}
