function insertion_sort(arr) {
    for (let i = 1; i < arr.length; i++) {
        let j;
        let temp = arr[i];
        for (j = i - 1; j >=0 && temp < arr[j]; j--) {
            arr[j + 1] = arr[j]
        }
        arr[j + 1] = temp
    }
    return arr
}

const arr = [3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]
console.log(insertion_sort(arr))