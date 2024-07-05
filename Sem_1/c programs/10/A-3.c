#include<stdio.h>

void main(){
    int i=2,N,count=0;
    printf("Enter a Number:");
    scanf("%d",&N);

    while (i<=(N/2))
    {
        if (i%2==0)
        {
            count++;
        }
        i++;
    }
    if (count==0)
    {
        printf("Entered Number Is Prime");
    }
    else printf("Entered Number Is Not Prime");
    
}