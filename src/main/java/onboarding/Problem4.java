package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        answer = frogging(word);
        return answer;
    }
    static String frogging(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(frog(c));
        }
        return sb.toString();
    }
    static char frog(char c) {
        if (c >= 'a' && c <= 'z' ) {
            return (char) ('a' + ('z' - c));
        }
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
