#include<stdio.h>
void main(){
	int row,cols,i,j;
	printf("Enter Number Of Row:");
	scanf("%d",&row);
	printf("Enter Number Of Cols:");
	scanf("%d",&cols);
	int a[row][cols],b[row][cols];
	
	printf("Enter Element Of First Matrix\n");
	for(i=0;i<row;i++){
		for(j=0;j<cols;j++){
			printf("Enter Element In arr[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
		}
	}printf("Enter Element Of Second Matrix\n");
	for(i=0;i<row;i++){
		for(j=0;j<cols;j++){
			printf("Enter Element In arr[%d][%d]:",i,j);
			scanf("%d",&b[i][j]);
		}
	}
	for(i=0;i<row;i++){
		for(j=0;j<cols;j++){
			printf("Element s[%d][%d]=%d ",i,j,a[i][j]+b[i][j]);
		}
		printf("\n");
	}
}
