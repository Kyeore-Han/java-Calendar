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
	public int getblankDaysOfmonth(String weekday) {
		
		if (weekday.equals("su")) return 0;
		else if (weekday.equals("mo")) return 1;
		else if (weekday.equals("tu")) return 2;
		else if (weekday.equals("we")) return 3;
		else if (weekday.equals("th")) return 4;
		else if (weekday.equals("fr")) return 5;
		else if (weekday.equals("sa")) return 6;
		else return 0;
	}

	public void printCalenderMethod(int year, int month, String weekday) {
		System.out.printf("   << %4d 년%3d 월 >>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		int maxDay = getmaxDaysOfmonth(year, month);
		int weekNum = getblankDaysOfmonth(weekday);
		for (int j = 0; j <= weekNum-1; j++) {
			if (weekNum == 0) {
				break;
			}
			System.out.print("   ");
		}
		
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if ((i + weekNum) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		}
		

}
