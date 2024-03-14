package com.learning.core.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class D03P09 {
	    public static boolean canFormCircle(String[] strings) {
	        if (strings == null || strings.length == 0) {
	            return false;
	        }

	        Map<Character, List<String>> graph = new HashMap<>();
	        for (String str : strings) {
	            char startChar = str.charAt(0);
	            char endChar = str.charAt(str.length() - 1);
	            graph.putIfAbsent(startChar, new ArrayList<>());
	            graph.get(startChar).add(str);
	            graph.putIfAbsent(endChar, new ArrayList<>());
	        }

	        // Perform DFS to check if there is a cycle
	        Set<String> visited = new HashSet<>();
	        for (String str : strings) {
	            if (dfs(str, str.charAt(0), graph, visited)) {
	                return true;
	            }
	        }

	        return false;
	    }

	    private static boolean dfs(String currentStr, char startChar, Map<Character, List<String>> graph, Set<String> visited) {
	        char endChar = currentStr.charAt(currentStr.length() - 1);
	        if (startChar == endChar && visited.size() == graph.size()) {
	            return true;
	        }

	        if (!graph.containsKey(endChar)) {
	            return false;
	        }

	        List<String> neighbors = graph.get(endChar);
	        for (String neighbor : neighbors) {
	            if (!visited.contains(neighbor)) {
	                visited.add(neighbor);
	                if (dfs(neighbor, startChar, graph, visited)) {
	                    return true;
	                }
	                visited.remove(neighbor);
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        String[] strings = {"abc", "cd", "def", "fa"};
	        if (canFormCircle(strings)) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
	}

	

