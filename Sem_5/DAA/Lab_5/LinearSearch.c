#include<stdio.h>
#include<time.h>

int readArrFromFile(int arr[],int n){
    FILE *fp;
    fp = fopen("../TestCases/best100000.txt","r");
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

int linearSearch(int arr[],int n,int choice){
    for(int i = 0;i<n;i++){
        if(arr[i] == choice){
            return i;
        }
    }
    return -1;
}

void main()
{
    clock_t start, end;
    double cputime;
    int choice, n,result;

    printf("Enter Size Of Array : ");
    scanf("%d", &n);
    printf("Enter Element To Find : ");
    scanf("%d",&choice);

    int arr[n];
    if (readArrFromFile(arr, n))
    {
        start = clock();
        result = linearSearch(arr, n,choice);
        end = clock();
        if(result == -1){
            printf("Not Found\n");
        }else{
            printf("Element Found at Index : %d\n",result);
        }
        cputime = ((double)(end - start))/CLOCKS_PER_SEC;
        printf("Time Taken = %fms\n", cputime);
    }
}