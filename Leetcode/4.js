function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    let m = 0;
  let combineArr = [...nums1, ...nums2].sort((a, b) => {
    if (a < b) return -1;
    else if (a === b) return 0;
    else return 1;
  });
  let len = combineArr.length;

  if (len % 2 === 0) {
    let f = combineArr[len / 2];
    let s = combineArr[len / 2 - 1];
    m = (f + s) / 2;
  } else {
    m = combineArr[Math.floor(len / 2)];
  }

  return m;
};