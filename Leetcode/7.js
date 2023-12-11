function reverse(x: number): number {
  let str = String(x);
  let isSub = false;
  if (str[0] === "-") {
    isSub = true;
  }
  let reverseStr = "";
  for (let i = 0; i < str.length; i++) {
    if (isSub && i === 0) {
      continue;
    }
    reverseStr = str[i] + reverseStr;
  }
  if (isSub) {
    reverseStr = "-" + reverseStr;
  }
  if (Number(reverseStr) <= -(2 ** 31) || Number(reverseStr) >= 2 ** 31 - 1) {
    return 0;
  }
  return Number(reverseStr);
};