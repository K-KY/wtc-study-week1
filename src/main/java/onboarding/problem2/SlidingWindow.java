package onboarding.problem2;

import java.util.List;

public class SlidingWindow {
    public List<String> compare(int i, List<String> psw) {
        if (i < psw.size() && psw.get(i).equals(psw.get(i + 1))) {
            psw.remove(i);
            psw.remove(i);
        }
        if (i < psw.size() && i > 0 && psw.get(i).equals(psw.get(i - 1))) {
            psw.remove(i);
            psw.remove(i - 1);
        }
        return psw;
    }
}
