class Solution {
    public int solution(String S) {
        if (S.length() == 1) {
            return 0;
        }
        if (S.length() % 2 == 0) {
            return -1;
        }
        int mid = S.length() / 2;
        for (int i = 0; i < S.length() / 2 + 1; i++) {
            int left = mid - i;
            int right = mid + i;
            if (S.charAt(left) != S.charAt(right)) {
                return -1;
            }
        }
        return mid;
    }
}