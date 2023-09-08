package onboarding;

import onboarding.problem7.RecommendFriends;
import onboarding.problem7.UserFriends;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//user의 친구의 친구인 목록을 만든다
// 방문자 목록의 값이 user의 친구가 있다면 그 친구들의 점수 +10
//아니면 +1
//친구의 친구가 직접 방문하면 + 10
public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        RecommendFriends recommendFriends = new RecommendFriends(user);
        List<String> answer = Collections.emptyList();
        HashMap<String, List<String>> friendsMap = new UserFriends().findFriends(user, friends);
        recommendFriends.recommend(visitors, friendsMap);
        answer = recommendFriends.sortKey();
        return answer;
    }
}
