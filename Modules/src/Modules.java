import java.util.Scanner;
public class Modules
	{

		public static void main(String[] args)
			{
				leapYearChecker();
				fizzBuzzGame();

			}

		private static void leapYearChecker()
			{
				
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter a year and I will tell you if it's a leap year");
				int answer = userInput.nextInt();
				
				if(answer % 400 == 0)
					{
						System.out.println(answer + " is a leap year");
					}
				else if(answer % 100 == 0)
					{
						System.out.println(answer + " is not a leap year");
					}
				else if(answer % 4 == 0)
					{
						System.out.println(answer + " is a leap year");
					}
				else
					{
						System.out.println(answer + " is not a leap year");
					}
				
				
				
				
			}

		private static void fizzBuzzGame()
			{
				
				for(int i = 1; i <= 100; i++)
					{
						
						if(i % 3 == 0 && i % 5 == 0)
							{
								System.out.println("fizzbuzz");
							}
						else if(i % 3 == 0)
							{
								System.out.println("fizz");
							}
						else if(i % 5 == 0)
							{
								System.out.println("buzz");
							}
						else
							{
								System.out.println(i);
							}
						
						
						
						
						
					}
				
		
				
			}

	}
