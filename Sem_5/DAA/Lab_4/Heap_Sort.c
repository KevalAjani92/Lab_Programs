#include <stdio.h>
#include <time.h>

int readArrFromFile(int arr[], int n, int choice)
{
    FILE *fp;
    switch (choice)
    {
    case 1:
        if (n <= 100)
        {
            fp = fopen("../TestCases/best100.txt", "r");
        }
        else if (n <= 1000)
        {
            fp = fopen("../TestCases/best1000.txt", "r");
        }
        else if (n <= 10000)
        {
            fp = fopen("../TestCases/best10000.txt", "r");
        }
        else if (n <= 100000)
        {
            fp = fopen("../TestCases/best100000.txt", "r");
        }
        else
        {
            printf("Enter Size Less than 100000\n");
        }
        break;
    case 2:
        if (n <= 100)
        {
            fp = fopen("../TestCases/average100.txt", "r");
        }
        else if (n <= 1000)
        {
            fp = fopen("../TestCases/average1000.txt", "r");
        }
        else if (n <= 10000)
        {
            fp = fopen("../TestCases/average10000.txt", "r");
        }
        else if (n <= 100000)
        {
            fp = fopen("../TestCases/average100000.txt", "r");
        }
        else
        {
            printf("Enter Size Less than 100000\n");
        }
        break;
    case 3:
        if (n <= 100)
        {
            fp = fopen("../TestCases/worst100.txt", "r");
        }
        else if (n <= 1000)
        {
            fp = fopen("../TestCases/worst1000.txt", "r");
        }
        else if (n <= 10000)
        {
            fp = fopen("../TestCases/worst10000.txt", "r");
        }
        else if (n <= 100000)
        {
            fp = fopen("../TestCases/worst100000.txt", "r");
        }
        else
        {
            printf("Enter Size Less than 100000\n");
        }
        break;
    default:
        printf("Enter Valid Choice\n");
        break;
    }
    if (fp == NULL)
    {
        printf("File Not Found\n");
        return 0;
    }
    for (int i = 0; i < n; i++)
    {
        fscanf(fp, "%d", &arr[i]);
    }
    fclose(fp);
    return 1;
}

void heapify(int arr[], int n, int i)
{
    int maxIndex = i,leftChild = 2*i+1,rightChild = 2*i+2;
    if (leftChild < n && arr[leftChild] > arr[maxIndex]) {
            maxIndex = leftChild;
    }
    if (rightChild < n && arr[rightChild] > arr[maxIndex]) {
        maxIndex = rightChild;
    }
    if (i != maxIndex) {
        int temp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = temp;
        heapify(arr, n, maxIndex);
    }
}

void heapSort(int arr[], int n)
{
    // buildMaxHeap
    for (int i = (n / 2) - 1; i >= 0; i--)
    {
        heapify(arr, n, i);
    }

    for (int i = n - 1; i >= 0; i--)
    {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        heapify(arr,i,0);
    }
}


void main()
{
    clock_t start, end;
    double cputime;
    int choice, n;

    printf("Enter Size Of Array : ");
    scanf("%d", &n);
    printf("Enter Choice\n1 For Best Case\n2 For Average Case\n3 For Worst Case : ");
    scanf("%d", &choice);

    int arr[n];
    if (readArrFromFile(arr, n, choice))
    {
        start = clock();
        heapSort(arr, n);
        end = clock();
        cputime = ((double)(end - start)) / CLOCKS_PER_SEC;
        printf("Time Taken = %f sec\n", cputime);
        // for(int i=0;i<n;i++){
        //     printf("%d ",arr[i]);
        // }
    }
}