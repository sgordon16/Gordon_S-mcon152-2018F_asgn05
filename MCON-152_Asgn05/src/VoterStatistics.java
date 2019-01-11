import java.util.ArrayList;
import java.util.Observable;

public class VoterStatistics extends Observable {

	private ArrayList<State> states = new ArrayList<State>();
	
	public VoterStatistics() {}
	
	public void votesChanged() 
	{
		setChanged();
		notifyObservers();
	}
	
	public void updateRepublicanElectoralVotes(String stateName, int republicanElectoralVotes) {
		getState(stateName).setRepublicanElectoralVotes(republicanElectoralVotes);
		votesChanged();
	}
	public void updateRepublicanCitizenVotes(String stateName, int republicanCitizenVotes) {
		getState(stateName).setRepublicanCitizenVotes(republicanCitizenVotes);
		votesChanged();
	}
	public void updateDemocratElectoralVotes(String stateName, int democratElectoralVotes) {
		getState(stateName).setDemocratElectoralVotes(democratElectoralVotes);
		votesChanged();
	}
	public void updateDemocratCitizenVotes(String stateName, int democratCitizenVotes) {
		getState(stateName).setDemocratCitizenVotes(democratCitizenVotes);
		votesChanged();
	}
	public void AddState(String stateName, int republicanElectoralVotes, int republicanCitizenVotes, int democratElectoralVotes, int democratCitizenVotes)
	{
		State state = new State(stateName, republicanElectoralVotes, republicanCitizenVotes, democratElectoralVotes, democratCitizenVotes);
		states.add(state);
	}
	
	public ArrayList<State> getAllStates()
	{
		return states;
	}
	private State getState(String name) {
		int i = 0;
		while(name != states.get(i).getName()) {
			i++;
		}
		return states.get(i);
	}
}
