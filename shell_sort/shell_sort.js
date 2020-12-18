function shellSort(arr) {
    let step = 1

    while (step < arr.length / 3) {
        step = step * 3 + 1
    }

    while (step >= 1) {
        for (let i = step; i < arr.length; i++) {
            let key = arr[i]
            let j;
            for (j = i; j - step >=0 && key < arr[j - step]; j-=step) {
                arr[j] = arr[j-step]
            }
            
            arr[j] = key
        }
        
        
        step = parseInt(step / 3)
    }
    return arr
}


const arr = [3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]
console.log(shellSort(arr))