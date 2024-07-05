#include<stdio.h>
void main(){
	int row1,row2,cols1,cols2,i,j,k,sum;
	printf("Enter row & cols For 1st Matrix:");
	scanf("%d %d",&row1,&cols1);
	printf("Enter row & cols For 2nd Matrix:");
	scanf("%d %d",&row2,&cols2);

	if(cols1==row2){
		int a[row1][cols1],b[row2][cols2],res[row1][cols2];
		printf("\nEnter 1st Matrix\n");
	for(i=0;i<row1;i++){
		for(j=0;j<cols1;j++){
			printf("Enter Element In a[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
		}
	}
	printf("\nEnter 2nd Matrix\n");
	for(i=0;i<row2;i++){
		for(j=0;j<cols2;j++){
			printf("Enter Element In b[%d][%d]:",i,j);
			scanf("%d",&b[i][j]);
		}
	}
	printf("\nResultunt Matrix Of (%d*%d):\n",row1,cols2);
    for(i=0;i<row1;i++){
		for(j=0;j<cols2;j++){
			sum=0;
			for(k=0;k<cols1;k++){
				sum+=(a[i][k]*b[k][j]);
			}
			res[i][j]=sum;
			printf("%d ",res[i][j]);
		}
		printf("\n");
	}
	}
		else{
			printf("For These Matrix Multiplication Is Not Possible");
		}
}

