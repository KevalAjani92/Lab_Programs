#include <stdio.h>
#include <time.h>

int readArrFromFile(int arr[], int n)
{
    FILE *fp;
    fp = fopen("../TestCases/best100000.txt", "r");
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

int binarySearch(int arr[], int n, int choice)
{
    int start = 0, end = n - 1;
    while (start <= end)
    {
        int mid = (start + end) / 2;
        if (arr[mid] == choice)
        {
            return mid;
        }
        else if (arr[mid] > choice)
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
    }
    return -1;
}

int binarySearchRecursion(int arr[], int start, int end, int choice)
{
    if (start <= end)
    {
        int mid = (start + end) / 2;
        if (arr[mid] == choice)
        {
            return mid;
        }
        else if (arr[mid] > choice)
        {
            return binarySearchRecursion(arr, start, mid - 1, choice);
        }
        else
        {
            return binarySearchRecursion(arr, mid + 1, end, choice);
        }
    }
    return -1;
}

void main()
{
    clock_t start, end;
    double cputime;
    int choice, n, result;

    printf("Enter Size Of Array : ");
    scanf("%d", &n);
    printf("Enter Element To Find : ");
    scanf("%d", &choice);

    int arr[n];
    if (readArrFromFile(arr, n))
    {
        start = clock();
        result = binarySearch(arr, n, choice);
        end = clock();
        if (result == -1)
        {
            printf("Not Found\n");
        }
        else
        {
            printf("Element Found at Index : %d\n", result);
        }
        cputime = ((double)(end - start)) / CLOCKS_PER_SEC;
        printf("Time Taken = %fms\n", cputime);
    }

    // recursion
    // printf("\nUsing Recurrsion\n");
    // start = clock();
    // result = binarySearchRecursion(arr, 0, n - 1, choice);
    // end = clock();
    // if (result == -1)
    // {
    //     printf("Not Found\n");
    // }
    // else
    // {
    //     printf("Element Found at Index : %d\n", result);
    // }
    // cputime = ((double)(end - start)) / CLOCKS_PER_SEC;
    // printf("Time Taken = %fms\n", cputime);
}