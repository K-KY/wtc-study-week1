package onboarding.problem1;

import java.util.List;

public class Pobi extends Player {
    //클래스를 선언 할 때 List를 파라미터로 받고 id랑 같이 바로 저장한다
    public Pobi(List<Integer> page) {
        setId(1);
        setPage(page);
    }
}
