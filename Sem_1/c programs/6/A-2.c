#include<stdio.h>

void main()
{
    int BS,GS;
    printf("Enter Basic Salary:");
    scanf("%d",&BS);
    if (BS>=10000 && BS<20000)
    {
        GS=BS+BS*0.2+BS*0.8;
        printf("Gross Salary=%d",GS);
    }
    else if (BS>=20000 && BS<30000)
    {
        GS=BS+BS*0.25+BS*0.9;
        printf("Gross Salary=%d",GS);
    }
    else if (BS>=30000)
    {
        GS=BS+BS*0.3+BS*0.95;
        printf("Gross Salary=%d",GS);
    }
}