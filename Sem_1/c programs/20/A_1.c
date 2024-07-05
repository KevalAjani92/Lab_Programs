#include<stdio.h>
struct date
{
    int dd;
    int mm;
    int yy;
};

struct emp
{
    char name[30];
    int salary;
    struct date jd;
};
void main(){
    struct emp e1;

    printf("Enter Name:");
    gets(e1.name);
    printf("Enter Salary:");
    scanf("%d",&e1.salary);
    printf("Enter Joining Date(dd/mm/yyyy):");
    scanf("%d %d %d",&e1.jd.dd,&e1.jd.mm,&e1.jd.yy);

    printf("\nName:%s\n",e1.name);
    printf("Salary=%d\n",e1.salary);
    printf("Joining Date:%d/%d/%d",e1.jd.dd,e1.jd.mm,e1.jd.yy);
}