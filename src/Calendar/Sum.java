package Calendar;
import java.util.Scanner;
public class Sum {
	
	public static void main(String[] args) {
		//입력 : 키보드로 두 수의 입력 받는다.
		//출력 : 두 수의 합을 출력한다.
		Scanner scan = new Scanner(System.in);  //Ctrl + Shift + n -> 자동으로 import java.util.Scanner; 를 입력해준다.
		int Num1 = scan.nextInt();
		int Num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d\n", Num1, Num2, Num1+Num2);
		scan.close();  //close 해주어야 누수가 일어나지 않는다.
		
	}

}
