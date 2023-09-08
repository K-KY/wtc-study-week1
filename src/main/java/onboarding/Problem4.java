package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer;
        answer = frogging(word);
        return answer;
    }
    static String frogging(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //str 의 i번째 글자를 잘라서 c에 넣음
            sb.append(frog(c));
            //frog의 리턴값을 스트링빌더에 넣음
        }
        return sb.toString();
    }
    static char frog(char c) {
        if (c >= 'a' && c <= 'z' ) {
            //c 가 'b' 일때 개구리 사전에서는 'y'
            //'z' - c = 122 - 98 = 24
            //'a' + 24 = 97 + 24 = 121
            return (char) ('a' + ('z' - c));
        }
        //if 문 에서 리턴을 안했으면 알파벳이 아니거나 대문자일 경우임
        return frogUpper(c);
    }
    static char frogUpper(char c) {
        if (c >= 'A' && c <= 'Z' ) {
            return (char)('A' + ('Z' - c));
        }
        return c;
    }
}
//A = 65 Z = 90
//B = 66
//a = 97 z = 122
