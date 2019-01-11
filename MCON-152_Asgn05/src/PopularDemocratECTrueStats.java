
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class PopularDemocratECTrueStats extends VoterStatisticsStrategy implements Observer {
	
	private ArrayList<State> states;
	public PopularDemocratECTrueStats(Observable observable)
	{
		observable.addObserver(this);
		electoralCollegeStrategy = new ElectoralCollegeHonestStrategy();
		popularVoteStrategy = new PopularVoteDemocratStrategy();
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
		System.out.println("\nPopularDemocratECTrueStats observer\n\n");
		super.display(states);
	}
}
