package onboarding.problem1;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Integer> page = new ArrayList<>();
    // player 가 펼친 페이지를 넣음
    private int score = 0;
    //player 의 가장큰 값을 넣음
    private int id = 0;
    //player 의 id



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
