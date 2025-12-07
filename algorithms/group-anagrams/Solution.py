from typing import List
from collections import defaultdict

def group_anagrams(strs: List[str]) -> List[List[str]]:
    d = defaultdict(list)
    for s in strs:
        key = ''.join(sorted(s))  # sorted signature
        d[key].append(s)
    return list(d.values())

if __name__ == "__main__":
    tests = [
        ([], []),
        ([""], [[""]]),
        (["a"], [["a"]]),
        (["eat","tea","tan","ate","nat","bat"], [["eat","tea","ate"], ["tan","nat"], ["bat"]]),
        (["abc","bca","cab","xyz","zyx"], [["abc","bca","cab"], ["xyz","zyx"]])
    ]
    for inp, expected in tests:
        out = group_anagrams(inp)
        norm = sorted([sorted(g) for g in out])
        exnorm = sorted([sorted(g) for g in expected])
        print(inp, "OK=", norm==exnorm)