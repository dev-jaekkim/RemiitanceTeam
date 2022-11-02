package com.dfs;

import java.util.ArrayList;

public class Problem {

    /**
     * 주차요금 계산 - 프로그래머스
     *
     * @param fees    기본시간, 기본요금, 단위시간, 단위 요금
     * @param records 시간, 차량번호, 내역(입차 or 출차)
     * @return int[] answer 차량번호가 작은 순서대로 주차 요금
     */
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        ArrayList<String> carNumber = new ArrayList<>();
        ArrayList<String> inOutTime = new ArrayList<>();
        ArrayList<String> history = new ArrayList<>();

        int recordLength = records.length;

        for (int i = 0; i < recordLength; i++) {
            String[] splitRecord = records[i].split(" ");
            carNumber.add(splitRecord[0]);
            inOutTime.add(splitRecord[1]);
            history.add(splitRecord[2]);
//            System.out.println("자동차 숫자: " + carNumber.get(i));
//            System.out.println("출입차 시간: " + inOutTime.get(i));
//            System.out.println("내역 : " + history.get(i));
        }

        // in out time은 분으로 변경을 하여, 시간을 빼준다.




        /**
         * records에 있는 기록들을 한번 정렬을 할까?
         * 일단 2개를 기준으로 된다고 생각해보자.
         */

        //answer에 담을 때는, 중복 허용하지 않고, 무조건 정렬되는 곳에 담으면 됨



        return answer;
    }

    public static void main(String[] args) {
        Problem problem = new Problem();
        int[] fees = {1, 461, 1, 10};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        problem.solution(fees, records);
    }

}
