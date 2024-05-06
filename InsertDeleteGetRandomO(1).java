/*
https://leetcode.com/problems/insert-delete-getrandom-o1/

Implement the RandomizedSet class:

RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.

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
