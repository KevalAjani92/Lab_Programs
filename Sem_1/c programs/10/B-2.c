#include<stdio.h>

void main(){
    int i=2,N,flag=0;
    printf("Enter a Number:");
    scanf("%d",&N);

    while (i<=(N/2))
    {
        if (i%2==0)
        {
            flag=1;
            break;
        }
        i++;
    }
    if (flag==0)
    {
        printf("Entered Number Is Prime");
    }
    else printf("Entered Number Is Not Prime");
    
}