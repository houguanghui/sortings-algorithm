#include <stdio.h> 
#define bool int
#define true 1
#define false 0

int *bubble_sort(int arr[],int len)
{
    int temp;
    for(int i = 0;i< len -1;i ++) {
        for (int j = 0; j < len - i -1; j++)
        {
            if (arr[j] > arr[j+1])
            {
                temp = arr[j +1];
                arr[j +1] = arr[j];
                arr[j] = temp;   
            }
            
        }
    }
    return arr;
}

int *bubble_sort2(int arr[],int len)
{
    int temp;
    bool flag;
    for(int i = 0;i< len -1;i ++) {
        flag = false;
        for (int j = 0; j < len - i -1; j++)
        {
            if (arr[j] > arr[j+1])
            {
                temp = arr[j +1];
                arr[j +1] = arr[j];
                arr[j] = temp;
                flag = true;   
            }
            
        }
        if (!flag) break;
    }
    return arr;
}

int main (void)
{
    int arr[] = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
    int len = sizeof(arr)/sizeof(int);
    bubble_sort(arr,len);
    for (int i = 0; i < len; i++)
    {
        printf("%d\t",arr[i]);
    }
    

    return 0;
}

