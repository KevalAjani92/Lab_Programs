#include<stdio.h>

void main(){
    char x;
    printf("Enter a Character:");
    scanf("%c",&x);
    (x>='A'&&x<='z'||x>='a'&&x<='z')?printf("Entered Character Is Alphabet"):printf("Entered Character Is Not Alphabet");
}