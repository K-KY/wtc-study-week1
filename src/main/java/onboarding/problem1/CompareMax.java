package onboarding.problem1;

import java.util.List;

public class CompareMax {
    //player 클래스를 파라미터로 받는다
    public Player compare(Player player) {
        int max = 0;
        for (int i = 0; i < player.getPage().size(); i++) {
            max = numberAssemble(player.getPage().get(i).toString().split(""));
            //numberAssemble 메소드에서 리턴한 값중 더 큰값을 저장한다
        }
        player.setScore(max);
        //max 를 player 에 저장하고 리턴한다
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
        //곱한 값
        int sum = 0;
        //더한 값
        for (int i = 0; i < n.length; i++) {
            mul *= Integer.parseInt(n[i]);
            //페이지의 각 자리의 숫자를 곱한다.
            sum += Integer.parseInt(n[i]);
            //페이지의 각 자리의 숫자를 더한다
        }
        //곱한 값과 더한 값중 더 큰값을 리턴한다
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
    //Player클래스를 상속받은 Pobi와 Crong 클래스를 파라미터로 받는다
    public int compareResult(Pobi p, Crong c) {
        //각 객체에 저장되있는 값을 비교하고 id를 리턴한다
        if (p.getScore() > c.getScore()) {
            return p.getId();
        }
        if (p.getScore() < c.getScore()) {
            return c.getId();
        }
        //무승부
        return 0;
    }

}
