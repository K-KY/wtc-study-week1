package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        return answer;
    }
    static int counter(List<String> lst) {
        int cnt = 0;
        for (int i = 0; i < lst.size(); i++) {
            int n = Integer.parseInt(lst.get(i));
            if (n % 3 == 0) {
                cnt++;
            }
        }
        return cnt;
    }


    static List<String> changeToList(int number) {
        String[] s = String.valueOf(number).split("");
        List<String> num = new ArrayList<>(Arrays.asList(s));
        return num;
    }

}
