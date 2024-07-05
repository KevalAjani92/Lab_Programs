#include<stdio.h>

void main(){
	int i,j,x,y;
	printf("Enter Rows & Columns:");
	scanf("%d %d",&x,&y);
	int a[x][y];

	for(i=0;i<x;i++){
		for(j=0;j<y;j++){
			printf("Enter Element a[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
		}
	}
    printf("\nHorizontal\n");
	for(i=0;i<x;i++){
		for(j=0;j<y;j++){
			if(i%2==0){
				printf("%d ",a[i][j]);
			}else{
				printf("%d ",a[i][y-1-j]);
			}
		}
	}
    printf("\nVertical\n");
    for(j=0;j<y;j++){
		for(i=0;i<x;i++){
			if(j%2==0){
				printf("%d ",a[i][j]);
			}else{
				printf("%d ",a[x-1-i][j]);
			}
		}
	}
}