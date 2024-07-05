#include<stdio.h>

void main(){
    int n,firstdigit,lastdigit,r,sum=0;
    printf("Enter a Number:");
    scanf("%d",&n);

    lastdigit=n%10;
    while (n!=0)
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    firstdigit=sum%10;;

    printf("Sum Of First&Last Digit=%d",firstdigit+lastdigit);
}