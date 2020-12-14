function bubble_sort(arr) {
    let temp
    for (let i = 0; i < arr.length-1; i++) {
        for (let j = 0; j < arr.length-i-1; j++) {
            if (arr[j]>arr[j + 1]) {
                temp = arr[j + 1]
                arr[j + 1] = arr[j]
                arr[j] = temp
            }
        }
    }
    return arr
}

function bubble_sort1(arr) {
    let temp
    let flag
    for (let i = 0; i < arr.length-1; i++) {
        flag = false
        for (let j = 0; j < arr.length-i-1; j++) {
            if (arr[j]>arr[j + 1]) {
                temp = arr[j + 1]
                arr[j + 1] = arr[j]
                arr[j] = temp
                flag = true
            }
        }
        if(!flag) break
    }
    return arr
}

const arr = [3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]
console.log(bubble_sort(arr))