#!/usr/bin/python

def insertionSort(insertionList):
    for i in range(1,len(insertionList)):
        key = insertionList[i]
        j = i -1
        while j >=0 and key < insertionList[j]:
            insertionList[j +1] = insertionList[j]
            j-=1
        insertionList[j + 1] = key
    return insertionList

if __name__ == "__main__":
    print(insertionSort([3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]))