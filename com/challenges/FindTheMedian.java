package com.challenges;

import java.util.ArrayList;
import java.util.List;

public class FindTheMedian {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        /**
         * 1. 정렬 후, 가장 가운데 숫자 반환
         * 2. 처음으로 입력 받는 인자는 ARRAY의 길이
         * 3. 정렬을 끝까지 돌릴필요가 있네 그래야 가운데를 구하니까
         * 4. 가운데를 반환하는 방법에 대해도 생각 필요
         * 5. 무작정 나누기 2했을때의 값이 맞나?
         * 6. 7의 가운데는? 3.5 아 올림값 주면 되겠네
         * 7. 8의 가운데는? 1 2 3 4 5 6 7 8
         * 8. 항상 홀수의 숫자만 준대 그러면 결국 반을 나누면 됨
         * 9. 5, 3, 1, 2, 4 라고 한다면, 첫번쨰 숫자 5
         * 10. 첫번쨰 숫자와 다음 숫자를 비교. 더 작은것을 가져온다.
         * 11. 5와 3을 비교 3이 더 작은 숫자 그럼 비교 숫자 3이 됨.
         * 12. 3과 1을 비교 비교 더 작은 숫자 1이 됨.
         * 13. 1과 2 비교, 더 작은 숫자 1이 됨
         * 14. 1과 4 비교, 더 작은 숫자 1이 됨
         * 15. 이렇게 한바퀴 돈 다음에 어레이에 넣어줘야 함.
         * 16. 마지막으로 남은 숫자를 넣어줌
         * 17. arr에서 1을 뺀다. (기존 )
         * 18. 다시 arr의 0번째 숫자를 가져옴
         * 19. 5와 3을 비교함 3이 더 작음
         * 20. 3과 2를 비교함 2가 더 작음
         * 21. 2와 4를 비교함 2가 더 작음
         * 22. 2를 집어 넣는다
         * 23.
         */

        int arrSize = arr.size();

        if (arrSize > 1) {

            Integer comparingNumber = arr.get(0);
            List<Integer> sortedArray = new ArrayList<>();

            for (int i = 0 ; i < arrSize ; i ++) {



                if(comparingNumber < arr.get(i)) {
                    comparingNumber = arr.get(i);
                }

                if (i == arrSize - 1) {
                    arr.remove(comparingNumber);
                }
            }
        }

        return 0;
    }


}
