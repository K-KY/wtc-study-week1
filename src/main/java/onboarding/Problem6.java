package onboarding;

import onboarding.problem6.Similarity;

import java.util.Collections;
import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        Similarity s = new Similarity();
        answer = s.similarityCheck(forms);
        Collections.sort(answer);
        //정렬 후 리턴
        return answer;
    }
}
