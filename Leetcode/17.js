function letterCombinations(digits: string): string[] {
     let keypad = {
    2: ["a", "b", "c"],
    3: ["d", "e", "f"],
    4: ["g", "h", "i"],
    5: ["j", "k", "l"],
    6: ["m", "n", "o"],
    7: ["p", "q", "r", "s"],
    8: ["t", "u", "v"],
    9: ["w", "x", "y", "z"],
  };

  if (digits.length <= 0) return [];
  if (digits.length === 1) return keypad[digits];

  let finalArray = [];
  finalArray = keypad[digits[0]];

  for (let i = 1; i < digits.length; i++) {
    let updateArray = [];
    let runningKey = keypad[digits[i]];
    for (let j = 0; j < finalArray.length; j++) {
      for (let k = 0; k < runningKey.length; k++) {
        updateArray.push(finalArray[j] + runningKey[k]);
      }
    }
    finalArray = [...updateArray];
  }

  return finalArray;
};