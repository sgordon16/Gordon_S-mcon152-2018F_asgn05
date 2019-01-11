import java.util.ArrayList;
import java.util.Calendar;

public class VoterStatisticsStrategy {

	IElectoralCollegeStrategy electoralCollegeStrategy;
	IPopularVoteStrategy popularVoteStrategy;
	
	public ArrayList<State> getStatistics(ArrayList<State> states) {
		return electoralCollegeStrategy.getStatistics(popularVoteStrategy.getStatistics(states));
	}
	public void display(ArrayList<State> states) {
		
		for(State s : getStatistics(states)) {
			System.out.println(s.getName());
			System.out.println("Democrat citizen votes: " + s.getDemocratCitizenVotes());
			System.out.println("Republican citizen votes: " + s.getRepublicanCitizenVotes());
			System.out.println("Democrat electoral votes: " + s.getDemocratElectoralVotes());
			System.out.println("Republican electoral votes: " + s.getRepublicanElectoralVotes());
			System.out.println("All reports are purely observational and not legally binding in any way");
			System.out.println(Calendar.getInstance().getTime());
		}
	}
}
