# Anagram Groups

Given an array of strings `strs`, this program groups all anagrams together into sublists. An anagram is defined as a string that contains the exact same characters as another string, but the order of the characters can be different.

## Example Scenarios

### Example 1:

**Input:** `strs = ["act","pots","tops","cat","stop","hat"]`  
**Output:** `[["hat"],["act", "cat"],["stop", "pots", "tops"]]`

### Example 2:

**Input:** `strs = ["x"]`  
**Output:** `[["x"]]`

### Example 3:

**Input:** `strs = [""]`  
**Output:** `[[""]]`

## Constraints

- `1 <= strs.length <= 1000`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

## Notes

- The output order of the groups does not matter.
- The input array can contain duplicates and empty strings.

---
