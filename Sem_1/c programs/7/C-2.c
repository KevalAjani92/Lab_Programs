#include <stdio.h>

void main(){

    int year,month,days;

    printf("Enter Year  : ");
    scanf("%d",&year);

    printf("Enter Month(1-12) : ");
    scanf("%d",&month);

    if((month==2) && ((year%400==0) || ((year%4==0) && (year%100!=0)))){

        switch(month){

        case 2 :printf("29");
                break;
    }
    }
    else{

        switch(month){
        case 2 :printf("28");
                break;
        case 4  :
        case 6  :
        case 9  :
        case 11 :printf("30");
                break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
                printf("31");
                break;
        default: 
                printf("Invalid Input");
                break;
    }
    }
}