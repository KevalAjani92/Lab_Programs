#include<stdio.h>
struct dist
{
    int feet;
    int inch;
};
void sum(struct dist res){
    while (res.inch>=12)
    {
        res.inch-=12;
        res.feet+=1;
    }
    printf("Sum Of Distances= %d'%d",res.feet,res.inch);
}
void main(){
    struct dist d1,d2,res;
    printf("Enter 1st Distan(feet'inch):");
    scanf("%d %d",&d1.feet,&d1.inch);
    printf("Enter 2nd Distan(feet'inch):");
    scanf("%d %d",&d2.feet,&d2.inch);

    res.feet=d1.feet+d2.feet;
    res.inch=d1.inch+d2.inch;
    sum(res);
}