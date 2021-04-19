package Calendar;

import java.util.Scanner;

public class MaxDaysWhile { // ctrl + shift + f -> 자동 정렬

	private static final int[] Maxdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfmonth(int month) { // input도 있고 output도 있는 메소드 // 반드시 불러오고 싶으면 parameter를 입력해줘야 하는 형식
		return Maxdays[(month - 1)];
	}

	public void printSampleCalender() { // input도 없고 output도 없는 단순메소드 //불러오면 안에 있는 내용 실행

		System.out.println(" 일 월 화 수 목 금 토\n");
		System.out.println("-------------------------");
		System.out.printf("%2d %2d %2d %2d %2d %2d %2d\n", 1, 2, 3, 4, 5, 6, 7);
		System.out.printf("%2d %2d %2d %2d %2d %2d %2d\n", 8, 9, 10, 11, 12, 13, 14);
		System.out.printf("%2d %2d %2d %2d %2d %2d %2d\n", 15, 16, 17, 18, 19, 20, 21);
		System.out.printf("%2d %2d %2d %2d %2d %2d %2d\n", 22, 23, 24, 25, 26, 27, 28);
		System.out.printf("%2d %2d %2d %2d %2d %2d %2d\n", 29, 30, 31, 1, 2, 3, 4);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MaxDaysMethods cal = new MaxDaysMethods();
		String PROMPT = "cal> ";
		int month = 0;

		while (month != -1) {
			System.out.println("달을 입력하시오");
			System.out.print(PROMPT);
			month = scan.nextInt(); // 다음입력을 기다리기 때문에 print문이 무한히 빠르게 출력되지 않는다.
			if (month == -1 || month > 12) { // array 인덱스에 -1은 없으므로 -1입력시 출력문 메소드 실행하지 않고 while문을 빠져나간다.
				break;
			}

			if (month > 0 && month < 13) {
				continue; // while문을 빠져나가지 않고 계속한다.
			}

			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfmonth(month)); // 해당 클래스의 메소드를 불러와서
																							// 활용(parameter)
		}
		System.out.println("프로그램이 종료됩니다.");
		scan.close();
	}

}
