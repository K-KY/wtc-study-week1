package onboarding.problem1;

import java.util.List;

public class CompareMax {
    public void compare(List<Integer> page) {
        int max = 0;
        for (int i = 0; i < page.size(); i++) {
            max = Math.max(numberAssemble(page.get(i).toString().split("")), max);
        }
    }

    public int numberAssemble(String[] n) {
        int mul = 1;
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            mul *= Integer.parseInt(n[i]);
            sum += Integer.parseInt(n[i]);
        }
        return Math.max(mul, sum);
    }
}
