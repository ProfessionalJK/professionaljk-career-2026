# Best Time to Buy and Sell Stock

## Problem Description

Given an array `prices` where `prices[i]` is the price of a given stock on day `i`, find the maximum profit you can achieve by buying on one day and selling on another later day. Only one transaction is allowed.

## Solution Approach

**Java & Python Approach:**  
Iterate through the array, tracking the minimum price seen so far. For each price, calculate the potential profit if sold on that day. Update the maximum profit whenever a higher profit is found.

## Time and Space Complexity

- **Time Complexity:** O(n), where n is the number of days.
- **Space Complexity:** O(1), only constant extra space is used.

## Examples

- **Example 1:**  
  Input: `[7, 1, 5, 3, 6, 4]`  
  Output: `5`  
  _Buy at 1, sell at 6._

- **Example 2:**  
  Input: `[7, 6, 4, 3, 1]`  
  Output: `0`  
  _No profit possible._

- **Example 3:**  
  Input: `[1, 2, 3, 4, 5]`  
  Output: `4`  
  _Buy at 1, sell at 5._

- **Example 4:**  
  Input: `[2, 4, 1]`  
  Output: `2`  
  _Buy at 2, sell at 4._

- **Example 5:**  
  Input: `[3, 3, 5, 0, 0, 3, 1, 4]`  
  Output: `4`  
  _Buy at 0, sell at 4._