package singleton;

public class Main {

	public static void main(String[] args) {
		
		SoccerBallEager soccerBallEager = SoccerBallEager.getSoccerBallEager();
		System.out.println(soccerBallEager);
		
		
		SoccerBallLazy soccerBallLazy= SoccerBallLazy.getSoccerBallLazy();
		System.out.println(soccerBallLazy);

		SoccerBallHolder soccerBallHolder=SoccerBallHolder.getInstance();
		System.out.println(soccerBallHolder);
		
		
		SingletonEnum singletonEnum=SingletonEnum.INSTANCE;
		singletonEnum.checkSingletonEnum();
	}

}
