package onboarding.problem5;

import java.util.ArrayList;
import java.util.List;

public class MoneyExchanger {
    private final int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

    public List<Integer> exchanger(int m) {
        List<Integer> hands = new ArrayList<>();
        for (int j : unit) {
            hands.add(m / j);
            //m/50000, m/10000.... 해서 나온 값을 hands 에넣는다 123456 원이면 m/50000 = 2
            m -= j * (m / j);
            //m 에서 m/j * j 만큼 뺀다 123456 이면 2 * 50000 = 100000, 123456 - 100000 = 23456
        }
        return hands;
    }
}
