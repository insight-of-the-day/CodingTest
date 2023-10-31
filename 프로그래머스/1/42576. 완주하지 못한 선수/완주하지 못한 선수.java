import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 목록을 해시맵에 추가
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 목록을 해시맵에서 빼기
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 완주하지 못한 선수 찾기
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }

        return ""; // 모든 참가자가 완주한 경우
    }
}
