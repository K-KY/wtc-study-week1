package onboarding.problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Similarity {
    List<String> emails = new ArrayList<>();
    public List<String> similarityCheck(List<List<String>> forms) {
        for (int i = 0; i < forms.size(); i++) {
            String crewName = forms.get(i).get(1);
            String[] windows = new SlidingWindow().window(crewName);
            //이름을 두글자씩 나눠서 저장한다 -> 가나다 = 가나, 나다

            finder(forms, windows);
        }
        return emails;
    }

    private void finder(List<List<String>> form, String[] windows) {
        for (int i = 0; i < form.size(); i++) {
            String crewEmail = form.get(i).get(0);
            String crewName = form.get(i).get(1);
            compare(windows, crewEmail, crewName);
        }
    }

    private void compare(String[] windows, String crewEmail, String crewName) {
        if (Arrays.equals(windows, new SlidingWindow().window(crewName))) {
            //이게 둘이 같으면 같은 사람이니까 그냥 리턴
            return;
        }
        for (int i = 0; i < windows.length; i++) {
            //만약 windows 중 하나라도 같으면 중복이니까 emails 에 추가, 중복값으 들어가지 않도록 조건 넣음
            if (crewName.contains(windows[i]) && !emails.contains(crewEmail)) {
                emails.add(crewEmail);
                break;
            }

        }
    }
}
