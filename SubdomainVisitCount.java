package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**

Example:

Input: cpdomains = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
Explanation: We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
**/
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
