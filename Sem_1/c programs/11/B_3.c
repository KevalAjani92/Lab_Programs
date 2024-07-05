 #include<stdio.h>

void main(){
	char x,y;
	for(x='A';x>='A' && x<='Z';x++){
		printf("%c=%d\n",x,x);
	}
	for(y='a';y>='a' && y<='z';y++){
		printf("%c=%d\n",y,y);
	}
}
