package onboarding.problem5;

import java.util.ArrayList;
import java.util.List;

public class MoneyExchanger {
    private final int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

    public List<Integer> exchanger(int m) {
        List<Integer> hands = new ArrayList<>();
        for (int j : unit) {
            hands.add(m / j);
            m -= j * (m / j);
        }
        return hands;
    }
}
