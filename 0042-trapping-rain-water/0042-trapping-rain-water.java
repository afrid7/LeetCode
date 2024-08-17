class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0; 
        }

        int n = height.length;
        int[] leftHighest = new int[n];
        int[] rightHighest = new int[n];
        leftHighest[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftHighest[i] = Math.max(leftHighest[i - 1], height[i]);
        }

        rightHighest[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightHighest[i] = Math.max(rightHighest[i + 1], height[i]);
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftHighest[i], rightHighest[i]) - height[i];
        }

        return water;
    }
}
