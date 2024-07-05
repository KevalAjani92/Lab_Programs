#include<stdio.h>
void main(){
	int row,cols,i,j;
	printf("Enter Number Of Row:");
	scanf("%d",&row);
	printf("Enter Number Of Cols:");
	scanf("%d",&cols);
	int a[row][cols],temp,Transpose[cols][row];
	
	for(i=0;i<row;i++){
		for(j=0;j<cols;j++){
			printf("Enter Element In arr[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
		}
	}
    for(i=0;i<row/2;i++){
		for(j=0;j<cols;j++){
			temp=a[i][j];
            a[i][j]=a[row-1-i][j];
            a[row-1-i][j]=temp;
		}
	}	
    for(i=0;i<cols;i++){
		for(j=0;j<row;j++){
			Transpose[i][j]=a[j][i];
			printf("Element [%d][%d]:%d ",i,j,Transpose[i][j]);
		}
		printf("\n");
	}
}

