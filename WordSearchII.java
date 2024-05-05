class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        HashSet<String> result = new HashSet<String>();
 
        Trie trie = new Trie();
        for(String word: words){
            trie.insert(word);
        }
 
        int m=board.length;
        int n=board[0].length;
 
        boolean[][] visited = new boolean[m][n];
 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               dfs(result, board, visited, "", i, j, trie);
            }
        }
 
        return new ArrayList<String>(result);
    }
    
    private void dfs(HashSet<String> result, char[][] board, boolean[][] visited, String str, int i, int j, Trie trie){
        int m=board.length;
        int n=board[0].length;
 
        if(i<0 || j<0||i>=m||j>=n){
            return;
        }
 
        if(visited[i][j])
            return;
 
        str = str + board[i][j];
 
        if(!trie.startsWith(str))
            return;
 
        if(trie.search(str)){
            result.add(str);
        }
 
        visited[i][j]=true;
        dfs(result, board, visited, str, i-1, j, trie);
        dfs(result, board, visited, str, i+1, j, trie);
        dfs(result, board, visited, str, i, j-1, trie);
        dfs(result, board, visited, str, i, j+1, trie);
        visited[i][j]=false;
    }
}

//Trie
class Trie {

    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
         root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            TrieNode next = node.childs.getOrDefault(ch,new TrieNode());
            node.childs.put(ch,next);
            node = next;
        }
        node.isWord = true;
        node.word = word;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(!node.childs.containsKey(ch)) return false;
            TrieNode next = node.childs.get(ch);
            node = next;
        }
        return node.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0 ; i < prefix.length() ; i++){
            char ch = prefix.charAt(i);
            if(!node.childs.containsKey(ch)) return false;
            TrieNode next = node.childs.get(ch);
            node = next;
        }
        return true;
    }
}

class TrieNode{
    
    boolean isWord;
    String word;
    HashMap<Character,TrieNode> childs;
    public TrieNode(){
        childs = new HashMap<>();
        word = "";
    }
    
}
