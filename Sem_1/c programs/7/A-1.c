#include<stdio.h>

void main(){
    int D;
    printf("Enter Day Number(1-7):");
    scanf("%d",&D);
    switch (D)
    {
    case 1:
        printf("Sunday");
        break;
    case 2:
        printf("Monday");
        break;
    case 3:
        printf("Tuesday");
        break;
    case 4:
        printf("Wednesday");
        break;
    case 5:
        printf("Thursday");
        break;
    case 6:
        printf("Friday");
        break;
    case 7:
        printf("Saturday");
        break;      
    
    default:
        printf("Invalid Input");
        break;
    }
}