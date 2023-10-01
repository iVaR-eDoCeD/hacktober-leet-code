/*
        392.  Is Subsequence

Overall Time complexity:- O(m)

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters

*/

//Including Header file
#include<bits/stdc++.h>
using namespace std;


class Solution {
public:
    bool isSubsequence(string s, string t) {

        // String has special feature string.length()
        // to find the length of the string

        int n = s.length(),m=t.length();
        int j = 0; 

        // For index of str1 (or subsequence
 
        // Traverse str2 and str1, and
        // compare current character
        // of str2 with first unmatched char
        // of str1, if matched
        // then move ahead in str1

        for (int i = 0; i < m and j < n; i++)
            if (s[j] == t[i])
                j++;
        
    // If all characters of str1 were found in str2 return True
    return (j == n);
    }
};