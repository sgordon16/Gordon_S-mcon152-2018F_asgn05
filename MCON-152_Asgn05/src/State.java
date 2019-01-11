
public class State {
		
	private String name;
	private int republicanElectoralVotes;
	private int republicanCitizenVotes;
	private int democratElectoralVotes;
	private int democratCitizenVotes;
	
	public State(String name, int republicanElectoralVotes, int republicanCitizenVotes, int democratElectoralVotes, int democratCitizenVotes) {
	
		this.name = name;
		this.republicanElectoralVotes = republicanElectoralVotes;
		this.republicanCitizenVotes = republicanCitizenVotes;
		this.democratElectoralVotes = democratElectoralVotes;
		this.democratCitizenVotes = democratCitizenVotes;
	}
	public State(String name) {
			
		this.name = name;
	}
	public State(State s) {
		this.name = s.name;
		this.republicanElectoralVotes = s.republicanElectoralVotes; 
		this.republicanCitizenVotes = s.republicanCitizenVotes; 
		this.democratElectoralVotes = s.democratElectoralVotes;
		this.democratCitizenVotes = s.democratCitizenVotes;
	}
	public String getName() {
		
		return name;
	}
	public int getRepublicanElectoralVotes() {
			
		return republicanElectoralVotes;
	}
	public void setRepublicanElectoralVotes(int republicanElectoralVotes) {
			
		this.republicanElectoralVotes = republicanElectoralVotes;
	}
	public int getRepublicanCitizenVotes() {
			
		return republicanCitizenVotes;
	}
	public void setRepublicanCitizenVotes(int republicanCitizenVotes) {
			
		this.republicanCitizenVotes = republicanCitizenVotes;
	}
	public int getDemocratElectoralVotes() {
		
		return democratElectoralVotes;
	}
	public void setDemocratElectoralVotes(int democratElectoralVotes) {
			
		this.democratElectoralVotes = democratElectoralVotes;
	}
	public int getDemocratCitizenVotes() {
			
		return democratCitizenVotes;
	}
	public void setDemocratCitizenVotes(int democratCitizenVotes) {
			
		this.democratCitizenVotes = democratCitizenVotes;
	}
}