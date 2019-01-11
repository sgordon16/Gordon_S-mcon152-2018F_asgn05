import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class RepublicanFavoringStats extends VoterStatisticsStrategy implements Observer {

	private ArrayList<State> states;
	public RepublicanFavoringStats(Observable observable)
	{
		observable.addObserver(this);
		electoralCollegeStrategy = new ElectoralCollegeRepublicanStrategy2();
		popularVoteStrategy = new PopularVoteRepublicanStrategy();
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		
		if (observable instanceof VoterStatistics)
		{
			VoterStatistics voterStatistics = (VoterStatistics) observable;
			states = new ArrayList<State>(voterStatistics.getAllStates().size());
			for (State s : voterStatistics.getAllStates()) 
					states.add(new State(s));
			display();
		}
	}
	public void display() {
		System.out.println("\nRepublicanFavoringStats observer\n\n");
		super.display(states);
	}
}
