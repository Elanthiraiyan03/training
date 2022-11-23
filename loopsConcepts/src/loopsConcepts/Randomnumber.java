package loopsConcepts;
	  import java.util.Scanner;

		public class Randomnumber {

			public static void main(String[] args) {
				Scanner S=new Scanner(System.in);
				
				int assumption=0;
				int answer=30;

				do {
					System.out.println("Enter the number between 1 to 30:");
					assumption=S.nextInt();
					
					if(assumption>answer) {
						System.out.println("Too high, try again:");
					}
					else if(assumption<answer){
						System.out.println("Too low, try again:");
					}
				}while(assumption != answer);
				System.out.println("The number is Correct");
				System.out.println("learning");
				
				
			}

		

	}


