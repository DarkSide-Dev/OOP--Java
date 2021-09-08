import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Human human = new Human("Darkside Dev", 18, "Male", 70.5);
		Scanner scanner = new Scanner(System.in);
		
		int choice = 1;
		
		while(choice != 0) {
			
			System.out.printf("\n[1] - Eat\n[2] - BirthDay\n[3] - Study\n[4] - Search for a job\n[0] - Exit\n\nChoose a number: ");
			choice = scanner.nextInt();
			
			switch(choice) {
			
				case 1:
					
					human.eat();
					
				break;
				
				case 2:
					
					human.birthday();
					
				break;
				
				case 3:
					
					human.study();
					
				break;
				
				case 4:
				
					human.jobSearching();
					
				break;
				
				case 0:
					System.out.println("\nExiting...");
				break;
				
				default:
					System.out.println("\nTry again\n");
				break;
			
			}
			
		}
		
		scanner.close();

	}

}
