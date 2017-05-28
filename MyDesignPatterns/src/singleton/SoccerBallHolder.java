package singleton;

public class SoccerBallHolder {

	private SoccerBallHolder() {}
	
	public static class Holder{
		
		private static final SoccerBallHolder soccerBallHolder= new SoccerBallHolder();
		
	}

	 public static SoccerBallHolder getInstance(){
         return Holder.soccerBallHolder;
     }
}
