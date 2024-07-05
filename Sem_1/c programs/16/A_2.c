#include<stdio.h>
void main(){
	int row,cols,i,j,ZC=0,PC=0,NC=0;
	printf("Enter Number Of Row:");
	scanf("%d",&row);
	printf("Enter Number Of Cols:");
	scanf("%d",&cols);
	int a[row][cols];
	
	for(i=0;i<row;i++){
		for(j=0;j<cols;j++){
			printf("Enter Element In arr[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
			if(a[i][j]>0){
				PC++;
			}else if(a[i][j]<0){
				NC++;
			}else ZC++;
		}
	}
	printf("Positive=%d\n",PC);
	printf("Negative=%d\n",NC);
	printf("Zero Count=%d\n",ZC);	
}

