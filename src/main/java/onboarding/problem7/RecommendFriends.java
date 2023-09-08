package onboarding.problem7;

import com.sun.source.tree.Tree;
import org.assertj.core.error.ShouldContainSubsequence;

import java.util.*;

public class RecommendFriends {
    Map<String, Integer> score = new TreeMap<>();


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
}
