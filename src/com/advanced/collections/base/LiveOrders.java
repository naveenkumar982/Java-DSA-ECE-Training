package com.advanced.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public  static void main(String[] args)
    {
        Collection<String> liveOrders = new ArrayList();
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        //Check order
        System.out.println("ORD101 Available? Exists? " + liveOrders.contains("ORD101"));
        liveOrders.remove("ORD101");
        //Check all Orders:
        System.out.println("Live Orders: " + liveOrders + liveOrders.contains("ORD101"));
        liveOrders.clear();
        System.out.println("Live Orders: " + liveOrders);
    }
}
