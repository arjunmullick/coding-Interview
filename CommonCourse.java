Given userId to course find all common course amoung any 2 user. 

{"58", "Linear Algebra"},
{"94", "Art History"},
{"94", "Operating Systems"},
{"17", "Software Design"},
{"58", "Mechanics"},
{"58", "Economics"},
{"17", "Linear Algebra"},
{"17", "Political Science"},
{"94", "Economics"},
{"25", "Economics"},
{"58", "Software Design"}

Output 
94 25   || [Economics]
58 25   || [Economics]
17 25   || []
58 17   || [Software Design, Linear Algebra]
58 94   || [Economics]
94 17   || []
================================================================================================================================================


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String[][] logs = {
                            {"58", "Linear Algebra"},
                            {"94", "Art History"},
                            {"94", "Operating Systems"},
                            {"17", "Software Design"},
                            {"58", "Mechanics"},
                            {"58", "Economics"},
                            {"17", "Linear Algebra"},
                            {"17", "Political Science"},
                            {"94", "Economics"},
                            {"25", "Economics"},
                            {"58", "Software Design"},
                        };
         System.out.println("===================================="); 
         Map<int[], List<String>> map = getPossiblePairs(logs);
         for(int[] students : map.keySet()){
             System.out.print(students[0]  + " " + students[1] + "   || ");
             System.out.println(map.get(students));
         }
         System.out.println("====================================");   
    }
    
    public static Map<int[], List<String>> getPossiblePairs(String[][] input){
        Map<int[], List<String>> result = new HashMap();
        Map<Integer, Set<String>> map = new HashMap();
        List<Integer> studentIds = new ArrayList();
        
        for(String[] course : input){
            int studentId = Integer.parseInt(course[0]);
            Set<String> set = map.getOrDefault(studentId , new HashSet<>());
            if(!map.containsKey(studentId)) 
                studentIds.add(studentId);
            set.add(course[1]);
            map.put(studentId,set);
        }
        
        for(int i = 0; i < studentIds.size(); i++){
            int curr = studentIds.get(i);
            for(int j = i + 1; j < studentIds.size(); j++){
                List<String> commonCourses = findCommon(studentIds.get(j), curr, map);
                result.put(new int[]{curr, studentIds.get(j)}, commonCourses);
            }
        }
        return result;
    }

    public static List<String> findCommon(int id1, int id2, Map<Integer, Set<String>> map){
        Set<String> student1 = map.get(id1);
        Set<String> student2 = map.get(id2);
        List<String> common = new ArrayList();
        for(String course : student1){
            if(student2.contains(course )){
                common.add(course);
            }
        }
        return common;
    }
}
