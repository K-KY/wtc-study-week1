package onboarding.problem7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserFriends {
    HashMap<String, List<String>> friendMap = new HashMap<>();
    public HashMap<String, List<String>> findFriends(String user, List<List<String>> friends) {
        for (int i = 0; i < friends.size(); i++) {
            String friend = friends.get(i).get(1);
            if (friend.equals(user)) {
                makeFriendList(friend, friends);
            }
        }
        return friendMap;
    }

    private void makeFriendList(String friend, List<List<String>> friends) {
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).get(0).equals(friend)) {
                List<String> friendList = friendMap.getOrDefault(friend, new ArrayList<>());
                friendList.add(friends.get(i).get(1));
                friendMap.put(friend, friendList);
            }
        }
    }
}
