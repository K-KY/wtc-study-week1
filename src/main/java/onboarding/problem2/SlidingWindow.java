package onboarding.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow {
    public String sliding(String[] psw) {

        //글자별로 나눠진 cryptogram 을 리스트에 넣는다
        List<String> result = new ArrayList<>(Arrays.asList(psw));
        for (int i = 0; i < result.size(); i++) {
            //i 와 result 를 같이 파라미터로 넣는다
            //i를 넣는건 result에서 삭제된 만큼 i 를 빼주기 위함
            i = compare(i, result);
        }
        //list를 그대로 String으로 바꿔서 리턴한다.  처음 값은 [a, b, c, d] 이므로 ", " 를 제거후 리턴한다
        return result.toString().replace(", ", "");
    }

    public int compare(int i, List<String> psw) {
        int index = i;
        //앞의 값과 같은경우
        if (i < psw.size() - 1 && psw.get(i).equals(psw.get(i + 1))) {
            psw.remove(i);
            //i 를 빼고 나면 i + 1 은 i 가 됨
            psw.remove(i);
            //[a, b, {c, d,} e, f, g]
            //i = e 가 됨 그럼 e 는 건너 뛰고 f부터 비교를 하니까 e 부터 시작하기 위해 -1
            index -= 1;
        }
        //뒤의 값과 같은경우
        if (i < psw.size() && i > 0 && psw.get(i).equals(psw.get(i - 1))) {
            psw.remove(i);
            psw.remove(i - 1);
            //[a, b, {c, d,} e, f, g]
            //i = f 가 됨 그럼 바로 g 로 가니까 e 부터 비교하기 위해 -2
            index -= 2;
        }
        return index;
    }
}
