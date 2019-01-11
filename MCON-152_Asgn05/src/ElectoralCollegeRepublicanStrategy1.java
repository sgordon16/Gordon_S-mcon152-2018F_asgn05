import java.util.ArrayList;

public class ElectoralCollegeRepublicanStrategy1 implements IElectoralCollegeStrategy {
	
	//New York will always be republican (you wish!)
	public ArrayList<State> getStatistics(ArrayList<State> states) {
		
		for(State s : states) {
			if(s.getName().equals("New York")) {
				s.setRepublicanElectoralVotes(s.getDemocratElectoralVotes() + 1);
				break;
			}
		}
		return states;
	}

}
