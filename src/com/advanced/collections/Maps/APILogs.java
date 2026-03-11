package com.advanced.collections.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class APILogs {
    public static void main(String[] args) {
        Map<String,String> logs = new LinkedHashMap<>();
        logs.put("5","Signup");
        logs.put("4","login");
        logs.put("3","Browse Instagram Reels");
        logs.put("2","Scrollup and down");
        logs.put("1","logout");
        System.out.println(logs);
    }
}
