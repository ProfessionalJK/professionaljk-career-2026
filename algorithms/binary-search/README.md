//Generate README for the binary-search problem
# Binary Search
Binary Search is an efficient algorithm for finding a target value within a sorted array. It works by repeatedly dividing the search interval in half, eliminating half of the remaining elements from consideration until the target value is found or the interval is empty.
## Problem Statement
Given a sorted array of integers and a target value, implement a function that returns the index of
the target value in the array. If the target value is not found, return -1.

### Example 1
```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4.
```
### Example 2
```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1.
```
## Constraints
- The array is sorted in ascending order.
- The array may contain negative numbers.
- The array may be empty.
- The target value may not be present in the array.