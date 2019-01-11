import java.util.ArrayList;

public class PopularVoteRepublicanStrategy implements IPopularVoteStrategy {
	
	//reports %5 less of the democrat citizen votes inn all states
	public ArrayList<State> getStatistics(ArrayList<State> states) {
		
		for(State s : states) {
			s.setDemocratCitizenVotes(s.getDemocratCitizenVotes() - (int) (0.05 * s.getDemocratCitizenVotes()));
		}
		return states;
	}

}
