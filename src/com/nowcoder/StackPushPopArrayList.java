package com.nowcoder;

import java.util.Stack;

public class StackPushPopArrayList {

    // 11 ms
    public boolean IsPopOrder(int [] pushA, int [] popA) {
        Stack<Integer> stack = new Stack();
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            int a = pushA[i];
            stack.push(a);
            if (a == popA[popIndex]) {
                stack.pop();
                ++popIndex;
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.peek();
            if (top != popA[popIndex]) {
                return false;
            } else {
                ++popIndex;
                stack.pop();
            }
        }
        return true;
    }

    /*** 19ms
    public boolean IsPopOrder(int [] pushA, int [] popA) {
        Stack<Integer> stack = new Stack();
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (popIndex < popA.length && !stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                ++popIndex;
            }
        }

        return stack.empty();
    }
    */
}
