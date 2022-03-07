

public class DmvSimulator {
	public static void main(String[] args) {

		System.out.println("Wecolcome to the DMV");

		for (int x = 1; x >= 200; x++); 
			
		{
			int User = (int) (Math.random() * 200);

			System.out.println("This is your number in line:" + " " + User);

			System.out.println("Please wait until your number is called. Thank you");

			int Wait = 1 + User;

			while (User != Wait) {
				System.out.println("Calling:" + " " + Wait);
				Wait++;
				if (Wait == 201) {
					Wait = 1;
				}
			}

			System.out.println("Now calling:" + " " + Wait);

			if (Math.random() * 100 < 99) {
				System.out.println("You do not have the right paper work! Come back next time with the appropriate file so you don't waste my time!");
			}
				else if (Math.random() * 100 < 1) {
					System.out.println("I will see you now"); 
					
				}
				
				
				
			}
		}

	}
