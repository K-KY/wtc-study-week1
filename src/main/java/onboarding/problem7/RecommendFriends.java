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
                //visitor가 친구가 아닐때
                isNotFriend(key, friendsMap);
            }
            if (friendsMap.get(key) != null) {
                //visitor가 친구일 때
                isFriend(friendsMap.get(key));
            }
        }
        score.remove(user);
        return score;
    }

    private void isNotFriend(String key, HashMap<String, List<String>> friendsMap) {
        //visitort가 친구가 아닐 때 친구의 친구인지 확인한다
        boolean[] booleans ={false};
        friendsMap.forEach((k, v) -> {
            //친구의 친구면 + 10점
            if (v.contains(key)) {
                score.put(key, score.getOrDefault(key, 0) + 10);
                booleans[0] = true;
            }
        });
        //boolean이 false 면 친구의 친구도 아님 + 1점
        if (!booleans[0]) {
            score.put(key, score.getOrDefault(key, 0) + 1);
        }
    }
    private void isFriend(List<String> friends) {
        //친구면 리스트에 있는 모두 +10점
        friends.forEach(v -> {
            score.put(v, score.getOrDefault(v, 0) + 10);
        });
    }

    public List<String> sortKey() {
        List<String> keySet = new ArrayList<>(score.keySet());
        //score의 keySet을 저장한다
            keySet.sort((o1, o2) -> score.get(o2).compareTo(score.get(o1)));
            //keySey을 value를 기준으로 내림차순 정렬한다 o2 > o1 이면 둘이 바꿈
        return keySet;
    }
}
