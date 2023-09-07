package onboarding.problem1;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> page = new ArrayList<>();
    private int score = 0;
    int id = 0;

    protected void setId(int id) {
        this.id = id;
    }

    protected void setScore(int score) {
        this.score = score;
    }

    protected int getScore() {
        return score;
    }

    protected void setPage(List<Integer> page) {
        this.page = page;
    }

    protected int getId() {
        return id;
    }

    protected List<Integer> getPage() {
        return page;
    }
}
