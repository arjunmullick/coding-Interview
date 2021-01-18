package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SubdomainVisitCount {

    //https://leetcode.com/problems/subdomain-visit-count/
    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            HashMap<String, Integer> map = new HashMap<>();

            for(String domain : cpdomains){
                String[] countToDomain = domain.split(" ");
                int count = Integer.valueOf(countToDomain[0]);
                String weburl = countToDomain[1];
                map.put(weburl, map.getOrDefault(weburl,0)+count);
                for(int i = 0 ; i < weburl.length() ; i++){
                    if(weburl.charAt(i) == '.'){
                        String key = weburl.substring(i+1,weburl.length());
                        map.put(key, map.getOrDefault(key,0)+count);
                    }
                }
            }

            //System.out.println(map);
            List<String> result = new LinkedList<>();
            for(String key : map.keySet()){
                result.add(map.get(key) + " " + key);
            }
            return result;

        }
    }
}
