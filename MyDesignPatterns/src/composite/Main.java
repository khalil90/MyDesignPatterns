package composite;

public class Main {

	public static void main(String[] args) {
	
		Friend khalil= new Friend("Khalil");
		Friend david= new Friend("David");
        Friend sarah=new Friend("Sarah");
        Friend michel= new Friend("Michel");
		Friend monica=new Friend("Monica");
		
		khalil.addFriend(david);
		khalil.addFriend(sarah);
		
		david.addFriend(michel);
		
		sarah.addFriend(monica);
		
		System.out.println("friends of Khalil are="+khalil.getFriends().toString());
		
		System.out.println("friends of David are="+david.getFriends().toString());
		
		System.out.println("friends of Sarah are="+sarah.getFriends().toString());
		
		System.out.print("Whole circle of friendship of Khalil :");
		for (Friend f :khalil.getFriends())
		{
			
			System.out.print(f.toString()+" ");
			for (Friend friend:f.getFriends())
				System.out.print(friend.toString()+" ");
			
		}
		
	}

}
