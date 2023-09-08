package onboarding.problem6;
public class SlidingWindow {
    public String[] window(String name) {
        String[] windows = new String[name.length() - 1];
        //이름이 10글자면 2글자로 나눠진 갯수는 9개
        for (int i = 0; i < name.length() -1; i++) {
            windows[i] = String.valueOf(name.charAt(i)) + name.charAt(i + 1);
        }

        return windows;
    }
}
