#include<stdio.h>

typedef struct time
{
    int hh;
    int mm;
    int ss;
}time;
void sum(time res){
    while(res.ss>=60){
        res.mm=res.mm+1;
        res.ss=res.ss-60;
    }
    while(res.mm>=60){
        res.hh=res.hh+1;
        res.mm=res.mm-60;
    }
    printf("Sum Of Time= %02d:%02d:%02d",res.hh,res.mm,res.ss);
}
void main(){
    time t1,t2,res;
    printf("Enter 1st Time(hh:mm:ss):");
    scanf("%d %d %d",&t1.hh,&t1.mm,&t1.ss);
    printf("Enter 2nd Time(hh:mm:ss):");
    scanf("%d %d %d",&t2.hh,&t2.mm,&t2.ss);

    res.ss=t1.ss+t2.ss;
    res.mm=t1.mm+t2.mm;
    res.hh=t1.hh+t2.hh;

    sum(res);
}

