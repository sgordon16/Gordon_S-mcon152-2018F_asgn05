import java.util.concurrent.TimeUnit;

public class Program {

	public static void main(String[] args) throws InterruptedException {

		VoterStatistics voterStatistics = new VoterStatistics();
		PopularDemocratECRepublicanStats display1 = new PopularDemocratECRepublicanStats(voterStatistics);
		PopularDemocratECTrueStats display2 = new PopularDemocratECTrueStats(voterStatistics);
		RepublicanFavoringStats display3 = new RepublicanFavoringStats(voterStatistics);
		DemocratFavoringStats display4 = new DemocratFavoringStats(voterStatistics);
		TrueStats display5 = new TrueStats(voterStatistics);

		voterStatistics.AddState("New York", 2, 54240, 2, 49580);
		//TimeUnit.SECONDS.sleep(2);
		voterStatistics.AddState("New Jersey", 1, 46240, 1, 49690);
		//TimeUnit.SECONDS.sleep(2);
		voterStatistics.AddState("Texas", 1, 29230, 2, 25560);
		//TimeUnit.SECONDS.sleep(2);
		voterStatistics.AddState("California", 2, 58270, 2, 47660);
		//TimeUnit.SECONDS.sleep(2);
		voterStatistics.AddState("Colorado", 1, 16940, 1, 15880);
		//TimeUnit.SECONDS.sleep(2);
		
		System.out.println("\n\nDisplaying....\n\n");
		
		System.out.println("\n\nDisplay1\n\n");
		display1.update(voterStatistics, new String());
		System.out.println("\n\nDisplay2\n\n");
		display2.update(voterStatistics, new String());
		System.out.println("\n\nDisplay3\n\n");
		display3.update(voterStatistics, new String());
		System.out.println("\n\nDisplay4\n\n");
		display4.update(voterStatistics, new String());
		System.out.println("\n\nDisplay5\n\n");
		display5.update(voterStatistics, new String());
		
		System.out.println("\n\nUpdating....\n\n");
		
		voterStatistics.updateDemocratCitizenVotes("New York", 55420);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("New York", 3);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("New York", 50250);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("New York", 2);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("New Jersey", 47960);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("New Jersey", 2);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("New Jersey", 52870);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("New Jersey", 3);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("Texas", 30120);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("Texas", 4);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("Texas", 27800);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("Texas", 2);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("California", 61230);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("California", 3);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("California", 49400);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("California", 3);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("Colorado", 18660);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("Colorado", 2);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("Colorado", 16490);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("Colorado", 2);
//		
//		System.out.println("\n\nDisplaying....\n\n");
//		
//		System.out.println("\n\nDisplay1\n\n");
//		display1.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay2\n\n");
//		display2.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay3\n\n");
//		display3.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay4\n\n");
//		display4.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay5\n\n");
//		display5.update(voterStatistics, new String());
//		
//		System.out.println("\n\nUpdating....\n\n");
//		
//		voterStatistics.updateDemocratCitizenVotes("New York", 55770);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("New York", 2);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("New York", 51340);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("New York", 3);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("New Jersey", 49920);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("New Jersey", 3);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("New Jersey", 52870);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("New Jersey", 2);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("Texas", 30210);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("Texas", 3);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("Texas", 27800);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("Texas", 3);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("California", 61950);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("California", 3);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("California", 51210);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("California", 2);
//		TimeUnit.SECONDS.sleep(10);
//		
//		voterStatistics.updateDemocratCitizenVotes("Colorado", 19690);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateDemocratElectoralVotes("Colorado", 3);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanCitizenVotes("Colorado", 184100);
//		TimeUnit.SECONDS.sleep(10);
//		voterStatistics.updateRepublicanElectoralVotes("Colorado", 1);
//		
//		System.out.println("\n\nDisplaying....\n\n");
//		
//		System.out.println("\n\nDisplay1\n\n");
//		display1.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay2\n\n");
//		display2.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay3\n\n");
//		display3.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay4\n\n");
//		display4.update(voterStatistics, new String());
//		System.out.println("\n\nDisplay5\n\n");
//		display5.update(voterStatistics, new String());
		
	}

}
