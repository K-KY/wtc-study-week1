package onboarding.problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Similarity {
    List<String> emails = new ArrayList<>();

    private void finder(List<List<String>> form, String[] windows) {
        for (int i = 0; i < form.size(); i++) {
            String crewEmail = form.get(i).get(0);
            String crewName = form.get(i).get(1);
            compare(windows, crewEmail, crewName);
        }
    }

    private void compare(String[] windows, String crewEmail, String crewName) {
        if (Arrays.equals(windows, new SlidingWindow().window(crewName))) {
            return;
        }
        for (int i = 0; i < windows.length; i++) {
            if (crewName.contains(windows[i]) && !emails.contains(crewEmail)) {
                emails.add(crewEmail);
            }

        }
    }
}
