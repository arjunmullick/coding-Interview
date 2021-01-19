# About

These are the most popular coding interview question from easy to hard in order. 

The problem covers common pattern / algo in interview:

- Binary search
- Two pointers
- Backtracking
- DFS
- BFS
- Dynamic programming
- Stack / Greedy / Heap
- Swap corresponding values
- Store one or more different values in the same pointer
- Trie / Map

**Big O performance of common functions (Java).**


List                 | Add  | Remove | Get  | Contains | Next | Data Structure
---------------------|------|--------|------|----------|------|---------------
ArrayList            | O(1) |  O(n)  | O(1) |   O(n)   | O(1) | Array
LinkedList           | O(1) |  O(1)  | O(n) |   O(n)   | O(1) | Linked List
CopyOnWriteArrayList | O(n) |  O(n)  | O(1) |   O(n)   | O(1) | Array



Set                   |    Add   |  Remove  | Contains |   Next   | Size | Data Structure
----------------------|----------|----------|----------|----------|------|-------------------------
HashSet               | O(1)     | O(1)     | O(1)     | O(h/n)   | O(1) | Hash Table
LinkedHashSet         | O(1)     | O(1)     | O(1)     | O(1)     | O(1) | Hash Table + Linked List
EnumSet               | O(1)     | O(1)     | O(1)     | O(1)     | O(1) | Bit Vector
TreeSet               | O(log n) | O(log n) | O(log n) | O(log n) | O(1) | Red-black tree
CopyOnWriteArraySet   | O(n)     | O(n)     | O(n)     | O(1)     | O(1) | Array
ConcurrentSkipListSet | O(log n) | O(log n) | O(log n) | O(1)     | O(n) | Skip List



Queue                   |  Offer   | Peak |   Poll   | Remove | Size | Data Structure
------------------------|----------|------|----------|--------|------|---------------
PriorityQueue           | O(log n) | O(1) | O(log n) |  O(n)  | O(1) | Priority Heap
LinkedList              | O(1)     | O(1) | O(1)     |  O(1)  | O(1) | Array
ArrayDequeue            | O(1)     | O(1) | O(1)     |  O(n)  | O(1) | Linked List
ConcurrentLinkedQueue   | O(1)     | O(1) | O(1)     |  O(n)  | O(n) | Linked List
ArrayBlockingQueue      | O(1)     | O(1) | O(1)     |  O(n)  | O(1) | Array
PriorirityBlockingQueue | O(log n) | O(1) | O(log n) |  O(n)  | O(1) | Priority Heap
SynchronousQueue        | O(1)     | O(1) | O(1)     |  O(n)  | O(1) | None!
DelayQueue              | O(log n) | O(1) | O(log n) |  O(n)  | O(1) | Priority Heap
LinkedBlockingQueue     | O(1)     | O(1) | O(1)     |  O(n)  | O(1) | Linked List



Map                   |   Get    | ContainsKey |   Next   | Data Structure
----------------------|----------|-------------|----------|-------------------------
HashMap               | O(1)     |   O(1)      | O(h / n) | Hash Table
LinkedHashMap         | O(1)     |   O(1)      | O(1)     | Hash Table + Linked List
IdentityHashMap       | O(1)     |   O(1)      | O(h / n) | Array
WeakHashMap           | O(1)     |   O(1)      | O(h / n) | Hash Table
EnumMap               | O(1)     |   O(1)      | O(1)     | Array
TreeMap               | O(log n) |   O(log n)  | O(log n) | Red-black tree
ConcurrentHashMap     | O(1)     |   O(1)      | O(h / n) | Hash Tables
ConcurrentSkipListMap | O(log n) |   O(log n)  | O(1)     | Skip List


