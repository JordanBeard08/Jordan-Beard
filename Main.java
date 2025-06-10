	import java.util.Scanner;
	import java.util.ArrayList;
	class Main{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		// First I will create some arraylists to store the service info
			ArrayList<String> servicename = new ArrayList<String>();
			ArrayList<String> servicecategories = new ArrayList<String>();
			ArrayList<Double> Rates = new ArrayList<Double>();
			ArrayList<String> Status = new ArrayList<String>();
			
			//position in the array that the service is and the number of hours a service is being used for
			ArrayList<Integer> serviceIndex = new ArrayList<Integer>();
			ArrayList<Integer> hours = new ArrayList<Integer>();
			
			//running=1 keeps the program running in the while loop
			int running = 1;
			
			//Choose what you want to do
			while(running == 1){
				System.out.println("---Local Marketplace For Services---");
				System.out.println("1. Add a service");
				System.out.println("2. Book a service");
				System.out.println("3. Exit");
				System.out.println("Choose an option: ");
				int choice = sc.nextInt();
				sc.nextLine();
				
				//Adding a service
				if(choice == 1){
					System.out.println("Enter service name: ");
					servicename.add(sc.nextLine());
					
					System.out.println("Enter the category: ");
					servicecategories.add(sc.nextLine());
					
					System.out.println("Enter the rate: ");
					Rates.add(sc.nextDouble());
					
					Status.add("Available");
					System.out.println("Service has been added to the system");
					
					//Selecting a service
				}else if(choice == 2){
					if(servicename.size() == 0){
						System.out.println("Service unavailable");
						//When entering categories there may be multiples this combines it to one
					}else{
						ArrayList<String> categories = new ArrayList<String>();	
						for (int i = 0; i < categories.size(); i++){
							String cat = servicecategories.get(i);
							if(!categories.contains(cat)){
								categories.add(cat);
							}
						}
						System.out.println("Available Categories");
						for(int i = 0; i < categories.size(); i++){
							System.out.println((i+1) + ". " + categories.get(i));
						}
						
						
					}
				}
				
				
			}
			
		}
	}