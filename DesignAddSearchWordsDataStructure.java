//https://leetcode.com/problems/design-add-and-search-words-data-structure/
/**
Input
["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
Output
[null,null,null,null,false,true,true,true]

Explanation
WordDictionary wordDictionary = new WordDictionary();
wordDictionary.addWord("bad");
wordDictionary.addWord("dad");
wordDictionary.addWord("mad");
wordDictionary.search("pad"); // return False
wordDictionary.search("bad"); // return True
wordDictionary.search(".ad"); // return True
wordDictionary.search("b.."); // return True
**/
class WordDictionary {

    /** Initialize your data structure here. */
    Trie trie;
    public WordDictionary() {
        trie = new Trie();
    }
    
    public void addWord(String word) {
        trie.insert(word);
    }
    
    public boolean search(String word) {
        return trie.search(word);
    }
}

class Trie{
    TrieNode root;
    
    public Trie(){
        root = new TrieNode();
    }
    
    public void insert(String word){

        TrieNode node = root;
        for(char ch : word.toCharArray()){
            TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
            node.childs.put(ch,next);
            node = next;
        }
        node.isWord = true;
        node.word = word;
    }
    
    public boolean search(String word){
        

        Queue<TrieNode> queue = new LinkedList<>();
        queue.offer(root);
        
        int index = 0;
        
        while(queue.size() > 0){
            Queue<TrieNode> level = new LinkedList<>();
            while(queue.size() >0){
                TrieNode node = queue.poll();
                if(node.isWord && word.length() == index) return true;
                if(index >= word.length()) continue;//ignor this word important not to return false as other branch may exist
                char ch = word.charAt(index);
                
                HashMap<Character,TrieNode> childs = node.childs;
                if(childs.containsKey(ch)){
                    level.add(childs.get(ch));
                }
                if(ch == '.'){
                    level.addAll(childs.values());
                }
            }
            queue = level;
            index++;//move to next alphabet in work
        }
        return false;
    }
    
}


class TrieNode{
    
    String word;
    HashMap<Character,TrieNode> childs;
    boolean isWord;
    
    public TrieNode(){
        childs = new HashMap<>();
        word = "";
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
