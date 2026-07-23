class ArrayWrapper {

    constructor(nums) {
        this.nums = nums;
    }

    valueOf() {
        let sum = 0;

        for (let num of this.nums) {
            sum += num;
        }

        return sum;
    }

    toString() {
        return `[${this.nums.join(",")}]`;
    }
}