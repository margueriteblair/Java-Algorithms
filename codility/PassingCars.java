public class PassingCars {
    public static void main(String[] args) {
        solution(new int[] {0, 1, 0, 1, 1});
    }


    public static int solution(int[] A) {
        int passingCount = 0;
        int[] sumsArr = new int[A.length+1];
        for (int i = A.length-1; i >= 0; i--) {
            sumsArr[i] = A[i] + sumsArr[i+1];
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) passingCount+=sumsArr[i];
        }

        return passingCount > 1000000000 ? -1 : passingCount;
    }
}