def find_longest_substring(s: str) -> int:
    char_index_map = {}
    left = 0
    max_length = 0

    for right in range(len(s)):
        if s[right] in char_index_map and char_index_map[s[right]] >= left:
            left = char_index_map[s[right]] + 1
        char_index_map[s[right]] = right
        max_length = max(max_length, right - left + 1)

    return max_length

print(find_longest_substring("abcabcbb"))
print(find_longest_substring("bbbbb"))
print(find_longest_substring("pwwkew"))
print(find_longest_substring(""))
print(find_longest_substring("au"))
print(find_longest_substring("abba"))