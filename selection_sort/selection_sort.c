#include <stdio.h> 

int *selection_sort(int arr[],int len)
{
    int temp;
    int min_idx;
    for(int i = 0;i< len - 1;i++) {
        min_idx = i;
        for (int j = i + 1; j < len; j++)
        {
            if (arr[j] < arr[min_idx])
            {
                min_idx = j;
            }
            
        }
        temp = arr[i];
        arr[i] = arr[min_idx];
        arr[min_idx] = temp;
    }
    return arr;
}

int main (void)
{
    int arr[] = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
    int len = sizeof(arr)/sizeof(int);
    selection_sort(arr,len);
    for (int i = 0; i < len; i++)
    {
        printf("%d\t",arr[i]);
    }

    return 0;
}
