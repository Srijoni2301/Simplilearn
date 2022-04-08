package com.simplilearn.data_struct;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample2 
{
    public static void main(String[] args) 
    {
        Queue<Integer> locationsQueue = new LinkedList<>();
        locationsQueue.add(10);
        locationsQueue.add(100);
        locationsQueue.add(1000);
        locationsQueue.add(10000);
        locationsQueue.add(100000);
        locationsQueue.add(1000000);
        System.out.println("Queue is : " + locationsQueue);
        System.out.println("Size of Queue : " + locationsQueue.size());
        System.out.println("Head of Queue : " + locationsQueue.peek());
        locationsQueue.remove();
        System.out.println("Queue is : " + locationsQueue);
        System.out.println("Head of Queue : " + locationsQueue.peek());
        System.out.println("Size of Queue : " + locationsQueue.size());
    }
}
