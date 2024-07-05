#include<stdio.h>
#include<math.h>

void main()
{
    float a,b,c,D,root1,root2,realPart,imagPart;
    printf("Enter Value Of a:");
    scanf("%f",&a);
    printf("Enter Value Of b:");
    scanf("%f",&b);
    printf("Enter Value Of c:");
    scanf("%f",&c);
    D=pow(b,2)-4*a*c;

    if(D>0){
        root1=(-b+sqrt(D))/(2*a);
        root1=(-b-sqrt(D))/(2*a);
        printf("root1=%f\nroot2=%f",root1,root2);
    }
    else if(D==0){
        root1=root2=-b/(2*a);
        printf("root1=root2=%f",root1);
         }
    else if(D<0){
            realPart=-b/(2*a);
            imagPart=sqrt(-D)/(2*a);
            printf("root1=%f+%fi\nroot2=%f-%fi",realPart,imagPart,realPart,imagPart);
        }
}