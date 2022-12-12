package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Chapter3Video3 {
    public static void main(String[] args) {

        //For ArrayList
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        System.out.println("ArrayList : " + list.toString());

        //For LinkedList
        List<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(3);
        linkedlist.add(4);

        System.out.println("LinkedList : " + list.toString());

        //For Stack
        List<Integer> stack = new Stack<Integer>();
        stack.add(5);
        stack.add(6);

        System.out.println("Stack : " + stack.toString());
    }
}
