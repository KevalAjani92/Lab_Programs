#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void main(){
    FILE * fp1,*fp2,*fp3;
    int n,i;

    fp1 = fopen("../TestCases/best100000.txt","w");
    fp2 = fopen("../TestCases/worst100000.txt","w");
    fp3 = fopen("../TestCases/average100000.txt","w");

    srand(time(NULL)); // Seed the random number generator

    for(i=1;i<=100000;i++){
        fprintf(fp1,"%d\n",i);
        fprintf(fp2,"%d\n",100000-i+1);
        fprintf(fp3,"%d\n",rand());
    }

    fclose(fp1);
    fclose(fp2);
    fclose(fp3);
}