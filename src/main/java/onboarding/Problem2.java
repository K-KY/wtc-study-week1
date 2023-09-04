package onboarding;

import onboarding.problem2.SlidingWindow;
public class Problem2 {
    public static String solution(String cryptogram) {
        String answer;
        String result =  new SlidingWindow().sliding(cryptogram.split(""));
        answer = result.substring(1, result.length() - 1);
        return answer;
    }
}
