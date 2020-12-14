function selection_sort(arr) {
    let min_idx,temp;
    for (let i = 0; i < arr.length-1; i++) {
        min_idx = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min_idx]) {
                min_idx = j
            }
        }

        temp = arr[i]
        arr[i] = arr[min_idx]
        arr[min_idx] = temp
    }
    return arr
}

const arr = [3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]
console.log(selection_sort(arr))