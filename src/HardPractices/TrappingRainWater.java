package HardPractices;

public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0; // No se puede atrapar agua con menos de 3 alturas
        }

        int left = 0; // Puntero izquierdo
        int right = n - 1; // Puntero derecho
        int leftMax = 0; // Máximo a la izquierda
        int rightMax = 0; // Máximo a la derecha
        int waterTrapped = 0; // Agua atrapada total

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
