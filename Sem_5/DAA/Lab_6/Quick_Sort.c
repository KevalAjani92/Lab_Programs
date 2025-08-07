#include <stdio.h>
#include <time.h>

int readArrFromFile(int arr[],int n,int choice){
    FILE *fp;
    switch (choice)
    {
    case 1:
        if(n<=100){
            fp = fopen("../TestCases/best100.txt","r");
        }else if(n<=1000){
            fp = fopen("../TestCases/best1000.txt","r");
        }else if(n<=10000){
            fp = fopen("../TestCases/best10000.txt","r");
        }else if(n<=100000){
            fp = fopen("../TestCases/best100000.txt","r");
        }else{
            printf("Enter Size Less than 100000\n");
        }
        break;
    case 2:
        if(n<=100){
            fp = fopen("../TestCases/average100.txt","r");
        }else if(n<=1000){
            fp = fopen("../TestCases/average1000.txt","r");
        }else if(n<=10000){
            fp = fopen("../TestCases/average10000.txt","r");
        }else if(n<=100000){
            fp = fopen("../TestCases/average100000.txt","r");
        }else{
            printf("Enter Size Less than 100000\n");
        }
        break;
    case 3:
        if(n<=100){
            fp = fopen("../TestCases/worst100.txt","r");
        }else if(n<=1000){
            fp = fopen("../TestCases/worst1000.txt","r");
        }else if(n<=10000){
            fp = fopen("../TestCases/worst10000.txt","r");
        }else if(n<=100000){
            fp = fopen("../TestCases/worst100000.txt","r");
        }else{
            printf("Enter Size Less than 100000\n");
        }
        break;    
    default:
        printf("Enter Valid Choice\n");
        break;
    }
    if(fp == NULL){
        printf("File Not Found\n");
        return 0;
    }
    for(int i=0;i<n;i++){
        fscanf(fp,"%d",&arr[i]);
    }
    fclose(fp);
    return 1;
}

int pivot(int arr[], int low, int high)
{
    int pivot = arr[low];
    int k = low, l = high + 1;
    k++;
    while (k <= high && arr[k] < pivot)
    {
        k++;
    }
    l--;
    while (l > low && arr[l] >= pivot)
    {
        l--;
    }
    while (k < l)
    {
        int temp = arr[k];
        arr[k] = arr[l];
        arr[l] = temp;
        while (k <= high && arr[k] < pivot)
        {
            k++;
        }
        while (l > low && arr[l] >= pivot)
        {
            l--;
        }
    }
    int temp = arr[l];
    arr[l] = arr[low];
    arr[low] = temp;
    return l;
}
void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int index = pivot(arr, low, high);
        quickSort(arr, low, index - 1);
        quickSort(arr, index + 1, high);
    }
}

void main()
{
    clock_t start,end;
    double cputime;
    int choice,n;
    
    printf("Enter Size Of Array : ");
    scanf("%d",&n);
    printf("Enter Choice\n1 For Best Case\n2 For Average Case\n3 For Worst Case : ");
    scanf("%d",&choice);

    int arr[n];
    if(readArrFromFile(arr,n,choice)){
        start = clock();
        quickSort(arr,0,n-1);
        end = clock();
        cputime = ((double)(end-start))/CLOCKS_PER_SEC;
        printf("Time Taken = %f sec\n",cputime);
        // for(int i=0;i<n;i++){
        //     printf("%d ",arr[i]);
        // }
    }
}