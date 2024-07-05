#include<stdio.h>
void main(){
	int row,cols,i,j,sum=0;
	printf("Enter Number Of Row:");
	scanf("%d",&row);
	printf("Enter Number Of Cols:");
	scanf("%d",&cols);
	int a[row][cols];
	
	for(i=0;i<row;i++){
		for(j=0;j<cols;j++){
			printf("Enter Element In arr[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);           
		}
        sum=sum+a[i][i];
	}
    printf("Diagonal Elements Are\n");
    for(i=0;i<row;i++){
        printf("Element a[%d][%d]=%d\n",i,i,a[i][i]);
    }printf("\nSum Of Diagonal Elements=%d",sum);
}