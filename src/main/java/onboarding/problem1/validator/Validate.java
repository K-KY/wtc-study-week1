package onboarding.problem1.validator;

import java.util.ArrayList;
import java.util.List;

public class Validate {
    public  Validate(List<Integer> pobi, List<Integer> crong) {
        validate(pobi, crong);
    }
    public void validate(List<Integer> pobi, List<Integer> crong){
        try{
            List<Integer> page = numPolar(pobi, crong);
            numberContinuity(page);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public  List<Integer> numPolar(List<Integer> pobi, List<Integer> crong) {
        List<Integer> pages = new ArrayList<>(pobi);
        pages.addAll(crong);
        if (pages.contains(1) || pages.contains(400)) {
            throw new IllegalArgumentException("-1");
        }
        return pages;
    }

    public  void numberContinuity(List<Integer> pages) {
        for (int i = 0; i < pages.size() - 1; i += pages.size() / 2) {
            if (pages.get(i) + 1 != pages.get(i + 1) && i < pages.size() - 1) {
                throw new IllegalArgumentException("-1");
            }
        }
    }

}
