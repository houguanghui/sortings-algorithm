#include <stdio.h> 

int *insertion_sort(int arr[],int len)
{
    int temp;
    int j;
    for(int i = 1;i< len;i++) {
        temp = arr[i];
        for (j = i-1; j >=0 && temp < arr[j]; j--)
        {
            arr[j + 1] = arr[j];   
        }
        arr[j + 1] = temp;
    }
    return arr;
}

int main (void)
{
    int arr[] = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
    int len = sizeof(arr)/sizeof(int);
    insertion_sort(arr,len);
    for (int i = 0; i < len; i++)
    {
        printf("%d\t",arr[i]);
    }
    

    return 0;
}
