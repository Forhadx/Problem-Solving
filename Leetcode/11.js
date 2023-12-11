function maxArea(height: number[]): number {
    let MAX = 0;
    let left = 0;
    let right = height.length - 1;

    while (left < right) {
      let len = right - left;
      let minHeight = Math.min(height[left], height[right]);
      let val = minHeight * len;
      MAX = Math.max(MAX, val);

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return MAX;
};