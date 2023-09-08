package onboarding.problem1.validator;

import java.util.ArrayList;
import java.util.List;

public class Validate {
    public Validate() {
    }
    public int validate(List<Integer> pobi, List<Integer> crong){
        try{
            //숫자가 페이지의 양 끝의 수인지 확인하고 pobi의 페이지와 crong의 페이지를 같이 넣어 리턴한다
            List<Integer> page = numPolar(pobi, crong);
            //숫자가 이어지는지 확인한다
            numberContinuity(page);
        }catch (Exception e) {
            //예외 시 예외 메세지를 Intege로 변환해서 리턴한다
            return Integer.parseInt(e.getMessage());
        }
        return Integer.MAX_VALUE;
    }

    public  List<Integer> numPolar(List<Integer> pobi, List<Integer> crong) {

        //pages 에 pobi와 crong의 값을 넣는다
        List<Integer> pages = new ArrayList<>(pobi);
        pages.addAll(crong);
        //1 또는 400이 포함되는지 확인한다
        if (pages.contains(1) || pages.contains(400)) {
            throw new IllegalArgumentException("-1");
        }
        return pages;
    }

    public  void numberContinuity(List<Integer> pages) {
        //0, 1 은 pobi, 2, 3 은 crong 이므로 2씩 증가시키며 확인한다
        for (int i = 0; i < pages.size() - 1; i += 2) {
            //0이 왼쪽페이지 1이 오른쪽 페이지 -> 왼쪽 페이지에 +1 후 오른쪽 페이지와 비교해서 다르면 예외
            if (pages.get(i) + 1 != pages.get(i + 1)) {
                throw new IllegalArgumentException("-1");
            }
        }
    }

}
