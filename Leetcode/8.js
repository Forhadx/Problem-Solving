function myAtoi(s: string): number {
   let digits = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"];
  let str = s.trim();
  if (str == "") return 0;
  
  let store = "";
  if (str[0] === "-" || str[0] === "+") {
    store += str[0];
    str = str.slice(1);
  }

  for (let i = 0; i < str.length; i++) {
    if (digits.includes(str[i])) {
      store += str[i];
    } else {
      break;
    }
  }

  let num = Number(store);
  if (isNaN(num)) return 0;
  else if (num >= 2147483648) return 2147483647;
  else if (num < -2147483648) return -2147483648;
  else return num;
};  