### Reference : 
[14 Patterns to Ace Any Coding Interview Question](https://hackernoon.com/14-patterns-to-ace-any-coding-interview-question-c5bb3357f6ed)



### Coding Interview Question
* 1	[Contains Duplicate	](https://leetcode.com/problems/contains-duplicate/)   | [Solution](https://github.com/arjunmullick/Interview/blob/master/ContainsDuplicate.java)
* 2	[Missing Number	](https://leetcode.com/problems/missing-number/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MissingNumber.java)
* 3	[Find All Numbers Disappeared in an Array	](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindAllNumbersDisappeared.java)
* 4	[Single Number	](https://leetcode.com/problems/single-number/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SingleNumber.java)
* 5	[Climbing Stairs	](https://leetcode.com/problems/climbing-stairs/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ClimbingStairs.java)
* 6	[Best Time to Buy and Sell Stock	](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BestTimeBuyAndSellStock.java)
* 7	[Maximum Subarray	](https://leetcode.com/problems/maximum-subarray/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MaximumSubarray.java)
* 8	[Range Sum Query - Immutable	](https://leetcode.com/problems/range-sum-query-immutable/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RangeSumQueryImmutable.java)
* 9	[Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LinkedListCycle.java) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LinkedListCycleII.java)
* 10	[Middle of the Linked List	](https://leetcode.com/problems/middle-of-the-linked-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MiddleElementLinkedList.java)
* 11	[Palindrome Linked List	](https://leetcode.com/problems/palindrome-linked-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PalindromeLinkedList.java)
* 12	[Remove Linked List Elements	](https://leetcode.com/problems/remove-linked-list-elements/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RemoveLinkedListElements.java)
* 13	[Remove Duplicates from Sorted List	](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RemoveDuplicatesFromSortedList.java)
* 14	[Reverse Linked List	](https://leetcode.com/problems/reverse-linked-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ReverseLinkedList.java)
* 15	[Merge Two Sorted Lists	](https://leetcode.com/problems/merge-two-sorted-lists/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MergeTwoSortedLists.java)
* 16	[Meeting Rooms	](https://leetcode.com/problems/meeting-rooms) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MeetingRooms.java)
* 17	[Binary Search	](https://leetcode.com/problems/binary-search/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BinarySearch.java)
* 18	[Find Smallest Letter Greater Than Target	](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindSmallestLetterGreaterThanTarget.java)
* 19	[Peak Index in a Mountain Array	](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
* 20	[Binary Tree Level Order Traversal II	](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
* 21	[Average of Levels in Binary Tree	](https://leetcode.com/problems/average-of-levels-in-binary-tree/)
* 22	[Minimum Depth of Binary Tree	](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
* 23	[Same Tree	](https://leetcode.com/problems/same-tree/)
* 24	[Path Sum	](https://leetcode.com/problems/path-sum/)
* 25	[Diameter of Binary Tree	](https://leetcode.com/problems/diameter-of-binary-tree/)
* 26	[Merge Two Binary Trees	](https://leetcode.com/problems/merge-two-binary-trees/)
* 27	[Maximum Depth of Binary Tree	](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
* 28	[Lowest Common Ancestor of a Binary Search Tree	](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
* 29	[Subtree of Another Tree	](https://leetcode.com/problems/subtree-of-another-tree/)
* 30	[Invert Binary Tree	](https://leetcode.com/problems/invert-binary-tree/)
* 31	[Two Sum	](https://leetcode.com/problems/two-sum/)
* 32	[Squares of a Sorted Array	](https://leetcode.com/problems/squares-of-a-sorted-array/)
* 33	[Backspace String Compare	](https://leetcode.com/problems/backspace-string-compare)
* 34	[Longest Word in Dictionary	](https://leetcode.com/problems/longest-word-in-dictionary/)
* 35	[Index Pairs of a String	](https://leetcode.com/problems/index-pairs-of-a-string/)
* 36	[Majority Element	](https://leetcode.com/problems/majority-element/)
* 37	[Product of Array Except Self	](https://leetcode.com/problems/product-of-array-except-self/)
* 38	[Find the Duplicate Number	](https://leetcode.com/problems/find-the-duplicate-number/)
* 39	[Find All Duplicates in an Array	](https://leetcode.com/problems/find-all-duplicates-in-an-array/)
* 40	[Set Matrix Zeroes	](https://leetcode.com/problems/set-matrix-zeroes/)
* 41	[Spiral Matrix	](https://leetcode.com/problems/spiral-matrix/)
* 42	[Rotate Image	](https://leetcode.com/problems/rotate-image/)
* 43	[Word Search	](https://leetcode.com/problems/word-search/)
* 44	[Letter Case Permutation	](https://leetcode.com/problems/letter-case-permutation/)
* 45	[Subsets	](https://leetcode.com/problems/subsets/)
* 46	[Subsets II	](https://leetcode.com/problems/subsets-ii/)
* 47	[Permutations	](https://leetcode.com/problems/permutations/)
* 48	[Permutations II	](https://leetcode.com/problems/permutations-ii/)
* 49	[Combinations	](https://leetcode.com/problems/combinations/)
* 50	[Combination Sum	](https://leetcode.com/problems/combination-sum/)
* 51	[Combination Sum II	](https://leetcode.com/problems/combination-sum-ii/)
* 52	[Combination Sum III	](https://leetcode.com/problems/combination-sum-iii/)
* 53	[Generate Parentheses	](https://leetcode.com/problems/generate-parentheses/)
* 54	[Target Sum	](https://leetcode.com/problems/target-sum/)
* 55	[Palindrome Partitioning	](https://leetcode.com/problems/palindrome-partitioning/)
* 56	[Letter Combinations of a Phone Number	](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
* 57	[Generalized Abbreviation	](https://leetcode.com/problems/generalized-abbreviation/)
* 58	[House Robber	](https://leetcode.com/problems/house-robber/)
* 59	[House Robber II	](https://leetcode.com/problems/house-robber-ii/)
* 60	[Coin Change	](https://leetcode.com/problems/coin-change/)
* 61	[Maximum Product Subarray	](https://leetcode.com/problems/maximum-product-subarray/)
* 62	[Longest Increasing Subsequence	](https://leetcode.com/problems/longest-increasing-subsequence/)
* 63	[Longest Palindromic Substring	](https://leetcode.com/problems/longest-palindromic-substring/)
* 64	[Word Break	](https://leetcode.com/problems/word-break/)
* 65	[Combination Sum IV	](https://leetcode.com/problems/combination-sum-iv/)
* 66	[Decode Ways	](https://leetcode.com/problems/decode-ways/)
* 67	[Unique Paths	](https://leetcode.com/problems/unique-paths/)
* 68	[Jump Game	](https://leetcode.com/problems/jump-game/)
* 69	[Palindromic Substrings	](https://leetcode.com/problems/palindromic-substrings/)
* 70	[Number of Longest Increasing Subsequence	](https://leetcode.com/problems/number-of-longest-increasing-subsequence/)
* 71	[Partition Equal Subset Sum	](https://leetcode.com/problems/partition-equal-subset-sum/)
* 72	[Partition to K Equal Sum Subsets	](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/)
* 73	[Best Time to Buy and Sell Stock with Cooldown	](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)
* 74	[Counting Bits	](https://leetcode.com/problems/counting-bits/)
* 75	[Linked List Cycle II	](https://leetcode.com/problems/linked-list-cycle-ii/)
* 76	[Add Two Numbers	](https://leetcode.com/problems/add-two-numbers/)
* 77	[Remove Nth Node From End Of List	](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
* 78	[Sort List	](https://leetcode.com/problems/sort-list/)
* 79	[Reorder List	](https://leetcode.com/problems/reorder-list/)
* 80	[Clone Graph	](https://leetcode.com/problems/clone-graph/)
* 81	[Pacific Atlantic Water Flow	](https://leetcode.com/problems/pacific-atlantic-water-flow/)
* 82	[Number of Islands	](https://leetcode.com/problems/number-of-islands/)
* 83	[Graph Valid Tree	](https://leetcode.com/problems/graph-valid-tree/)
* 84	[Number of Connected Components in an Undirected Graph	](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)
* 85	[Reverse Linked List II	](https://leetcode.com/problems/reverse-linked-list-ii/)
* 86	[Rotate List	](https://leetcode.com/problems/rotate-list/)
* 87	[Swap Nodes in Pairs	](https://leetcode.com/problems/swap-nodes-in-pairs/)
* 88	[Odd Even Linked List	](https://leetcode.com/problems/odd-even-linked-list/)
* 89	[Kth Smallest Element in a Sorted Matrix	](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)
* 90	[Find K Pairs with Smallest Sums	](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/)
* 91	[Merge Intervals	](https://leetcode.com/problems/merge-intervals/)
* 92	[Interval List Intersections	](https://leetcode.com/problems/interval-list-intersections/)
* 93	[Non-overlapping Intervals	](https://leetcode.com/problems/non-overlapping-intervals/)
* 94	[Meeting Rooms II	](https://leetcode.com/problems/meeting-rooms-ii/)
* 95	[Task Scheduler	](https://leetcode.com/problems/task-scheduler/)
* 96	[Minimum Number of Arrows to Burst Balloons	](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)
* 97	[Find Minimum in Rotated Sorted Array	](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
* 98	[Find Peak Element	](https://leetcode.com/problems/find-peak-element/)
* 99	[Search in Rotated Sorted Array	](https://leetcode.com/problems/search-in-rotated-sorted-array/)
* 100	[Search in Rotated Sorted Array II	](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
* 101	[Search a 2D Matrix	](https://leetcode.com/problems/search-a-2d-matrix/)
* 102	[Search a 2D Matrix II	](https://leetcode.com/problems/search-a-2d-matrix-ii/)
* 103	[Find K Closest Elements	](https://leetcode.com/problems/find-k-closest-elements/)
* 104	[Minimum Size Subarray Sum	](https://leetcode.com/problems/minimum-size-subarray-sum/)
* 105	[Fruit Into Baskets	](https://leetcode.com/problems/fruit-into-baskets/)
* 106	[Permutation in String	](https://leetcode.com/problems/permutation-in-string/)
* 107	[Longest Repeating Character Replacement	](https://leetcode.com/problems/longest-repeating-character-replacement/)
* 108	[Kth Smallest Element in a BST	](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)
* 109	[K Closest Points to Origin	](https://leetcode.com/problems/k-closest-points-to-origin/)
* 110	[Top K Frequent Elements	](https://leetcode.com/problems/top-k-frequent-elements/)
* 111	[Sort Characters By Frequency	](https://leetcode.com/problems/sort-characters-by-frequency/)
* 112	[Kth Largest Element in an Array	](https://leetcode.com/problems/kth-largest-element-in-an-array/)
* 113	[Reorganize String	](https://leetcode.com/problems/reorganize-string/)
* 114	[Course Schedule	](https://leetcode.com/problems/course-schedule/)
* 115	[Course Schedule II	](https://leetcode.com/problems/course-schedule-ii/)
* 116	[Minimum Height Trees	](https://leetcode.com/problems/minimum-height-trees/)
* 117	[Binary Tree Level Order Traversal	](https://leetcode.com/problems/binary-tree-level-order-traversal/)
* 118	[Binary Tree Zigzag Level Order Traversal	](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
* 119	[Populating Next Right Pointers in Each Node	](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)
* 120	[Populating Next Right Pointers in Each Node II	](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)
* 121	[Binary Tree Right Side View	](https://leetcode.com/problems/binary-tree-right-side-view/)
* 122	[All Nodes Distance K in Binary Tree	](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)
* 123	[Path Sum II	](https://leetcode.com/problems/path-sum-ii/)
* 124	[Path Sum III	](https://leetcode.com/problems/path-sum-iii/)
* 125	[Lowest Common Ancestor of a Binary Tree	](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)
* 126	[Maximum Binary Tree	](https://leetcode.com/problems/maximum-binary-tree/)
* 127	[Maximum Width of Binary Tree	](https://leetcode.com/problems/maximum-width-of-binary-tree/)
* 128	[Construct Binary Tree from Preorder and Inorder Traversal	](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
* 129	[Validate Binary Search Tree	](https://leetcode.com/problems/validate-binary-search-tree/)
* 130	[Implement Trie (Prefix Tree)	](https://leetcode.com/problems/implement-trie-prefix-tree/)
* 131	[3 Sum	](https://leetcode.com/problems/3sum/)
* 132	[3 Sum Closest	](https://leetcode.com/problems/3sum-closest/)
* 133	[Subarrays with Product Less than K	](https://leetcode.com/problems/subarray-product-less-than-k/)
* 134	[Sort Colours	](https://leetcode.com/problems/sort-colors/)
* 135	[Maximum XOR of Two Numbers in an Array	](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array)
* 136	[First Missing Positive	](https://leetcode.com/problems/first-missing-positive/)
* 137	[Longest Consecutive Sequence	](https://leetcode.com/problems/longest-consecutive-sequence/)
* 138	[Sudoku Solver	](https://leetcode.com/problems/sudoku-solver/)
* 139	[N-Queens	](https://leetcode.com/problems/n-queens/)
* 140	[Reverse Nodes in k-Group	](https://leetcode.com/problems/reverse-nodes-in-k-group/)
* 141	[Merge k Sorted Lists	](https://leetcode.com/problems/merge-k-sorted-lists/)
* 142	[Smallest Range Covering Elements from K Lists	](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/)
* 143	[Insert Interval	](https://leetcode.com/problems/insert-interval/)
* 144	[Employee Free Time	](https://leetcode.com/problems/employee-free-time/)
* 145	[Count of Range Sum	](https://leetcode.com/problems/count-of-range-sum/)
* 146	[Sliding Window Maximum	](https://leetcode.com/problems/sliding-window-maximum/)
* 147	[Longest Substring Without Repeating Characters	](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
* 148	[Minimum Number of K Consecutive Bit Flips	](https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/)
* 149	[Count Unique Characters of All Substrings of a Given String	](https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/)
* 150	[Minimum Window Substring	](https://leetcode.com/problems/minimum-window-substring/)
* 151	[Substring with Concatenation of All Words	](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)
* 152	[Rearrange String k Distance Apart	](https://leetcode.com/problems/rearrange-string-k-distance-apart)
* 153	[Course Schedule III	](https://leetcode.com/problems/course-schedule-iii/)
* 154	[Maximum Frequency Stack	](https://leetcode.com/problems/maximum-frequency-stack/)
* 155	[Alien Dictionary	](https://leetcode.com/problems/alien-dictionary)
* 156	[Sequence Reconstruction	](https://leetcode.com/problems/sequence-reconstruction)
* 157	[Binary Tree Maximum Path Sum	](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
* 158	[Serialize and Deserialize Binary Tree	](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)
* 159	[Word Search II	](https://leetcode.com/problems/word-search-ii/)
* 160	[Find Median from Data Stream	](https://leetcode.com/problems/find-median-from-data-stream/)
* 161	[Sliding Window Median	](https://leetcode.com/problems/sliding-window-median/)
* 162	[Trapping Rain Water	](https://leetcode.com/problems/trapping-rain-water/)
* 163	[Container With Most Water	](https://leetcode.com/problems/container-with-most-water/)
* 164	[Concatenated Words	](https://leetcode.com/problems/concatenated-words/)
* 165	[Prefix and Suffix Search	](https://leetcode.com/problems/prefix-and-suffix-search/)
* 166	[Palindrome Pairs	](https://leetcode.com/problems/palindrome-pairs/)
* 167	[Design Search Autocomplete System	](https://leetcode.com/problems/design-search-autocomplete-system/)
* 168	[Word Squares	](https://leetcode.com/problems/word-squares/)
* 169	[Sort Items by Groups Respecting Dependencies	](https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/)
* 170	[Median of Two Sorted Arrays	](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## Bonus Questions 
* [Sub Array Sub K](https://leetcode.com/problems/subarray-sum-equals-k/)
* [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
* [Evaluate Division](https://leetcode.com/problems/evaluate-division/)
* [Random Pick with Weight](https://leetcode.com/problems/random-pick-with-weight/)
* [Word Ladder](https://leetcode.com/problems/word-ladder/solution/)
* [Basin Calculator](https://leetcode.com/problems/basic-calculator-ii/) & [Advance Calculator](https://leetcode.com/problems/basic-calculator-iii/) i,ii,iii
* [Nested Parser](https://leetcode.com/problems/mini-parser/)
* [Decode String](https://leetcode.com/problems/decode-string/)
* [Subdomain visit count](https://leetcode.com/problems/subdomain-visit-count/)
* [Test justification](https://leetcode.com/problems/text-justification/)
------------------------------------------------------------------------------------------------------------------------------

Questions By Topics
===================

------------------------------------------------------------------------------------------------------------------------------
Graph
------------------------------------------------------------------------------------------------------------------------------

|                                                        | **Graph**                                                 |                                              |                                                        |
|--------------------------------------------------------|-----------------------------------------------------------|----------------------------------------------|--------------------------------------------------------|
| BFS                                                    | DFS                                                       | Topoligical Sort                             | Union Find                                             |
| Binary Tree Level Order Traversal II                   | Minimum Depth of Binary Tree                              | Course Schedule                              |  Graph Valid Tree                                      |
| Average of Levels in Binary Tree                       | Same Tree                                                 | Course Schedule II                           |  Number of Connected Components in an Undirected Graph |
| Minimum Depth of Binary Tree                           | Path Sum                                                  | Minimum Height Trees                         | Number of Islands                                      |
| Clone Graph                                            | Diameter of Binary Tree                                   |  Alien Dictionary                            |                                                        |
| Pacific Atlantic Water Flow                            | Merge Two Binary Trees                                    |  Sequence Reconstruction                     |                                                        |
| Number of Islands                                      | Maximum Depth of Binary Tree                              | Sort Items by Groups Respecting Dependencies |                                                        |
|  Graph Valid Tree                                      | Lowest Common Ancestor of a Binary Search Tree            |                                              |                                                        |
|  Number of Connected Components in an Undirected Graph | Subtree of Another Tree                                   |                                              |                                                        |
| Course Schedule                                        | Invert Binary Tree                                        |                                              |                                                        |
| Course Schedule II                                     | Target Sum                                                |                                              |                                                        |
| Minimum Height Trees                                   | Clone Graph                                               |                                              |                                                        |
| Binary Tree Level Order Traversal                      | Pacific Atlantic Water Flow                               |                                              |                                                        |
| Binary Tree Zigzag Level Order Traversal               | Number of Islands                                         |                                              |                                                        |
| Populating Next Right Pointers in Each Node            |  Graph Valid Tree                                         |                                              |                                                        |
| Populating Next Right Pointers in Each Node II         |  Number of Connected Components in an Undirected Graph    |                                              |                                                        |
| Binary Tree Right Side View                            | Kth Smallest Element in a BST                             |                                              |                                                        |
| All Nodes Distance K in Binary Tree                    | Course Schedule                                           |                                              |                                                        |
|                                                        | Course Schedule II                                        |                                              |                                                        |
|                                                        | Binary Tree Right Side View                               |                                              |                                                        |
|                                                        | All Nodes Distance K in Binary Tree                       |                                              |                                                        |
|                                                        | Path Sum II                                               |                                              |                                                        |
|                                                        | Path Sum III                                              |                                              |                                                        |
|                                                        | Lowest Common Ancestor of a Binary Tree                   |                                              |                                                        |
|                                                        | Maximum Binary Tree                                       |                                              |                                                        |
|                                                        | Maximum Width of Binary Tree                              |                                              |                                                        |
|                                                        | Construct Binary Tree from Preorder and Inorder Traversal |                                              |                                                        |
|                                                        | Validate Binary Search Tree                               |                                              |                                                        |
|                                                        | Binary Tree Maximum Path Sum                              |                                              |                                                        |
|                                                        | Word Search II                                            |                                              |                                                        |
|                                                        | Sort Items by Groups Respecting Dependencies              |                                              |                                                        |

------------------------------------------------------------------------------------------------------------------------------
Recursion
------------------------------------------------------------------------------------------------------------------------------

|                                       | Recursion                                     |                                        |
|---------------------------------------|-----------------------------------------------|----------------------------------------|
| Backtracking                          | DP                                            | Trie                                   |
| Word Search                           | Climbing Stairs                               | Longest Word in Dictionary             |
| Letter Case Permutation               | Best Time to Buy and Sell Stock               |  Index Pairs of a String               |
| Subsets                               | Maximum Subarray                              | Implement Trie (Prefix Tree)           |
| Subsets II                            | Range Sum Query - Immutable                   | Maximum XOR of Two Numbers in an Array |
| Permutations                          | Target Sum                                    | Word Search II                         |
| Permutations II                       | House Robber                                  | Concatenated Words                     |
| Combinations                          | House Robber II                               | Prefix and Suffix Search               |
| Combination Sum                       | Coin Change                                   | Palindrome Pairs                       |
| Combination Sum II                    | Maximum Product Subarray                      |  Design Search Autocomplete System     |
| Combination Sum III                   | Longest Increasing Subsequence                |  Word Squares                          |
| Generate Parentheses                  | Longest Palindromic Substring                 |                                        |
| Palindrome Partitioning               | Word Break                                    |                                        |
| Letter Combinations of a Phone Number | Combination Sum IV                            |                                        |
|  Generalized Abbreviation             | Decode Ways                                   |                                        |
| Sudoku Solver                         | Unique Paths                                  |                                        |
| N-Queens                              | Jump Game                                     |                                        |
|                                       | Palindromic Substrings                        |                                        |
|                                       | Number of Longest Increasing Subsequence      |                                        |
|                                       | Partition Equal Subset Sum                    |                                        |
|                                       | Partition to K Equal Sum Subsets              |                                        |
|                                       | Best Time to Buy and Sell Stock with Cooldown |                                        |
|                                       | Counting Bits                                 |                                        |

------------------------------------------------------------------------------------------------------------------------------
One Dimension 
------------------------------------------------------------------------------------------------------------------------------

| Arrays                                   | Binary Search                            | Linked List / Pointers             | Sliding window                                              |
|------------------------------------------|------------------------------------------|------------------------------------|-------------------------------------------------------------|
| Contains Duplicate                       | Binary Search                            | Linked List Cycle                  | Minimum Size Subarray Sum                                   |
| Missing Number                           | Find Smallest Letter Greater Than Target | Middle of the Linked List          | Fruit Into Baskets                                          |
| Find All Numbers Disappeared in an Array | Peak Index in a Mountain Array           | Palindrome Linked List             | Permutation in String                                       |
| Single Number                            | Find the Duplicate Number                | Remove Linked List Elements        | Longest Repeating Character Replacement                     |
| Product of Array Except Self             | Kth Smallest Element in a Sorted Matrix  | Remove Duplicates from Sorted List | Longest Substring Without Repeating Characters              |
| Find the Duplicate Number                | Find Minimum in Rotated Sorted Array     | Linked List Cycle II               | Sliding Window Maximum                                      |
| Find All Duplicates in an Array          | Find Peak Element                        | Add Two Numbers                    | Minimum Number of K Consecutive Bit Flips                   |
| Set Matrix Zeroes                        | Search in Rotated Sorted Array           | Remove Nth Node From End Of List   | Count Unique Characters of All Substrings of a Given String |
| Spiral Matrix                            | Search in Rotated Sorted Array II        | Sort List                          | Minimum Window Substring                                    |
| Rotate Image                             | Search a 2D Matrix                       | Reorder List                       | Substring with Concatenation of All Words                   |
| First Missing Positive                   | Search a 2D Matrix II                    | Reverse Linked List                |                                                             |
| Longest Consecutive Sequence             | Find K Closest Elements                  | Reverse Linked List II             |                                                             |
|                                          | Count of Range Sum                       | Rotate List                        |                                                             |
|                                          | Median of Two Sorted Arrays              | Swap Nodes in Pairs                |                                                             |
|                                          |                                          | Odd Even Linked List               |                                                             |
|                                          |                                          | Reverse Nodes in k-Group           |                                                             |
------------------------------------------------------------------------------------------------------------------------------
Two Pointer / Two Choice
------------------------------------------------------------------------------------------------------------------------------

| Heap / PriorityQueue                          | Sliding Window                                              | Two Pointers                       |
|-----------------------------------------------|-------------------------------------------------------------|------------------------------------|
| Task Scheduler                                | Minimum Size Subarray Sum                                   | Merge Two Sorted Lists             |
| Minimum Number of Arrows to Burst Balloons    | Fruit Into Baskets                                          | Two Sum                            |
| Reorganize String                             | Permutation in String                                       | Squares of a Sorted Array          |
|  Employee Free Time                           | Longest Repeating Character Replacement                     | Backspace String Compare           |
|  Rearrange String k Distance Apart            | Longest Substring Without Repeating Characters              | Find the Duplicate Number          |
| Course Schedule III                           | Sliding Window Maximum                                      | 3 Sum                              |
| Kth Smallest Element in a Sorted Matrix       | Minimum Number of K Consecutive Bit Flips                   | 3 Sum Closest                      |
| Find K Pairs with Smallest Sums               | Count Unique Characters of All Substrings of a Given String | Subarrays with Product Less than K |
|  Meeting Rooms II                             | Minimum Window Substring                                    | Sort Colours                       |
| Task Scheduler                                | Substring with Concatenation of All Words                   | Container With Most Water          |
| K Closest Points to Origin                    |                                                             | Trapping Rain Water                |
| Top K Frequent Elements                       |                                                             |                                    |
| Sort Characters By Frequency                  |                                                             |                                    |
| Kth Largest Element in an Array               |                                                             |                                    |
| Reorganize String                             |                                                             |                                    |
| Merge k Sorted Lists                          |                                                             |                                    |
| Smallest Range Covering Elements from K Lists |                                                             |                                    |
|  Employee Free Time                           |                                                             |                                    |
|  Rearrange String k Distance Apart            |                                                             |                                    |
| Course Schedule III                           |                                                             |                                    |
| Maximum Frequency Stack                       |                                                             |                                    |
| Find Median from Data Stream                  |                                                             |                                    |
| Sliding Window Median                         |                                                             |                                    |
|  Meeting Rooms                                |                                                             |                                    |
| Merge Intervals                               |                                                             |                                    |
| Interval List Intersections                   |                                                             |                                    |
| Non-overlapping Intervals                     |                                                             |                                    |
|  Meeting Rooms II                             |                                                             |                                    |
| Insert Interval                               |                                                             |                                    |



## **Question by Concept**

### Arrays 
* [Contains Duplicate	](https://leetcode.com/problems/contains-duplicate/)
* [Missing Number	](https://leetcode.com/problems/missing-number/)
* [Find All Numbers Disappeared in an Array	](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
* [Single Number	](https://leetcode.com/problems/single-number/)
* [Product of Array Except Self	](https://leetcode.com/problems/product-of-array-except-self/)
* [Find the Duplicate Number	](https://leetcode.com/problems/find-the-duplicate-number/)
* [Find All Duplicates in an Array	](https://leetcode.com/problems/find-all-duplicates-in-an-array/)
* [Set Matrix Zeroes	](https://leetcode.com/problems/set-matrix-zeroes/)
* [Spiral Matrix	](https://leetcode.com/problems/spiral-matrix/)
* [Rotate Image	](https://leetcode.com/problems/rotate-image/)
* [First Missing Positive	](https://leetcode.com/problems/first-missing-positive/)
* [Longest Consecutive Sequence	](https://leetcode.com/problems/longest-consecutive-sequence/)


### Binary Search
* [Binary Search	](https://leetcode.com/problems/binary-search/)
* [Find Smallest Letter Greater Than Target	](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
* [Peak Index in a Mountain Array	](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
* [Find the Duplicate Number	](https://leetcode.com/problems/find-the-duplicate-number/)
* [Kth Smallest Element in a Sorted Matrix	](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)
* [Find Minimum in Rotated Sorted Array	](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
* [Find Peak Element	](https://leetcode.com/problems/find-peak-element/)
* [Search in Rotated Sorted Array	](https://leetcode.com/problems/search-in-rotated-sorted-array/)
* [Search in Rotated Sorted Array II	](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
* [Search a 2D Matrix	](https://leetcode.com/problems/search-a-2d-matrix/)
* [Search a 2D Matrix II	](https://leetcode.com/problems/search-a-2d-matrix-ii/)
* [Find K Closest Elements	](https://leetcode.com/problems/find-k-closest-elements/)
* [Count of Range Sum	](https://leetcode.com/problems/count-of-range-sum/)
* [Median of Two Sorted Arrays	](https://leetcode.com/problems/median-of-two-sorted-arrays/)


### Backtracking 
* [Word Search	](https://leetcode.com/problems/word-search/)
* [Letter Case Permutation	](https://leetcode.com/problems/letter-case-permutation/)
* [Subsets	](https://leetcode.com/problems/subsets/)
* [Subsets II	](https://leetcode.com/problems/subsets-ii/)
* [Permutations	](https://leetcode.com/problems/permutations/)
* [Find Smallest Letter Greater Than Target	](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
* [Peak Index in a Mountain Array	](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
* [Find the Duplicate Number	](https://leetcode.com/problems/find-the-duplicate-number/)
* [Kth Smallest Element in a Sorted Matrix	](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)
* [Find Minimum in Rotated Sorted Array	](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
* [Find Peak Element	](https://leetcode.com/problems/find-peak-element/)
* [Search in Rotated Sorted Array	](https://leetcode.com/problems/search-in-rotated-sorted-array/)
* [Search in Rotated Sorted Array II	](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
* [Search a 2D Matrix	](https://leetcode.com/problems/search-a-2d-matrix/)
* [Search a 2D Matrix II	](https://leetcode.com/problems/search-a-2d-matrix-ii/)
* [Find K Closest Elements	](https://leetcode.com/problems/find-k-closest-elements/)
* [Count of Range Sum	](https://leetcode.com/problems/count-of-range-sum/)
* [Median of Two Sorted Arrays	](https://leetcode.com/problems/median-of-two-sorted-arrays/)
* [Permutations II	](https://leetcode.com/problems/permutations-ii/)
* [Combinations	](https://leetcode.com/problems/combinations/)
* [Combination Sum	](https://leetcode.com/problems/combination-sum/)
* [Combination Sum II	](https://leetcode.com/problems/combination-sum-ii/)
* [Combination Sum III	](https://leetcode.com/problems/combination-sum-iii/)
* [Generate Parentheses	](https://leetcode.com/problems/generate-parentheses/)
* [Palindrome Partitioning	](https://leetcode.com/problems/palindrome-partitioning/)
* [Letter Combinations of a Phone Number	](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
* [Generalized Abbreviation	](https://leetcode.com/problems/generalized-abbreviation/)
* [Sudoku Solver	](https://leetcode.com/problems/sudoku-solver/)
* [N-Queens	](https://leetcode.com/problems/n-queens/)


### Graph / Tree Search (BFS/DFS)
* [Binary Tree Level Order Traversal II	](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
* [Average of Levels in Binary Tree	](https://leetcode.com/problems/average-of-levels-in-binary-tree/)
* [Minimum Depth of Binary Tree	](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
* [Same Tree	](https://leetcode.com/problems/same-tree/)
* [Path Sum	](https://leetcode.com/problems/path-sum/)
* [Clone Graph	](https://leetcode.com/problems/clone-graph/)
* [Merge Two Binary Trees	](https://leetcode.com/problems/merge-two-binary-trees/)
* [Pacific Atlantic Water Flow	](https://leetcode.com/problems/pacific-atlantic-water-flow/)
* [Number of Islands	](https://leetcode.com/problems/number-of-islands/)
* [Graph Valid Tree	](https://leetcode.com/problems/graph-valid-tree/)
* [Maximum Depth of Binary Tree	](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
* [Lowest Common Ancestor of a Binary Search Tree	](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
* [Subtree of Another Tree	](https://leetcode.com/problems/subtree-of-another-tree/)
* [Invert Binary Tree	](https://leetcode.com/problems/invert-binary-tree/)
* [Target Sum	](https://leetcode.com/problems/target-sum/)
* [Clone Graph	](https://leetcode.com/problems/clone-graph/)
* [Pacific Atlantic Water Flow	](https://leetcode.com/problems/pacific-atlantic-water-flow/)
* [Number of Islands	](https://leetcode.com/problems/number-of-islands/)
* [Number of Connected Components in an Undirected Graph	](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)
* [Kth Smallest Element in a BST	](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)
* [Binary Tree Right Side View	](https://leetcode.com/problems/binary-tree-right-side-view/)
* [All Nodes Distance K in Binary Tree	](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)
* [Path Sum II	](https://leetcode.com/problems/path-sum-ii/)
* [Path Sum III	](https://leetcode.com/problems/path-sum-iii/)
* [Lowest Common Ancestor of a Binary Tree	](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)
* [Number of Connected Components in an Undirected Graph	](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)
* [Course Schedule	](https://leetcode.com/problems/course-schedule/)
* [Course Schedule II	](https://leetcode.com/problems/course-schedule-ii/)
* [Minimum Height Trees	](https://leetcode.com/problems/minimum-height-trees/)
* [Binary Tree Level Order Traversal	](https://leetcode.com/problems/binary-tree-level-order-traversal/)
* [Binary Tree Zigzag Level Order Traversal	](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
* [Validate Binary Search Tree	](https://leetcode.com/problems/validate-binary-search-tree/)
* [Maximum Width of Binary Tree	](https://leetcode.com/problems/maximum-width-of-binary-tree/)
* [Populating Next Right Pointers in Each Node	](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)
* [Populating Next Right Pointers in Each Node II	](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)
* [Binary Tree Right Side View	](https://leetcode.com/problems/binary-tree-right-side-view/)
* [Binary Tree Maximum Path Sum	](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
* [Construct Binary Tree from Preorder and Inorder Traversal	](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
* [All Nodes Distance K in Binary Tree	](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)
* [Word Search II	](https://leetcode.com/problems/word-search-ii/)
* [Sort Items by Groups Respecting Dependencies	](https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/)



### Trie
* [Longest Word in Dictionary	](https://leetcode.com/problems/longest-word-in-dictionary/)
* [Index Pairs of a String	](https://leetcode.com/problems/index-pairs-of-a-string/)
* [Implement Trie (Prefix Tree)	](https://leetcode.com/problems/implement-trie-prefix-tree/)
* [Maximum XOR of Two Numbers in an Array	](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array)
* [Word Search II	](https://leetcode.com/problems/word-search-ii/)
* [Concatenated Words	](https://leetcode.com/problems/concatenated-words/)
* [Prefix and Suffix Search	](https://leetcode.com/problems/prefix-and-suffix-search/)
* [Palindrome Pairs	](https://leetcode.com/problems/palindrome-pairs/)
* [Design Search Autocomplete System	](https://leetcode.com/problems/design-search-autocomplete-system/)
* [Word Squares	](https://leetcode.com/problems/word-squares/)

TreeMap and Interval Tree
* [How to solve with interval tree ](https://leetcode.com/problems/insert-interval/)
