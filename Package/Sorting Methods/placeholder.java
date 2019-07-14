import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int evenArray = 0;
        int oddArray = 0;
        int [] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 = 0) {
                result[evenArray] = A[i];
                evenArray++;
                } else if (A[i] % 2 >= 1){
                result[oddArray] = A[i];
                oddArray++;
                }
            }
        return [evenArray, oddArray];
        }
    }
