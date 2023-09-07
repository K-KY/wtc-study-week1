package onboarding;

import onboarding.problem5.MoneyExchanger;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        answer = new MoneyExchanger().exchanger(money);
        return answer;
    }
}
