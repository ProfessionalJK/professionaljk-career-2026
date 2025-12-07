# Group Anagrams

## Problem Description

Given an array of strings, group the anagrams together. An anagram is a word formed by rearranging the letters of another word, using all the original letters exactly once.

## Example

**Input:**
["eat", "tea", "tan", "ate", "nat", "bat"]
**Output:**
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
## Approach

- Sort each word's characters and use the sorted string as a key in a hash map.
- Group words with the same sorted key together.

## Usage

Implementations are available in multiple languages (JavaScript, Python, Java). See the respective files for details.