package Calendar;

import java.util.Scanner;

public class MaxDaysMethods { // ctrl + shift + f -> 자동 정렬

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

		System.out.println("입력할 횟수를 입력하시오");
		int repeat = scan.nextInt();

		for (int i = 0; i < repeat; i++) {
			System.out.println("최대일수를 출력할 달을 입력하시오.");
			int month = scan.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfmonth(month)); // 해당 클래스의 메소드를 불러와서
																							// 활용(parameter)

		}

		cal.printSampleCalender();

		scan.close();

	}

}
