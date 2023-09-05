package onboarding;

import onboarding.problem1.CompareMax;
import onboarding.problem1.validator.Validate;

import java.util.ArrayList;
import java.util.List;

/*
* 책을 임의로 펼친다.
왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
점수를 비교해 가장 높은 사람이 게임의 승자가 된다.
시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다.
*
* 예외 확인
* 페이지가 1 or 400 인지 확인
* 페이지 번호가 이어지지 않는지 확인
*
* 각 숫자 곱하고 더하기
* 왼쪽 숫자 곱하고 더한 값 중 max
* 오른쪽 숫자 곱하고 더한 값 중 max
* max1,max2 중 max
* pobimax, crongmax 중 max
*
* 포비와 크롱이 펼친 페이지가 들어있는 리스트/배열 pobi와 crong이 주어질 때, 포비가 이긴다면 1, 크롱이 이긴다면 2, 무승부는 0, 예외사항은 -1로 return 하도록 solution 메서드를 완성하라.

제한사항
pobi와 crong의 길이는 2이다.
pobi와 crong에는 [왼쪽 페이지 번호, 오른쪽 페이지 번호]가 순서대로 들어있다.

*/
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        answer = new Validate().validate(pobi, crong);
        if (answer != -1) {
            CompareMax compareMax = new CompareMax();
            int p = compareMax.compare(pobi);
            int c = compareMax.compare(crong);
            answer = compareMax.compareResult(p, c);
        }

        return answer;
    }

}