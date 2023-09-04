package onboarding.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow {
    public String sliding(String[] psw) {
        List<String> result =new ArrayList<>(Arrays.asList(psw));
        for (int i = 0; i < result.size(); i++) {
            i = compare(i, result);
        }
        return result.toString().replace(", ", "");
    }
    public int compare(int i, List<String> psw) {
        int index = i;
        if (i < psw.size() - 1 && psw.get(i).equals(psw.get(i + 1))) {
            psw.remove(i);
            psw.remove(i);
            index -= 1;
        }
        if (i < psw.size() && i > 0 && psw.get(i).equals(psw.get(i - 1))) {
            psw.remove(i);
            psw.remove(i - 1);
            index -= 2;
        }
        return index;
    }
}
