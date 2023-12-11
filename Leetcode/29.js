function divide(dividend: number, divisor: number): number {
    let ans = dividend / divisor;
    let finalAns = 0;
    if (ans >= 0) {
        finalAns = Math.floor(ans);
    } else {
        finalAns = Math.ceil(ans);
    }

    if (finalAns > 2147483647) {
        return 2147483647;
    } else if (finalAns < -2147483648) {
        return -2147483648;
    } else {
        return finalAns;
    }
};