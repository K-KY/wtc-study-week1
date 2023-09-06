package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        System.out.println(frogging(word));
        return answer;
    }
    static String frogging(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'Z') {
                sb.append(frogLower(str.charAt(i)));
                continue;
            }
            sb.append(frogUpper(str.charAt(i)));
        }
        return sb.toString();
    }
    static char frogLower(char c) {
        return (char) ('a' + ('z' - c));
    }
    static char frogUpper(char c) {
        return (char)('A' + ('Z' - c));
    }
}
//A = 65 Z = 90
//B = 66
//a = 97 z = 122
