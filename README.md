# About

These are the most popular coding interview questions, from easy to hard, in order.

The problems cover common patterns and algorithms in interviews:

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
* 3	[Find All Numbers Disappeared in an Array	](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindAllNumbersDisappeared.java) * 
* 4	[Single Number	](https://leetcode.com/problems/single-number/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SingleNumber.java) *
* 5	[Climbing Stairs	](https://leetcode.com/problems/climbing-stairs/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ClimbingStairs.java)
* 6	[Best Time to Buy and Sell Stock	](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BestTimeBuyAndSellStock.java)
* 7	[Maximum Subarray	](https://leetcode.com/problems/maximum-subarray/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MaximumSubarray.java)
* 8	[Range Sum Query - Immutable	](https://leetcode.com/problems/range-sum-query-immutable/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RangeSumQueryImmutable.java)
* 9	[Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LinkedListCycle.java) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LinkedListCycleII.java)
* 10	[Middle of the Linked List	](https://leetcode.com/problems/middle-of-the-linked-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MiddleElementLinkedList.java)
* 11	[Palindrome Linked List	](https://leetcode.com/problems/palindrome-linked-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PalindromeLinkedList.java) *
* 12	[Remove Linked List Elements	](https://leetcode.com/problems/remove-linked-list-elements/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RemoveLinkedListElements.java)
* 13	[Remove Duplicates from Sorted List	](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RemoveDuplicatesFromSortedList.java)
* 14	[Reverse Linked List	](https://leetcode.com/problems/reverse-linked-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ReverseLinkedList.java)
* 15	[Merge Two Sorted Lists	](https://leetcode.com/problems/merge-two-sorted-lists/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MergeTwoSortedLists.java)
* 16	[Meeting Rooms	](https://leetcode.com/problems/meeting-rooms) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MeetingRooms.java)
* 17	[Binary Search	](https://leetcode.com/problems/binary-search/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BinarySearch.java)
* 18	[Find Smallest Letter Greater Than Target	](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindSmallestLetterGreaterThanTarget.java) *
* 19	[Peak Index in a Mountain Array	](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PeakIndexMountainArray.java)
* 20	[Binary Tree Level Order Traversal II	](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BinaryTreeLevelOrderTraversalII.java)
* 21	[Average of Levels in Binary Tree	](https://leetcode.com/problems/average-of-levels-in-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/AverageLevelsBinaryTree.java)
* 22	[Minimum Depth of Binary Tree	](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MinimumDepthBinaryTree.java)
* 23	[Same Tree](https://leetcode.com/problems/same-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SameTree.java)
* 24	[Path Sum](https://leetcode.com/problems/path-sum/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PathSum.java)
* 25	[Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/DiameterBinaryTree.java)
* 26	[Merge Two Binary Trees	](https://leetcode.com/problems/merge-two-binary-trees/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MergeTwoBinaryTrees.java) *
* 27	[Maximum Depth of Binary Tree	](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MaximumDepthBinaryTree.java)
* 28	[Lowest Common Ancestor of a Binary Search Tree	](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LowestCommonAncestorBinarySearchTree.java)
* 29	[Subtree of Another Tree	](https://leetcode.com/problems/subtree-of-another-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SubtreeAnotherTree.java) *
* 30	[Invert Binary Tree	](https://leetcode.com/problems/invert-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/InvertBinaryTree.java)
* 31	[Two Sum	](https://leetcode.com/problems/two-sum/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/TwoSum.java)
* 32	[Squares of a Sorted Array	](https://leetcode.com/problems/squares-of-a-sorted-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SquaresSortedArray.java)
* 33	[Backspace String Compare	](https://leetcode.com/problems/backspace-string-compare) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BackspaceStringCompare.java) *
* 34	[Longest Word in Dictionary	](https://leetcode.com/problems/longest-word-in-dictionary/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LongestWordDictionary.java) (Trie)
* 35	[Index Pairs of a String	](https://leetcode.com/problems/index-pairs-of-a-string/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/IndexPairsString.java)
* 36	[Majority Element	](https://leetcode.com/problems/majority-element/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MajorityElement.java)
* 37	[Product of Array Except Self	](https://leetcode.com/problems/product-of-array-except-self/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ProductArrayExceptSelf.java)
* 38	[Find the Duplicate Number	](https://leetcode.com/problems/find-the-duplicate-number/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindDuplicateNumber.java)
* 39	[Find All Duplicates in an Array	](https://leetcode.com/problems/find-all-duplicates-in-an-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindAllDuplicatesInArray.java)
* 40	[Set Matrix Zeroes	](https://leetcode.com/problems/set-matrix-zeroes/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SetMatrixZeroes.java)
* 41	[Spiral Matrix	](https://leetcode.com/problems/spiral-matrix/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SpiralMatrix.java)
* 42	[Rotate Image	](https://leetcode.com/problems/rotate-image/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RotateImage.java)
* 43	[Word Search	](https://leetcode.com/problems/word-search/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/WordSearch.java)
* 44	[Letter Case Permutation	](https://leetcode.com/problems/letter-case-permutation/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LetterCasePermutation.java)
* 45	[Subsets	](https://leetcode.com/problems/subsets/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/Subsets.java)
* 46	[Subsets II	](https://leetcode.com/problems/subsets-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SubsetsII.java)
* 47	[Permutations	](https://leetcode.com/problems/permutations/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/Permutations.java)
* 48	[Permutations II	](https://leetcode.com/problems/permutations-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PermutationsII.java)
* 49	[Combinations	](https://leetcode.com/problems/combinations/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/Combinations.java)
* 50	[Combination Sum	](https://leetcode.com/problems/combination-sum/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CombinationSum.java)
* 51	[Combination Sum II	](https://leetcode.com/problems/combination-sum-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CombinationSumII.java)
* 52	[Combination Sum III	](https://leetcode.com/problems/combination-sum-iii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CombinationSumIII.java)
* 53	[Generate Parentheses	](https://leetcode.com/problems/generate-parentheses/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/GenerateParentheses.java)
* 54	[Target Sum	](https://leetcode.com/problems/target-sum/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/TargetSum.java)
* 55	[Palindrome Partitioning	](https://leetcode.com/problems/palindrome-partitioning/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PalindromePartitioning.java)
* 56	[Letter Combinations of a Phone Number	](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LetterCombinationsPhoneNumber.java)
* 57	[Generalized Abbreviation	](https://leetcode.com/problems/generalized-abbreviation/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/GeneralizedAbbreviation.java)
* 58	[House Robber	](https://leetcode.com/problems/house-robber/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/HouseRobber.java)
* 59	[House Robber II	](https://leetcode.com/problems/house-robber-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/HouseRobberII.java)
* 60	[Coin Change	](https://leetcode.com/problems/coin-change/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CoinChange.java)
* 61	[Maximum Product Subarray	](https://leetcode.com/problems/maximum-product-subarray/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MaximumProductSubarray.java)
* 62	[Longest Increasing Subsequence	](https://leetcode.com/problems/longest-increasing-subsequence/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LongestIncreasingSubsequence.java)
* 63	[Longest Palindromic Substring	](https://leetcode.com/problems/longest-palindromic-substring/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LongestPalindromicSubstring.java)
* 64	[Word Break	](https://leetcode.com/problems/word-break/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/WordBreak.java)
* 65	[Combination Sum IV	](https://leetcode.com/problems/combination-sum-iv/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CombinationSumIV.java)
* 66	[Decode Ways	](https://leetcode.com/problems/decode-ways/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/DecodeWays.java)
* 67	[Unique Paths	](https://leetcode.com/problems/unique-paths/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/UniquePaths.java)
* 68	[Jump Game	](https://leetcode.com/problems/jump-game/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/JumpGame.java)
* 69	[Palindromic Substrings	](https://leetcode.com/problems/palindromic-substrings/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PalindromicSubstrings.java)
* 70	[Number of Longest Increasing Subsequence	](https://leetcode.com/problems/number-of-longest-increasing-subsequence/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/NumberLongestIncreasingSubsequence.java)
* 71	[Partition Equal Subset Sum	](https://leetcode.com/problems/partition-equal-subset-sum/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PartitionEqualSubsetSum.java)
* 72	[Partition to K Equal Sum Subsets	](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PartitionKEqualSumSubsets.java)
* 73	[Best Time to Buy and Sell Stock with Cooldown	](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BestTimeBuyAndSellStock.java)
* 74	[Counting Bits	](https://leetcode.com/problems/counting-bits/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CountingBits.java)
* 75	[Linked List Cycle II	](https://leetcode.com/problems/linked-list-cycle-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LinkedListCycleII.java)
* 76	[Add Two Numbers	](https://leetcode.com/problems/add-two-numbers/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/AddTwoNumbers.java)
* 77	[Remove Nth Node From End Of List	](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RemoveNthNodeFromEndofList.java)
* 78	[Sort List	](https://leetcode.com/problems/sort-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SortList.java)
* 79	[Reorder List	](https://leetcode.com/problems/reorder-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ReorderList.java)
* 80	[Clone Graph	](https://leetcode.com/problems/clone-graph/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CloneGraph.java)
* 81	[Pacific Atlantic Water Flow	](https://leetcode.com/problems/pacific-atlantic-water-flow/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PacificAtlanticWaterFlow.java)
* 82	[Number of Islands	](https://leetcode.com/problems/number-of-islands/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/NumberofIslands.java)
* 83	[Graph Valid Tree	](https://leetcode.com/problems/graph-valid-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/GraphValidTree.java)
* 84	[Number of Connected Components in an Undirected Graph	](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/NumberOfConnectedComponentsUndirectedGraph.java)
* 85	[Reverse Linked List II	](https://leetcode.com/problems/reverse-linked-list-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ReverseLinkedListII.java)
* 86	[Rotate List	](https://leetcode.com/problems/rotate-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/RotateList.java)
* 87	[Swap Nodes in Pairs	](https://leetcode.com/problems/swap-nodes-in-pairs/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/SwapNodesInPairs.java)
* 88	[Odd Even Linked List	](https://leetcode.com/problems/odd-even-linked-list/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/OddEvenLinkedList.java)
* 89	[Kth Smallest Element in a Sorted Matrix	](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/KthSmallestElementSortedMatrix.java)
* 90	[Find K Pairs with Smallest Sums	](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindKPairsSmallestSums.java)
* 91	[Merge Intervals	](https://leetcode.com/problems/merge-intervals/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MergeIntervals.java)
* 92	[Interval List Intersections	](https://leetcode.com/problems/interval-list-intersections/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/IntervalListIntersections.java)
* 93	[Non-overlapping Intervals	](https://leetcode.com/problems/non-overlapping-intervals/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/NonOverlappingIntervals.java)
* 94	[Meeting Rooms II	](https://leetcode.com/problems/meeting-rooms-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MeetingRoomsII.java)
* 95	[Task Scheduler	](https://leetcode.com/problems/task-scheduler/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/TaskScheduler.java)
* 96	[Minimum Number of Arrows to Burst Balloons	](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MinimumNumberArrowsBurstBalloons.java)
* 97	[Find Minimum in Rotated Sorted Array	](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindMinimumRotatedSortedArray.java)
* 98	[Find Peak Element	](https://leetcode.com/problems/find-peak-element/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindPeakElement.java)
* 99	[Search in Rotated Sorted Array	](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SearchRotatedSortedArray.java)
* 100	[Search in Rotated Sorted Array II	](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SearchRotatedSortedArrayII.java)
* 101	[Search a 2D Matrix	](https://leetcode.com/problems/search-a-2d-matrix/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/Search2DMatrix.java)
* 102	[Search a 2D Matrix II	](https://leetcode.com/problems/search-a-2d-matrix-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/Search2DMatrixII.java)
* 103	[Find K Closest Elements	](https://leetcode.com/problems/find-k-closest-elements/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FindKClosestElements.java)
* 104	[Minimum Size Subarray Sum	](https://leetcode.com/problems/minimum-size-subarray-sum/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MinimumSizeSubarraySum.java)
* 105	[Fruit Into Baskets	](https://leetcode.com/problems/fruit-into-baskets/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/FruitIntoBaskets.java)
* 106	[Permutation in String	](https://leetcode.com/problems/permutation-in-string/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PermutationString.java)
* 107	[Longest Repeating Character Replacement	](https://leetcode.com/problems/longest-repeating-character-replacement/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LongestRepeatingCharacterReplacement.java)
* 108	[Kth Smallest Element in a BST	](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/KthSmallestElementBST.java)
* 109	[K Closest Points to Origin	](https://leetcode.com/problems/k-closest-points-to-origin/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/KClosestPointsToOrigin.java)
* 110	[Top K Frequent Elements	](https://leetcode.com/problems/top-k-frequent-elements/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/TopKFrequentElements.java)
* 111	[Sort Characters By Frequency	](https://leetcode.com/problems/sort-characters-by-frequency/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/SortCharactersByFrequency.java)
* 112	[Kth Largest Element in an Array	](https://leetcode.com/problems/kth-largest-element-in-an-array/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/KthLargestElementArray.java)
* 113	[Reorganize String	](https://leetcode.com/problems/reorganize-string/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ReorganizeString.java)
* 114	[Course Schedule	](https://leetcode.com/problems/course-schedule/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CourseSchedule.java)
* 115	[Course Schedule II	](https://leetcode.com/problems/course-schedule-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/CourseScheduleII.java)
* 116	[Minimum Height Trees	](https://leetcode.com/problems/minimum-height-trees/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MinimumHeightTrees.java)
* 117	[Binary Tree Level Order Traversal	](https://leetcode.com/problems/binary-tree-level-order-traversal/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/BinaryTreeLevelOrderTraversal.java)
* 118	[Binary Tree Zigzag Level Order Traversal	](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/BinaryTreeZigzagLevelOrderTraversal.java)
* 119	[Populating Next Right Pointers in Each Node	](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PopulatingNextRightPointersEachNode.java)
* 120	[Populating Next Right Pointers in Each Node II	](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PopulatingNextRightPointersEachNodeII.java)
* 121	[Binary Tree Right Side View	](https://leetcode.com/problems/binary-tree-right-side-view/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/BinaryTreeRightSideView.java)
* 122	[All Nodes Distance K in Binary Tree	](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/AllNodesDistanceKBinaryTree.java)
* 123	[Path Sum II	](https://leetcode.com/problems/path-sum-ii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PathSumII.java)
* 124	[Path Sum III	](https://leetcode.com/problems/path-sum-iii/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/PathSumIII.java)
* 125	[Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/LowestCommonAncestorBinarySearchTree.java)
* 126	[Maximum Binary Tree	](https://leetcode.com/problems/maximum-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MaximumBinaryTree.java)
* 127	[Maximum Width of Binary Tree	](https://leetcode.com/problems/maximum-width-of-binary-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/MaximumWidthOfBinaryTree.java)
* 128	[Construct Binary Tree from Preorder and Inorder Traversal	](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ConstructBinaryTreePreorderInorderTraversal.java)
* 129	[Validate Binary Search Tree	](https://leetcode.com/problems/validate-binary-search-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ValidateBinarySearchTree.java)
* 130	[Implement Trie (Prefix Tree)	](https://leetcode.com/problems/implement-trie-prefix-tree/) | [Solution](https://github.com/arjunmullick/Interview/blob/master/ImplementTriePrefixTree.java)
* 131	[3 Sum	](https://leetcode.com/problems/3sum/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/3Sum.java)
* 132	[3 Sum Closest	](https://leetcode.com/problems/3sum-closest/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/ThreeSumClosest.java)
* 133	[Subarrays with Product Less than K	](https://leetcode.com/problems/subarray-product-less-than-k/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/SubarrayProductLessThanK.java)
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
* [Sub Array Sub K](https://leetcode.com/problems/subarray-sum-equals-k/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/SubArraySubK.java)
* [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/DailyTemperature.java)
* [Evaluate Division](https://leetcode.com/problems/evaluate-division/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/EvaluateDivision.java)
* [Random Pick with Weight](https://leetcode.com/problems/random-pick-with-weight/) | [Solution](https://github.com/arjunmullick/coding-Interview/blob/master/RandomPickWeight.java)
* [Word Ladder](https://leetcode.com/problems/word-ladder/solution/)
* [Basin Calculator](https://leetcode.com/problems/basic-calculator-ii/) & [Advance Calculator](https://leetcode.com/problems/basic-calculator-iii/) i,ii,iii [Word Calculator](https://github.com/arjunmullick/Interview/blob/master/BasicCalculatorWords.java)
* [Nested Parser / Mini Parser / JSON](https://leetcode.com/problems/mini-parser/)
* [Decode String](https://leetcode.com/problems/decode-string/)
* [Subdomain visit count](https://leetcode.com/problems/subdomain-visit-count/)
* [Test justification](https://leetcode.com/problems/text-justification/)
* [Minimum Area Rectangle or Count of Unique Rectangle](https://leetcode.com/problems/minimum-area-rectangle/)
* [Log and process counter](https://github.com/arjunmullick/Interview/blob/master/LogAndProcessWindow.java)
* [Common Course](https://github.com/arjunmullick/Interview/blob/master/CommonCourse.java)
* [Maximum Mines in 2D plane](https://github.com/arjunmullick/Interview/blob/master/MaximumMines2DPlane.java)
* [Minimum Number of Refueling Stops](https://leetcode.com/problems/minimum-number-of-refueling-stops/) | [solution](https://github.com/arjunmullick/Interview/blob/master/MinimumNumberRefuelingStops.java)
* [Max random index integer in O(1)](https://github.com/arjunmullick/Interview/blob/master/MaxRandomInt.java)
* [Range Sum BST](https://github.com/arjunmullick/Interview/blob/master/RangeSumBST.java)
* [Insert Delete GetRandom O(1)](https://github.com/arjunmullick/Interview/blob/master/InsertDeleteGetRandomO(1).java)
* [Tax Slab](https://github.com/arjunmullick/Interview/blob/master/TaxSlab.java)
* [Design Add and Search Words Data Structure](https://github.com/arjunmullick/coding-Interview/blob/master/DesignAddSearchWordsDataStructure.java)
* [Vertical Order Traversal of a Binary Tree](https://github.com/arjunmullick/coding-Interview/blob/master/VerticalOrderTraversalBinaryTree.java)
* [Lowest Common Ancestor of a Binary Tree III or Intersection of two list](https://github.com/arjunmullick/coding-Interview/blob/master/LowestCommonAncestorBinaryTreeParentPointer.java)
* [Connecting Cities With Minimum Cost](https://github.com/arjunmullick/coding-Interview/blob/master/ConnectingCitiesWithMinimumCost.java)
* [Valid Word Abbreviation](https://github.com/arjunmullick/coding-Interview/blob/master/ValidWordAbbreviation.java)
* [Perimeter or Boundary of Tree ](https://github.com/arjunmullick/coding-Interview/blob/master/Perimeter%20or%20Boundary%20of%20Tree.java)
------------------------------------------------------------------------------------------------------------------------------

## Custom DataStructure 
* [Design HashMap](https://github.com/arjunmullick/coding-Interview/blob/master/MyHashMap.java)
* [Design LRU Cache](https://github.com/arjunmullick/coding-Interview/blob/master/LRUCache.java)

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
