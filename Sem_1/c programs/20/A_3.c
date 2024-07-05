#include<stdio.h>

struct demo
{
    int a;
    char b[10];
    double c;
};
union demo2
{
    int a;
    char b[10];
    double c;
};
void main(){
    struct demo x;
    union demo2 y;
    printf("Structure Size=%d\n",sizeof(x));
    printf("Union Size=%d",sizeof(y));
}