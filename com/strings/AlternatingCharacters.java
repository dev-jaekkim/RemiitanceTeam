package com.strings;

public class AlternatingCharacters {
    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */


    /**
     * 양 옆의 일치하는 캐릭터 제거
     * 1. 첫번째 캐릭터와 옆을 비교한다. 둘이 같다면, 오른쪽을 제거한다.
     * 2. 그 다음에 오는 캐릭터를 비교한다.
     * 3. 같다면 제거
     * 4. 이렇게 반복해서, 최종 cnt 숫자를 반환
     *
     * @param s 주어지는 문자열
     * @return 최소 제거해야 하는 문자의 수
     */

    public static int alternatingCharacters(String s) {
        // Write your code here

        int sizeOfString = s.length();
        int deletionCount = 0;

        if (sizeOfString > 1) {
            char lastLetter = s.charAt(sizeOfString - 1);
            for (int i = sizeOfString; i > 1; i--) {
                if (lastLetter == s.charAt(i - 2)) {
                    deletionCount++;
                }
                lastLetter = s.charAt(i - 2);

            }
        }

        return deletionCount;
    }

}
