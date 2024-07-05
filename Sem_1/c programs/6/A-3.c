#include<stdio.h>

void main()
{
     char x;
     printf("Enter Your Character:");
     scanf("%c",&x);
     if (x>='A' && x<='Z')
     {
          printf("Entered Character In Uppercase");
     }
     else if (x>='a' && x<='z')
     {
          printf("Entered Character In Lowercase");
     }
     else if (x>='0' && x<='9')
     {
          printf("Entered Character Is Digit");
     }
     else printf("Entered Character Is Special Character");
}