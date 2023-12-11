function convert(s: string, numRows: number): string {
    let strArr = [];
    let i = 0;
    let j = 0;
    let topBtm = true;
    while (s.length > i) {
      if (strArr[j]) {
        strArr[j] += s[i];
      } else {
        strArr[j] = s[i];
      }
      i++;

      if (topBtm) {
        j++;
        if (j + 1 === numRows) {
          topBtm = false;
        }
      } else {
        j--;
        if (j === 0) {
          topBtm = true;
        }
      }
    }

  return strArr.join("")
};