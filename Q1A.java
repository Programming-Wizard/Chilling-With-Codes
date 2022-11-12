
import java.util.Scanner;

public class Q1A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double rate = 0.5;
		long acc = 1234;
		int pin = 1234;
		double result = 0;
		double balance = 0;

		System.out.println("input your account number: ");
		int acc1 = sc.nextInt();
		System.out.println("input your pin :");
		int pin1 = sc.nextInt();

		if (acc1 == acc && pin1 == pin) {
			while (true) {

				System.out.println("\nenter the operation :\na.deposit \nb.withdrawal \nc.balance enquiry \nd.Simple interest");
				String str = sc.next();
				char operation = str.charAt(0);

				switch (operation) {
				case 'a':
					balance = 10000;
					System.out.println("Enter the amount you want to deposit:");
					int deposit = sc.nextInt();
					System.out.println("Amount deposited!");
					result = balance + deposit;
					System.out.println("remaining balance:" + (result) + "Rs");
					break;

				case 'b':
					balance = result;
					System.out.println("enter the amount you want to withdraw:");
					int withdraw = sc.nextInt();
					System.out.println("amount withdrawn");
					result = balance - withdraw;
					System.out.println("remaining balance:" + (result) + "Rs");
					balance = result;
					break;

				case 'c':
					balance = result;
					System.out.println("Current balance :" + balance);
					break;

				case 'd':
					balance = result;
					System.out.println("Simple Interest:");
					System.out.println("the rate applied is :" + rate);
					System.out.println("Enter the amount of years : ");
					int time = sc.nextInt();

					double result1 = (balance * rate * time) / 100;

					System.out.println("therefore total simple interest:" + result1);
					break;

				default:
					System.out.println("unavailable operation chosen");
					break;

				}
			}
		} else {
			System.out.println("account number or pin is incorrect");
		}
		sc.close();

	}
}
