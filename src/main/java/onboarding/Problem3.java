package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static int solution(int number) {
        int answer = starter(number);
        return answer;
    }
    static int counter(List<String> lst) {
        int count = 0;
        for (int i = 0; i < lst.size(); i++) {
            int n = Integer.parseInt(lst.get(i));
            if (n % 3 == 0 && n != 0) {
                count++;
            }
        }
        return count;
    }

    static int starter(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            count += counter(changeToList(i));
        }
        return count;
    }

    static List<String> changeToList(int number) {
        String[] s = String.valueOf(number).split("");
        return new ArrayList<>(Arrays.asList(s));
    }

}
