#include<stdio.h>

int countDigit(int n);

void main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int temp = n,count = 0;
    while(temp!=0){
        count++;
        temp/=10;
    }
    printf("Number Of Digit(Iterative) : %d",count);
    printf("\nNumber Of Digit(Recursive) : %d",countDigit(n));
}
int countDigit(int n){
    if(n==0){
        return 0;
    }
    return 1+countDigit(n/10);
}