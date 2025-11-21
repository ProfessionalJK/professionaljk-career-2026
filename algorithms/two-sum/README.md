# Two Sum

## Problem

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Approach

The typical solution uses a hash map to store the difference between the target and each element, allowing for efficient lookup.

## Usage

Implementations are available in both Python and Java in this directory.

- `two_sum.py` for Python
- `TwoSum.java` for Java

## Example

Input: `nums = [2,7,11,15]`, `target = 9`  
Output: `[0,1]`  
Explanation: `nums[0] + nums[1] == 9`

## Test Cases

### Test Case 1
Input: `nums = [3, 2, 4]`, `target = 6`  
Output: `[1, 2]`  
Explanation: `nums[1] + nums[2] == 6`

### Test Case 2
Input: `nums = [1, 5, 3, 7]`, `target = 8`  
Output: `[0, 3]`  
Explanation: `nums[0] + nums[3] == 8`

### Test Case 3
Input: `nums = [0, 4, 3, 0]`, `target = 0`  
Output: `[0, 3]`  
Explanation: `nums[0] + nums[3] == 0`

### Test Case 4
Input: `nums = [-1, -2, -3, -4, -5]`, `target = -8`  
Output: `[2, 4]`  
Explanation: `nums[2] + nums[4] == -8`

## Note

The current implementation uses a brute force approach to solve the Two Sum problem. In the future, this solution may be optimized for better performance.