package PG_week3;

import java.util.Stack;

public class PG_12906 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1,1,3,3,0,1,1};
        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty() || arr[i] != stack.peek()) {
                stack.push(arr[i]);
                int num = arr[i];
            }
        }
        System.out.println(stack.toString());
    }

}
