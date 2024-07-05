#include<stdio.h>

void main()
{
    float M1,M2,M3,M4,M5,PR;
    printf("Enter First Subject Mark:");
    scanf("%f",&M1);
    printf("Enter Second Subject Mark:");
    scanf("%f",&M2);
    printf("Enter Third Subject Mark:");
    scanf("%f",&M3);
    printf("Enter Fourth Subject Mark:");
    scanf("%f",&M4);
    printf("Enter Fifth Subject Mark:");
    scanf("%f",&M5);
    PR=(M1+M2+M3+M4+M5)/5;
    if(PR<=35){
        printf("Fail Class");
    }else if(PR>35 && PR<=45){
             printf("Pass Class");
           }
    else if(PR>45 && PR<=60){
             printf("Second Class");
        }   
    else if(PR>60 && PR<=70){
            printf("First Class");
        }
    else if(PR>70){
        printf("Distinction");
    }
}