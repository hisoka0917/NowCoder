package com.nowcoder;
import java.util.Stack;

public class MinStack {

    private Stack<Integer> nodes = new Stack();
    private Stack<Integer> minStack = new Stack();

    public void push(int node) {
        nodes.push(node);
        if (minStack.empty()) {
            minStack.push(node);
        } else {
            int top = minStack.peek();
            if (top > node) {
                minStack.push(node);
            } else {
                minStack.push(top);
            }
        }
    }

    public void pop() {
        minStack.pop();
        nodes.pop();
    }

    public int top() {
        return nodes.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
