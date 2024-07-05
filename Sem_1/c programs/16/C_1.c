#include<stdio.h>

void main(){
	int rows,cols,i,j,count0=0,count1=0;
	printf("Enter Number Of Rows:");
	scanf("%d",&rows);
	printf("Enter Number Of Column:");
	scanf("%d",&cols);
	int a[rows][cols];
	
	for(i=0;i<rows;i++){
		for(j=0;j<cols;j++){
			printf("Enter Element[%d][%d]:",i,j);
			scanf("%d",&
			a[i][j]);
			if(a[i][j]==0){
				count0++;
			}else count1++;
		}
	}
	if(count0>count1){
		printf("Sparse Matrix");
	}else printf("Not a Sparse Matrix");
}
