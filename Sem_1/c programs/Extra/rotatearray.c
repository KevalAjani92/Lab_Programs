#include<stdio.h>
void revese(int a[],int si,int ei){
    int temp,i,j;
    for(i=si,j=ei;i<=j;i++,j--){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
void main(){
    int n,k;
    printf("Enter size:");
    scanf("%d",&n);
    
    printf("Enter k:");
    scanf("%d",&k);
    k%=n;
    int a[n],i;
    for(i=0;i<n;i++){
        printf("Enter Element in a[%d]:",i);
        scanf("%d",&a[i]);
    }
    revese(a,0,n-1);    //reverse all element
    revese(a,0,k-1);    //reverse first k element
    revese(a,k,n-1);    //reverse remaining element
    for(i=0;i<n;i++){
        printf("\nElement a[%d]:%d",i,a[i]);
    }
}