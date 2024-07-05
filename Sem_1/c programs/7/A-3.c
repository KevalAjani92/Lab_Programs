#include<stdio.h>

void main(){
    int a,b;
    char X;
    printf("Enter First Number:");
    scanf("%d",&a);
    printf("Enter Second Number:");
    scanf("%d",&b);
    printf("Enter Your Choice\nEnter + For Addition\nEnter - For Substraction\nEnter * For Multiplication\nEnter / For Division:");
    scanf(" %c",&X);

    switch (X)
    {
    case '+':
        printf("Answer=%d",a+b);
        break;
    case '-':
        printf("Answer=%d",a-b);
        break;
    case '*':
        printf("Answer=%d",a*b);
        break;
    case '/':
        printf("Answer=%f",(float)a/b);
        break;
    
    default:
        printf("Invalid Input");
        break;
    }
}