#!/usr/bin/python

def bubbleSort(bubbleList):
    for i in range(0,len(bubbleList) - 1):
        for j in range(0,len(bubbleList) - i -1):
            if (bubbleList[j] > bubbleList[j +1]):
                bubbleList[j],bubbleList[j+1] = bubbleList[j+1],bubbleList[j]

def bubbleSort1(bubbleList):
    for i in range(0,len(bubbleList) - 1):
        flag = 0
        for j in range(0,len(bubbleList) - i -1):
            if (bubbleList[j] > bubbleList[j +1]):
                bubbleList[j],bubbleList[j+1] = bubbleList[j+1],bubbleList[j]
                flag = 1
        if(flag == 0): break;

if __name__ == "__main__":
    print(bubbleSort([3,44,38,5,47,15,36,26,27,2,46,4,19,50,48]))