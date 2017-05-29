package composite;

import java.util.ArrayList;
import java.util.List;

public class Friend {
	
	private String name;
	
	private List<Friend> friends;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	public Friend(String name) {
		super();
		this.name = name;
		this.friends = new ArrayList<Friend>();
	}
	
    public void addFriend(Friend friend) {
    	friends.add(friend);
    }

	@Override
	public String toString() {
		return name;
	}
    

}
