public class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        int leftMoves = 0, rightMoves = 0, leftBalls = 0, rightBalls = 0;

        for (int i = 1; i < n; i++) {
            if (boxes.charAt(i - 1) == '1') {
                leftBalls++;
            }
            leftMoves += leftBalls;
            left[i] = leftMoves;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (boxes.charAt(i + 1) == '1') {
                rightBalls++;
            }
            rightMoves += rightBalls;
            right[i] = rightMoves;
        }

        for (int i = 0; i < n; i++) {
            answer[i] = left[i] + right[i];
        }

        return answer;
    }
}
