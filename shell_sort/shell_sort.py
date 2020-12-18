def shellSort(list):

    step = 1

    while step < len(list)/3:
        step = step * 3 + 1

    while(step >= 1):
        for i in range(step,len(list)):
            j=i
            key = list[i]
            while j-step >=0 and key < list[j-step]:
                list[j] = list[j - step]
                j -= step
            list[j] = key
        step //= 3

    return list

if __name__ == '__main__':
    print(shellSort([3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]))