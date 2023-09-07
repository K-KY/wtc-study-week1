package onboarding.problem6;
public class SlidingWindow {
    public String[] window(String name) {
        String[] windows = new String[name.length() - 1];
        for (int i = 0; i < name.length() -1; i++) {
            windows[i] = String.valueOf(name.charAt(i)) + name.charAt(i + 1);
        }
        return windows;
    }
}
