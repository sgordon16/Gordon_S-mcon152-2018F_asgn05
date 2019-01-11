import java.util.ArrayList;

public class ElectoralCollegeRepublicanStrategy2 implements IElectoralCollegeStrategy {

	public ArrayList<State> getStatistics(ArrayList<State> states) {
		
		int temp = 0;
		int index = 0;
		
		//finds the state where the democrats have the smallest lead
		for(int i = 0; i < states.size(); i++) {

			if(states.get(i).getDemocratElectoralVotes() - states.get(i).getRepublicanElectoralVotes() > 0 && 
					states.get(i).getDemocratElectoralVotes() - states.get(i).getRepublicanElectoralVotes() < temp) {
				temp = states.get(i).getDemocratElectoralVotes() - states.get(i).getRepublicanElectoralVotes();
				index = i;
			}
		}
		//divides the votes evenly and gives any remainder to the republicans
		int electoralVotes = states.get(index).getDemocratElectoralVotes() + states.get(index).getRepublicanElectoralVotes();
		states.get(index).setDemocratElectoralVotes(electoralVotes / 2);
		states.get(index).setRepublicanElectoralVotes(electoralVotes / 2 + electoralVotes % 2);
		return states;
	}
}
