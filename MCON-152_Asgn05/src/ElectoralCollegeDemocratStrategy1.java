import java.util.ArrayList;

public class ElectoralCollegeDemocratStrategy1 implements IElectoralCollegeStrategy {
	
	//turns the state with most electoral votes democrat
	public ArrayList<State> getStatistics(ArrayList<State> states) {
		
		int temp = 0;
		int index = 0;
		
		// finds the state with the most electoral votes
		for(int i = 0; i < states.size(); i++) {

			if(states.get(i).getDemocratElectoralVotes() > temp) {
				temp = states.get(i).getDemocratElectoralVotes() + states.get(i).getRepublicanElectoralVotes();
				index = i;
			}
		}
		//if the republican vote is higher then the democrat vote is set to one more than the republican vote plus remainders
		if(states.get(index).getDemocratElectoralVotes() < states.get(index).getRepublicanElectoralVotes()) {
			states.get(index).setRepublicanElectoralVotes((temp / 2) - 1);
			states.get(index).setDemocratElectoralVotes(((temp / 2) + (temp % 2)) + 1);
		}
		return states;
	}

}
