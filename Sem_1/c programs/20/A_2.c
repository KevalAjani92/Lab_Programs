#include<stdio.h>
struct book
{
    char title[30];
    char author[30];
    char publication[30];
    int price;
};
void main(){
    struct book b[3];

    for(int i=0;i<3;i++){
        printf("\nEnter Detail For Book %d\n",i+1);
        printf("Enter Title:");
        scanf("%s",b[i].title);
        printf("Enter Author Name:");
        scanf(" %s",b[i].author);
        printf("Enter Publication Name:");
        scanf(" %s",b[i].publication);
        printf("Enter Price:");
        scanf("%d",&b[i].price);
    }
    for (int i = 0; i < 3; i++)
    {
        printf("\n\nDetail Of Book %d\n\n",i+1);
        printf("Title:%s\n",b[i].title);
        printf("Author Name:%s\n",b[i].author);
        printf("Publication Name:%s\n",b[i].publication);
        printf("Price:%d",b[i].price);
    }
    
}