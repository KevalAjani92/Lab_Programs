#include<stdio.h>

void main(){
	int i,j,m,n;
	printf("Enter Rows & Columns:");
	scanf("%d %d",&m,&n);
	int a[m][n];

	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			printf("Enter Element a[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
		}
	}
	int minr=0,maxr=m-1,minc=0,maxc=n-1,tne=m*n,count=0;
	while (count<tne)
	{
		for(j=minc;j<=maxc;j++){
			printf("%d ",a[minr][j]);
			count++;
		}
		minr++;
		if(count>=tne) break;
		for(i=minr;i<=maxr;i++){
			printf("%d ",a[i][maxc]);
			count++;
		}
		maxc--;
		if(count>=tne) break;
		for(j=maxc;j>=minc;j--){
			printf("%d ",a[maxr][j]);
			count++;
		}
		maxr--;
		if(count>=tne) break;
		for(i=maxr;i>=minr;i--){
			printf("%d ",a[i][minc]);
			count++;
		}
		minc++;
	}
	
}