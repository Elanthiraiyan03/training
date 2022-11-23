package reverseNumber;

import java.util.Scanner;

public class Coderunner {

	public static void main(String[] args) {

		Reverse object = new Reverse();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number to be reversed");

		int number = scan.nextInt();

		object.reverseNumber(number);

		}


		}

