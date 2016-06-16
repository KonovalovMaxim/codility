import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A, int X) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        List<Integer> valid = map.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        int count = 0;
        int duplicatesCount = 0;
        int result = 0;
        Collections.sort(valid);
        for (Integer number : valid) {
            int factor = (int) Math.ceil((double) X / (double) number);
            int index = Collections.binarySearch(valid, factor);
            if (index < 0) {
                index = -index - 1;
            }
            count += valid.size() - index;
            if (number >= factor) {
                if (map.get(number) >= 4) {
                    duplicatesCount++;
                }
                count--;
            }
            result = count / 2 + duplicatesCount;
            if (result > 1000000000) {
                return -1;
            }
        }
        return result;
    }

    public int nativeSolution(int[] A, int X) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) == null) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        ArrayList<Integer> valid = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            valid.add(entry.getKey());
        }
        int count = 0;
        Arrays.sort(A);
        for (Integer firstNumber : valid) {
            for (Integer secondNumber : valid) {
                if (firstNumber * secondNumber >= X) {
                    if (firstNumber == secondNumber) {
                        if (map.get(firstNumber) >= 4) {
                            count++;
                        }
                    } else if (map.get(firstNumber) >= 2 && map.get(secondNumber) >= 2) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}