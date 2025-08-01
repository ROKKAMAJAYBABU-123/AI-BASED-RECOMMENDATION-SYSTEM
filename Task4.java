package com.internship.codes;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<String, List<String>> userPreferences = new HashMap<>();

        userPreferences.put("Alice", Arrays.asList("Laptop", "Phone"));
        userPreferences.put("Bob", Arrays.asList("Laptop", "Tablet"));
        userPreferences.put("Charlie", Arrays.asList("Phone", "Smartwatch"));

        String targetUser = "Alice";
        Set<String> recommendations = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : userPreferences.entrySet()) {
            if (!entry.getKey().equals(targetUser)) {
                for (String item : entry.getValue()) {
                    if (!userPreferences.get(targetUser).contains(item)) {
                        recommendations.add(item);
                    }
                }
            }
        }

        System.out.println("🧠 Recommendations for " + targetUser + ": " + recommendations);
    }
}