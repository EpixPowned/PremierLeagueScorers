import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) {
		ArrayList<PremScorers> PremScorersDatabase = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader("StatsFolder\\PL Stats Sheet COMP228.csv"))) {
			String line;
			int lineSkip = 0;
				while ((line = br.readLine()) != null) {
					if (lineSkip == 0) {
						lineSkip++;
						continue;
					}
						String[] players = line.split(",");	
						String name = players[0];
						int goals = 0;
						int assists = 0;
						int contributions = 0;
						int appearances = 0;
						try {
							goals = Integer.parseInt(players[1]);
						} catch(NumberFormatException e) {
							e.printStackTrace();
						}
						try {
							assists = Integer.parseInt(players[2]);
						} catch(NumberFormatException e) {
							e.printStackTrace();
						}
						try {
							contributions = Integer.parseInt(players[3]);
						} catch(NumberFormatException e) {
							e.printStackTrace();
						}
						try {
							appearances = Integer.parseInt(players[4]);
						} catch(NumberFormatException e) {
							e.printStackTrace();
						}
						String nation = players[5]; 
						String club = players[6];
						
						PremScorers tempPLstats = new PremScorers(name, goals, assists, contributions, appearances, nation, club);
						
						PremScorersDatabase.add(tempPLstats);
					}
				}catch (IOException e) {
				e.printStackTrace();
				}
		
				System.out.println("Please input one of the following options. all, goals, assists, appearances, contributions, nation, club or exit");
				 Scanner scanner = new Scanner(System.in);
				 String answer = scanner.next();
				 
				 if (answer.equals("exit")) {
					 System.out.println("Thank you for using the database!");
					 System.exit(0);
				 }
				 
				 
				 if (answer.equals("all")) {
					 for(int i=0; i<PremScorersDatabase.size(); i++) {
						 if(PremScorersDatabase.get(i).getGoals() < 100) {
							 
						 } 
						 else if (answer.equals("exit")) {
							 System.out.println("Thank you for using the database!");
							 System.exit(0);
						 } else
						 System.out.println(PremScorersDatabase.get(i));
					 }
				 }
				 
				 if (answer.equals("goals")) {
					 System.out.println("Please list a number greater then 100 and less then 261:");
					 Scanner scanner2 = new Scanner(System.in);
					 int answer2 = scanner2.nextInt();
					 for(int i=0; i<PremScorersDatabase.size(); i++) {
						 if(answer2 == PremScorersDatabase.get(i).getGoals()) {
							 System.out.println(PremScorersDatabase.get(i));
						 } else if (answer2 < 100 || answer2 > 260) {
							 System.out.println("Invalid Number.");
							 System.exit(0);
						 }
					 }	 
				 }
				 if (answer.equals("assists")) {
					 System.out.println("Please list a number greater then 0 and less then 163:");
					 Scanner scanner2 = new Scanner(System.in);
					 int answer2 = scanner2.nextInt();
					 for(int i=0; i<PremScorersDatabase.size(); i++) {
						 if(answer2 == PremScorersDatabase.get(i).getAssists()) {
							 System.out.println(PremScorersDatabase.get(i));
						 } else if (answer2 < 0 || answer2 > 162) {
							 System.out.println("Invalid Number.");
							 System.exit(0);
						 }
					 }
				 }
				 if (answer.equals("contributions")) {
					 System.out.println("Please list a number greater then 100 and less then 325:");
					 Scanner scanner2 = new Scanner(System.in);
					 int answer2 = scanner2.nextInt();
					 for(int i=0; i<PremScorersDatabase.size(); i++) {
						 if(answer2 == PremScorersDatabase.get(i).getContributions()) {
							 System.out.println(PremScorersDatabase.get(i));
						 } else if (answer2 < 100 || answer2 > 326) {
							 System.out.println("Invalid Number.");
							 System.exit(0);
						 }
					 }
				 }
				 if (answer.equals("appearances")) {
					 System.out.println("Please list a number greater then 100 and less then 633:");
					 Scanner scanner2 = new Scanner(System.in);
					 int answer2 = scanner2.nextInt();
					 for(int i=0; i<PremScorersDatabase.size(); i++) {
						 if(answer2 == PremScorersDatabase.get(i).getAppearances()) {
							 System.out.println(PremScorersDatabase.get(i));
						 } else if (answer2 < 100 || answer2 > 632) {
							 System.out.println("Invalid Number.");
							 System.exit(0);
						 }
					 }
				 }
				 if (answer.equals("nation")) {
					 System.out.println("Please list a country:");
					 Scanner scanner2 = new Scanner(System.in);
					 String answer2 = "";
					 boolean match = false;
					 while (scanner2.hasNext()) {
						 answer2 += scanner2.nextLine();
						 if (answer2.equals("exit")) {
							 System.out.println("Thank you for using the database!");
							 System.exit(0);
						 }
						 for(int i=0; i<PremScorersDatabase.size(); i++) {
							 if(answer2.equals(PremScorersDatabase.get(i).getNation())) {
								 System.out.println(PremScorersDatabase.get(i));
								 match = true;
							 }
						 }if(match == false) {
								 System.out.println("No players from that nation!");
								 System.exit(0);
						 }
					 }	
					
				 }
				 if (answer.equals("club")) {
					 System.out.println("Please list a club:");
					 Scanner scanner2 = new Scanner(System.in);
					 String answer2 = "";
					 boolean match = false;
					 while (scanner2.hasNext()) {
						 answer2 += scanner2.nextLine();
						 if (answer2.equals("exit")) {
				 				System.out.println("Thank you for using the database!");
				 				System.exit(0);
						 }
					 	for(int i=0; i<PremScorersDatabase.size(); i++) {
					 			if(answer2.equals(PremScorersDatabase.get(i).getClub())) {
					 				System.out.println(PremScorersDatabase.get(i));
					 				match = true;
					 			}
					 	}
					 	if(match == false) {
					 		System.out.println("No players from that club!");
					 		System.exit(0);
						 } 
				 }
			} 
	}
}