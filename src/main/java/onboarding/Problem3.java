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
            //3, 6, 9 가 3의 배수니까 각 숫자를 3으로 나눈 나머지가 0 이면 count++;
            if (n % 3 == 0 && n != 0) {
                count++;
            }
        }
        return count;
    }

    static int starter(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            //1부터 시작해서 number까지 counter 를 수행하고 리턴값을 count에 더한다
            count += counter(changeToList(i));
        }
        return count;
    }

    //굳이 List로 리턴 하지않아도 되는걸 마지막에 알아버림
    static List<String> changeToList(int number) {
        String[] s = String.valueOf(number).split("");
        //숫자를 하나씩 잘라서 리스트에 넣음
        return new ArrayList<>(Arrays.asList(s));
    }

}
