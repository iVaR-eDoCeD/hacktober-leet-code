//
// 9. Palindrome Number
//Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1
// including header file 
#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
//creating a function that returns reverse of a number
 int  reverse(int n) {
        long  temp=0;
        while(n!=0){
            int rem;
            rem=n%10;
            temp=(temp*10)+rem;
            n=n/10;
        }
        // in order to check contraint we make this test 
         if(temp>INT_MAX || temp<INT_MIN){
                return 0;
            }

        return temp;
    }
    bool isPalindrome(int x) {
        int rev;
        // for negative numbers the reverse are not equal as -121 is not same as 121-
        if(x<0){
            return 0;
        }
        // check if reveresed number and original number are equal or not
        rev=reverse(x);
        if(x==rev){
            return 1;
        }
        return 0;
        
    }
};