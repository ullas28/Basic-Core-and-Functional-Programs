import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int x=999;
		//System.out.println("the number is " + a );
		if ( a>x) {
			if ((a % 100) == 0 && (a % 400) == 0) {
				System.out.println( a + " It's a Leap Year");
			}
				else if ((a % 100) == 0 && (a % 4) == 0){
					System.out.println("It's a Leap year");				
				}
				else
					System.out.println("It's not a Leap year");
			}
		else
			System.out.println("try again with 4 digit value");
		}
	}

