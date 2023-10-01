#include <iostream>
#include <vector>
#include <algorithm>

class Solution {
public:
  void nextPermutation(std::vector<int>& nums) {
    int n = nums.size(), i = n - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) i--;
    if (i < 0) {
      std::reverse(nums.begin(), nums.end()); // 
      return;
    }
    int j = n - 1;
    while (j > i && nums[j] <= nums[i]) j--;
    std::swap(nums[i], nums[j]);
    std::sort(nums.begin() + i + 1, nums.end()); 
  }
};
