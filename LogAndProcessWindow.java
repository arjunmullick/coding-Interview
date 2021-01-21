
Suppose we have an unsorted log file of accesses to web resources. Each log entry consists of an access time, 
the ID of the user making the access, and the resource ID.
The access time is represented as seconds , and all times are assumed to be in the same day.
//https://leetcode.com/playground/mRNirNDK
Find : 
1. Each users min and max access timestamp.
2. Resource with the highest number of accesses in any 5 minute window.

Input : 
logs = [
["58523", "user_1", "resource_1"],
["62314", "user_2", "resource_2"],
["54001", "user_1", "resource_3"],
["200", "user_6", "resource_5"],
["215", "user_6", "resource_4"],
["54060", "user_2", "resource_3"],
["53760", "user_3", "resource_3"],
["58522", "user_4", "resource_1"],
["53651", "user_5", "resource_3"],
["2", "user_6", "resource_1"],
["100", "user_6", "resource_6"],
["400", "user_7", "resource_2"],
["100", "user_8", "resource_2"],
["54359", "user_1", "resource_3"],
]

#1
Output:
user_3:[53760,53760]
user_2:[54060,62314]
user_1:[54001,58523]
user_7:[400,400]
user_6:[2,215]
user_5:[53651,53651]
user_4:[58522,58522]
user_8:[100,100]

#2
Output:
('resource_3', 3)

================================================================================================================================================
public class Main {
  
    public static void main(String[] args) {

        String[][] logs = {
            {"10", "user_1", "resource_1"},
            {"62314", "user_2", "resource_2"},
            {"1", "user_1", "resource_3"},
            {"200", "user_6", "resource_5"},
            {"215", "user_6", "resource_4"},
            {"2", "user_2", "resource_3"},
            {"3", "user_3", "resource_3"},
            {"58522", "user_4", "resource_1"},
            {"4", "user_5", "resource_3"},
            {"2", "user_6", "resource_1"},
            {"100", "user_6", "resource_6"},
            {"400", "user_7", "resource_2"},
            {"100", "user_8", "resource_2"},
            {"5", "user_1", "resource_3"},
        };
        
        
        List<List<String>> ans = getMinMaxTimestamps(logs);
        List<String> ans2 = resourceWithHighestAccessIn5Min(logs);

        System.out.println("====================================");   
        System.out.println("Resource with user start end ");        
        for (List<String> list : ans) {
            System.out.println(Arrays.toString(list.toArray()));   
        }
        System.out.println("====================================");   
        System.out.println("Followup -- Resource with Max hit");
        System.out.println(Arrays.toString(ans2.toArray()));

    }
    
    //1
    public static List<List<String>> getMinMaxTimestamps(String[][] logs) {
        
        Map<String, int[]> map = new HashMap<>();
        for (int i = 0; i < logs.length; i++) {
            
            String userID = logs[i][1];
            String timestamp = logs[i][0];
            int timestampInt = Integer.valueOf(timestamp);//OR Interger.parseInt
            
            int[] minMax = map.getOrDefault(userID,new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE});
            if(minMax[0] > timestampInt){
                minMax[0] = timestampInt;
            }
            if(minMax[1] < timestampInt){
                minMax[1] = timestampInt;
            }
            map.put(userID,minMax);
            
        }

       List<List<String>> results = new ArrayList<>();
        
       for(String userId : map.keySet()){
           List<String> r = new ArrayList<>();
           r.add(userId);
           r.add("" + map.get(userId)[0]);
           r.add("" + map.get(userId)[1]);
           results.add(r);
       }
        return results;
    }
    
    // 2
    public static List<String> resourceWithHighestAccessIn5Min(String[][] logs) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < logs.length; i++) {
            String resourceID = logs[i][2];
            String timestamp = logs[i][0];
            int timestampInt = Integer.parseInt(timestamp);
            List<Integer> list = map.getOrDefault(resourceID,new ArrayList<>());
            list.add(timestampInt);
            map.put(resourceID , list);
        }
        int maxCount = 0;
        String maxResource = "";
        for(String resource : map.keySet()){
            List<Integer> timeStamps = map.get(resource);
            Collections.sort(timeStamps);
            //sliding window 
            int r = 0;
            for(int l = 0 ; l < timeStamps.size() ; l++){
                int count = 0;
                while(r < timeStamps.size() && timeStamps.get(r) - timeStamps.get(l) < 5){
                    r++;
                }
                count = r-l;
                if(count > maxCount){
                    maxCount = count;
                    maxResource = resource;
                }
            }
        }
        
        List<String> ans = new ArrayList<>();
        ans.add(maxResource);
        ans.add("" + maxCount);
 
        return ans;
    }

}
