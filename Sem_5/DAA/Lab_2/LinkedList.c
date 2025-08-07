#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node* next;
} *head = NULL;

void insertLast(int element){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode ->data = element;
    newNode ->next = NULL;

    if(head == NULL){
        head = newNode;
        return;
    }
    struct Node* temp = head;
    while(temp->next != NULL){
        temp = temp ->next;
    }
    temp->next = newNode;
}

void deleteLast(){
    if(head == NULL){
        printf("LinkedList is Empty\n");
        return;
    }
    if(head->next == NULL){
        head = NULL;
        return;
    }
    struct Node* prev = NULL;
    struct Node* save = head;

    while (save->next != NULL)
    {
        prev = save;
        save = save ->next;
    }
    prev->next = NULL;
    free(save);
}

void printLL(){
    if(head == NULL){
        printf("LinkedList is Empty\n");
        return;
    }
    struct Node* save = head;
    while (save != NULL)
    {
        printf("%d",save->data);
        if(save->next != NULL)
            printf(" -> ");
        save = save->next;
    }
    
}

void main(){
    insertLast(1);
    insertLast(2);
    insertLast(3);
    insertLast(4);
    insertLast(5);
    printLL();
}