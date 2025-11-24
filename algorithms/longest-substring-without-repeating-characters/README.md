# Longest Substring Without Repeating Characters

This module provides solutions to the "Longest Substring Without Repeating Characters" problem, commonly found in coding interviews and algorithm practice.

## Problem Statement

Given a string, find the length of the longest substring without repeating characters.

**Example:**
- Input: `"abcabcbb"`
- Output: `3` (`"abc"` is the longest substring)

## Approach

The typical solution uses a sliding window and a hash set or map to track characters and their indices for efficient lookups.

## Languages

- Python
- Java

## Usage

Implementations are provided in both Python and Java. See the respective files for details and usage examples.

## License

MIT

## Sample Test Cases

| Input        | Expected Output | Explanation                      |
|--------------|-----------------|----------------------------------|
| `"abcabcbb"` | `3`             | `"abc"` is the longest substring |
| `"bbbbb"`    | `1`             | `"b"` is the longest substring   |
| `"pwwkew"`   | `3`             | `"wke"` is the longest substring |
| `""`         | `0`             | Empty string                     |
| `"abba"`     | `2`             | `"ab"` is the longest substring  |