package com.company.Day1;

import java.util.Stack;

public class Main {

    static void revereStack(Stack<Integer> st) {
        System.out.println("Recur"+st);
        if(st.isEmpty()){
            return;
        } else {
            int data = st.pop();
            revereStack(st);
            push(st, data);
            System.out.println("Executed");
        }
    }

    static void push(Stack<Integer> stack, int data) {
        stack.push(data);
        System.out.println("Pushed" + stack);
    }


    public static void main(String[] args) {
	// write your code here
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        revereStack(st);

        System.out.println("Stack " + st);
    }
}
