package singleton;



public class SoccerBallLazy {

	public static volatile  SoccerBallLazy soccBallLazy;
	
	public SoccerBallLazy() {};
	
	public static SoccerBallLazy getSoccerBallLazy()
	{if (soccBallLazy==null)
		synchronized (SoccerBallLazy.class) {
			if (soccBallLazy==null)
			{
				soccBallLazy=new SoccerBallLazy();
				
			}
		}
		return soccBallLazy;
	}
}
