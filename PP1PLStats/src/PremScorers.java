

public class PremScorers {
	private String name;
	private int goals;
	private int assists;
	private int appearances;
	private int contributions;
	private String nation;
	private String club;
	
	public PremScorers(String name, int goals, int assists, int contributions, int appearances, String nation,
			String club) {
		this.name = name;
		this.goals = goals;
		this.assists = assists;
		this.appearances = appearances;
		this.contributions = contributions;
		this.nation = nation;
		this.club = club;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public void setAppearances(int appearances) {
		this.appearances = appearances;
	}

	public void setContributions(int contributions) {
		this.contributions = contributions;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getName() {
		return name;
	}
	
	public int getGoals() {
		return goals;
	}
	
	
	public int getAssists() {
		return assists;
	}
	
	public int getContributions() {
		return contributions;
	}
	public int getAppearances() {
		return appearances;
	}
	
	public String getNation() {
		return nation;
	}
	
	public String getClub() {
		return club;
	}
	
	public String toString() {
		return "Player: " + name + "\n" + "Goals: " + goals + "\n" + "Assists: " + assists + "\n" + "Appearances: " + appearances + "\n" + "Goal Contributions: " + contributions + "\n" + "Nation: " + nation + "\n" + "Club: " + club + "\n\n--------------\n";
		
	}
	
	
	

	
	
	
	
	

	
	
	
	

}
