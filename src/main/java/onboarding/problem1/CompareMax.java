package onboarding.problem1;

import java.util.List;

public class CompareMax {
    public Player compare(Player player) {
        int max = 0;
        for (int i = 0; i < player.getPage().size(); i++) {
            max = Math.max(numberAssemble(player.getPage().get(i).toString().split("")), max);
        }
        player.setScore(max);
        return player;
    }
    public int compare(List<Integer> page) {
        int max = 0;
        for (int i = 0; i < page.size(); i++) {
            max = Math.max(numberAssemble(page.get(i).toString().split("")), max);
        }
        return max;
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

    public int compareResult(int p, int c) {
        if (p > c) {
            return 1;
        }
        if (p < c) {
            return 2;
        }
        return 0;
    }
    public int compareResult(Pobi p, Crong c) {
        if (p.getScore() > c.getScore()) {
            return p.getId();
        }
        if (p.getScore() < c.getScore()) {
            return c.getId();
        }

        return 0;
    }

}
