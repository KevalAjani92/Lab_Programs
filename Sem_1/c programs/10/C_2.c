#include<stdio.h>

void main(){
    int a,b,min,hcf,lcm,max;
    printf("Enter First Number:");
    scanf("%d",&a);
    printf("Enter Second Number:");
    scanf("%d",&b);

    if(a<b){ 
        min=a;
        max=b;
    }else{ 
        min=b;
        max=a;
        }
    int i=min,j=max;
    while(i>=1){
        if(a%i==0 && b%i==0){
            hcf=i;
            break;
        }
        i--;
    }while (1)
    {
        if (j%a==0 && j%b==0)
        {
            lcm=j;
            break;
        }
        j++;
    }
    
    printf("HCF Of %d And %d Is:%d\n\n",a,b,hcf);
    printf("LCM Of %d And %d Is:%d",a,b,lcm);
}