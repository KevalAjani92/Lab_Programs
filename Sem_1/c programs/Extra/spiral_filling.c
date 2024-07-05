#include<stdio.h>

void main(){
	int i,j,n;
	printf("Enter n:");
	scanf("%d",&n);
	int a[n][n];

	int minr=0,maxr=n-1,minc=0,maxc=n-1,tne=n*n,count=0,x=1;
	while (count<tne)
	{
		for(j=minc;j<=maxc;j++){
			a[minr][j]=x;
			x++;
			count++;
		}
		minr++;
		if(count>=tne) break;
		for(i=minr;i<=maxr;i++){
			a[i][maxc]=x;
			x++;
			count++;
		}
		maxc--;
		if(count>=tne) break;
		for(j=maxc;j>=minc;j--){
			a[maxr][j]=x;
			x++;
			count++;
		}
		maxr--;
		if(count>=tne) break;
		for(i=maxr;i>=minr;i--){
			a[i][minc]=x;
			x++;
			count++;
		}
		minc++;
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%02d ",a[i][j]);
		}
		printf("\n");
	}
}