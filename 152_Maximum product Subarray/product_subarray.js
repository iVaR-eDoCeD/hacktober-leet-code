/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function (nums) {
    let max = -Infinity;
    let max2 = -Infinity;
    let sum = 1;
    for (let i = 0; i < nums.length; i++) {
      sum *= nums[i];
      max = Math.max(max, sum);
      if (sum == 0) {
        sum = 1;
      }
    }
    sum = 1;
  
    for (let i = nums.length - 1; i > 0; i--) {
      sum *= nums[i];
      max2 = Math.max(max2, sum);
      if (sum == 0) {
        sum = 1;
      }
    }
    let res = Math.max(max, max2);
  
    return res;
  };