#!/usr/bin/python

def selection_sort(selectionList):
    for i in range(0,len(selectionList)-1):
        min_idx = i
        for j in range(i + 1,len(selectionList)):
            if selectionList[j] < selectionList[min_idx]:
                min_idx = j
        selectionList[i],selectionList[min_idx] = selectionList[min_idx], selectionList[i]
    return selectionList



if __name__ == "__main__":
    print(selection_sort([3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]))