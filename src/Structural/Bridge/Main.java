package Structural.Bridge;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LivingThings livingThings = new Fish(new WaterBreathe());
        livingThings.breatheProcess();
    }
}


class Solution {
    private int[] solve(int[] temp) {
        int[] result = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        for (int i = 1; i < temp.length; i++) {
            int index = -1;
            while (stack.size() > 0 && temp[stack.peek()] < temp[i]) {
                index = stack.remove(0);
            }
            stack.add(i);
            if (index != -1) {
                result[index] = i - index;
            }

        }
        return result;
    }
    public int[] dailyTemperatures(int[] temperatures) {
        return solve(temperatures);
    }
}