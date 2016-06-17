class Solution {
    public int solution(int[] A) {
        return mergeSort(A);
    }

    int mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }

    int mergeSort(int A[], int temp[], int left, int right) {
        int mid, invCount = 0;
        if (right > left) {
            mid = (right + left) / 2;
            invCount = mergeSort(A, temp, left, mid);
            invCount += mergeSort(A, temp, mid + 1, right);
            invCount += merge(A, temp, left, mid + 1, right);
            if (invCount >= 1000000000) {
                return -1;
            }
        }
        return invCount;
    }

    int merge(int A[], int temp[], int left, int mid, int right) {
        int i, j, k;
        int invCount = 0;
        i = left;
        j = mid;
        k = left;
        while ((i <= mid - 1) && (j <= right)) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
                // http://geeksforgeeks.org/wp-content/uploads/2010/01/inv_count2.GIF
                invCount = invCount + (mid - i);
            }
        }
        while (i <= mid - 1) {
            temp[k++] = A[i++];
        }
        while (j <= right) {
            temp[k++] = A[j++];
        }
        for (i = left; i <= right; i++) {
            A[i] = temp[i];
        }
        return invCount;
    }

    public int nativeSolution(int[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[i]) {
                    count++;
                }
            }
            if (count >= 1000000000) {
                return -1;
            }
        }
        return count;
    }
}