#include<stdio.h>

void main(){
    int n,r,sum=0;
    printf("Enter Number:");
    scanf("%d",&n);

    while (n!=0)    
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    while (sum!=0)
    {
        r=sum%10;
        sum=sum/10;

        switch (r)
        {
        case 0:
            printf("Zero");
            break;
        case 1:
            printf("One");
            break;
        case 2:
            printf("Two");
            break;
        case 3:
            printf("Three");
            break;
        case 4:
            printf("Four");
            break;
        case 5:
            printf("Five");
            break;
        case 6:
            printf("Six");
            break;
        case 7:
            printf("Seven");
            break;
        case 8:
            printf("Eight");
            break;
        case 9:
            printf("Nine");
            break;
        
        default:
            break;
        }
        printf(" ");
    }
    
}