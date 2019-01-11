import java.util.ArrayList;

public class PopularVoteDemocratStrategy implements IPopularVoteStrategy {
	
	//ignores the republican citizen votes in the state with the most republican citizen votes
	public ArrayList<State> getStatistics(ArrayList<State> states) {
		
		int temp = 0;
		int index = 0;
		
		for(int i = 0; i < states.size(); i++) {

			if(states.get(i).getRepublicanCitizenVotes() > temp) {
				temp = states.get(i).getRepublicanCitizenVotes();
				index = i;
			}
		}
		states.get(index).setRepublicanCitizenVotes(0);
		return states;
	}

}
