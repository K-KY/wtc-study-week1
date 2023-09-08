package onboarding.problem7;

import com.sun.source.tree.Tree;
import org.assertj.core.error.ShouldContainSubsequence;

import java.util.*;

public class RecommendFriends {
    Map<String, Integer> score = new TreeMap<>();
    String user;
    public RecommendFriends(String user) {
        this.user = user;
    }

    public Map<String, Integer> recommend(List<String> visitor, HashMap<String, List<String>> friendsMap) {
        for (int i = 0; i < visitor.size(); i++) {
            String key = visitor.get(i);
            if (friendsMap.get(key) == null) {
                isNotFriend(key, friendsMap);
            }
            if (friendsMap.get(key) != null) {
                isFriend(friendsMap.get(key));
            }
        }
        score.remove(user);
        return score;
    }

    private void isNotFriend(String key, HashMap<String, List<String>> friendsMap) {
        boolean[] booleans ={false};
        friendsMap.forEach((k, v) -> {
            if (v.contains(key)) {
                score.put(key, score.getOrDefault(key, 0) + 10);
                booleans[0] = true;
            }
        });
        if (!booleans[0]) {
            score.put(key, score.getOrDefault(key, 0) + 1);
        }
    }
    private void isFriend(List<String> friends) {
        friends.forEach(v -> {
            score.put(v, score.getOrDefault(v, 0) + 10);
        });
    }

    public List<String> sortKey() {
        List<String> keySet = new ArrayList<>(score.keySet());
        keySet.sort((o1, o2) -> score.get(o2).compareTo(score.get(o1)));
        System.out.println(keySet);
        return keySet;
    }
}
