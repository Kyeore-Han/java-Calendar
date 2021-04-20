package Calendar;

public class Calender {
	private static final int[] Maxdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_Maxdays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년일 경우 2월을 29일까지 출력

	public boolean isLeapYear(int year) {

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getmaxDaysOfmonth(int year, int month) { // input도 있고 output도 있는 메소드 // 반드시 불러오고 싶으면 parameter를 입력해줘야 하는
														// 형식
		if (isLeapYear(year)) {
			return LEAP_Maxdays[(month - 1)];
		} else {
			return Maxdays[(month - 1)];
		}
	}

	public void printCalenderMethod(int year, int month) {
		System.out.printf("   << %4d 년%3d 월 >>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		int maxDay = getmaxDaysOfmonth(year, month);
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
