/*
https://leetcode.com/problems/insert-delete-getrandom-o1/
*/

class RandomizedSet {
    
    Map<Integer,Integer> map;
    List<Integer> items;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        rand = new Random();
        map = new HashMap<>();
        items = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.get(val) != null){
            return false;
        }
        items.add(val);
        map.put(val,items.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.get(val) == null){
            return false;
        }
        
        int index = map.get(val);
        
        int last = items.get(items.size()-1);
        items.set(index,last);//index then element. // use set not 'add' - very important as add will add new element.
        map.put(last,index);
        
        //Note : remove at last so one element condition is hadled 
        map.remove(val);
        items.remove(items.size()-1);
        
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int randomIndex = rand.nextInt(items.size());
        return items.get(randomIndex);
    }
}
