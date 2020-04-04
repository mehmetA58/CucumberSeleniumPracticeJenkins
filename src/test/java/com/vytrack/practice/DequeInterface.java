package com.vytrack.practice;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
            public static void main(String[] args) {
                Deque<Integer>deque=new ArrayDeque<>();

                deque.push(10);
                deque.push(20);
                deque.push(30);
                deque.push(40);

                System.out.println(deque);
                System.out.println(deque.pop());
                System.out.println(deque.pop());
                System.out.println(deque);
                deque.addFirst(15);
                System.out.println(deque);
                deque.addLast(25);
                System.out.println(deque);










            }
}
