package Stacks;

import java.util.Stack;

public class BasicSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Khushi");
        st.push("pooja");
        st.push("Preet");
        st.push("Rishika");
        st.push("Vishal");
        st.push("Isha");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        String s = st.pop();
    }
}
