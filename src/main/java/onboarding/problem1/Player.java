package onboarding.problem1;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Integer> page = new ArrayList<>();
    int score = 0;
    int id = 0;

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setPage(List<Integer> page) {
        this.page = page;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getPage() {
        return page;
    }
}
