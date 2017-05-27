package singleton;

public class SoccerBallEager {

	
	private static SoccerBallEager soccerBallEager= new SoccerBallEager();
	
	private SoccerBallEager() {}
	
	public static SoccerBallEager getSoccerBallEager()
	{
		return soccerBallEager;
	}
}
