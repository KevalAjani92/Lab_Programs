#include<stdio.h>
#include<limits.h>

void main(){
    int n,x;
    int max=INT_MIN,smax=INT_MIN;
    printf("Enter n:");
    scanf("%d",&n);
    int a[n],i;
    for(i=0;i<n;i++){
        printf("Enter Element in a[%d]:",i);
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        if(max<a[i]){
            smax=max;
            max=a[i];
        }else if(smax<a[i] && max!=a[i]){
            smax=a[i];
        }
    }
    printf("%d",smax);
}