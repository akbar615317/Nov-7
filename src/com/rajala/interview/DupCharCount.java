package com.rajala.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupCharCount {


    public static void main(String[] args) {
        DupCharCount d = new DupCharCount();
        d.finddupchars("java2Novice");

    }

    public void finddupchars(String str) {


        Map<Character, Integer> dupmap = new HashMap<Character, Integer>();

        char[] chrs = str.toCharArray();
        for (Character ch : chrs) {
            if (dupmap.containsKey(ch)) {
                dupmap.put(ch, dupmap.get(ch) + 1);
            } else {
                dupmap.put(ch, 1);
            }
        }

            Set<Character> keys = dupmap.keySet();
            for(Character ch : keys) {
                if (dupmap.get(ch) > 1) {
                    System.out.println(ch + "--->" + dupmap.get(ch));
                }

            }

    }
}