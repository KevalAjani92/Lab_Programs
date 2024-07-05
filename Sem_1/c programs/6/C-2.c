#include<stdio.h>

void main()
{
    int R,G,B;
    float R1,G1,B1,C,M,Y,W,BLACK;
    printf("Enter Value Of R:");
    scanf("%d",&R);
    printf("Enter Value Of G:");
    scanf("%d",&G);
    printf("Enter Value Of B:");
    scanf("%d",&B);
    R1=R/255.0;
    G1=G/255.0;
    B1=B/255.0;

    if(R1>G1 && R1>B1){
        W=R1;
    }
    else if(G1>R1 && G1>B1){
        W=G1;
         }
    else if(B1>G1 && B1>R1){
        W=B1;
    }
    printf("White=%f",W);

    M=(W-R1)/W;
    printf("\nMagenta=%f",M);

    Y=(W-G1)/W;
    printf("\nYellow=%f",Y);

    BLACK=1-W;
    printf("\nBlack=%f",BLACK);
}