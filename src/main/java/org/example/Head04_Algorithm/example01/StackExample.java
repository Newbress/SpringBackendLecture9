package org.example.Head04_Algorithm.example01;

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> oldStack = new Stack<>();
        oldStack.push(10);
        oldStack.push(20);
        System.out.println("[oldStack 결과]");
        int firstPop = oldStack.pop();
        System.out.println("oldStack 첫 번째 pop: " + firstPop);
        int secondPeek = oldStack.peek();
        System.out.println("oldStack 두 번째 peek: " + secondPeek);
        int secondPop = oldStack.peek();
        System.out.println("oldStack 두 번째 pop: " + secondPop);

        Deque<Integer> stackWothArratDeque = new ArrayDeque<>();
        stackWothArratDeque.push(10);
        stackWothArratDeque.push(20);
        System.out.println("\n[stackWithArratDeque 결과]");
        System.out.println("stackWithArrayDeque pop : " + stackWothArratDeque.pop());
        System.out.println("stackWithArrayDeque 다음요소 peek : " + stackWothArratDeque.peek());
    }
}
