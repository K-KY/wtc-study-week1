package onboarding;

import onboarding.problem2.SlidingWindow;
public class Problem2 {
    public static String solution(String cryptogram) {
        String answer;
        String result =  new SlidingWindow().sliding(cryptogram.split(""));//cryptogram 을 글자별로 분리해서 파라미터로 전달
        answer = result.substring(1, result.length() - 1);
        //리턴 받을때 ", " 를 제거해서 리턴 했으니까 [abcdefg]가 저장되어있음
        //양 끝의 브라켓의 index가 0, length() 까지니까 이 사이의 값만 뽑아서 저장한다
        return answer;
    }
}
