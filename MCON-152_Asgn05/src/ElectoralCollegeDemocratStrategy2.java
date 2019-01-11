import java.util.ArrayList;

public class ElectoralCollegeDemocratStrategy2 implements IElectoralCollegeStrategy {

	public ArrayList<State> getStatistics(ArrayList<State> states) {
		
		//takes 2% of all republican votes in every state and makes them democrat votes instead (if 2% is more than or equal to one)
		for(State s : states) {
			if(s.getRepublicanElectoralVotes() * 0.02 >= 1) {
				s.setDemocratElectoralVotes(s.getDemocratElectoralVotes() + (int) (s.getRepublicanElectoralVotes() * 0.02));
				s.setRepublicanElectoralVotes(+ s.getRepublicanElectoralVotes() - (int) (s.getRepublicanElectoralVotes() * 0.02));
			}
		}
		return states;
	}
}
