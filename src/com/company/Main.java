package com.company;

import com.company.Structural.Bridge.FirstImplementation.FifoCollection;
import com.company.Structural.Bridge.FirstImplementation.Queue;
import com.company.Structural.Bridge.FirstImplementation.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SingleLinkedList<>());
        collection.offer(10);
        collection.offer(20);
        collection.offer(40);
        collection.offer(60);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());

        System.out.println(collection.poll());

    }



}
