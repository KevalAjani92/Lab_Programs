#include<stdio.h>
#include<stdlib.h>

#define SIZE 100
int stk[SIZE];
int top = -1;

void push(int element){
    if(top>=SIZE-1){
        printf("Stack Overflow\n");
        return;
    }
    top++;
    stk[top] = element;
}

int pop(){
    if(top == -1){
        printf("Stack Underflow\n");
        return -1;
    }
    top--;
    return stk[top+1];
}

int peep(int i){
    if(top-i+1 < 0){
        printf("Underflow\n");
        return -1;
    }
    return stk[top-i+1];
}
int peek(){
    if(top == -1){
        printf("Stack Underflow\n");
        return -1;
    }
    return stk[top];
}
void change(int element,int i){
    if(top-i+1 < 0){
        printf("Underflow\n");
        return;
    }
    stk[top-i+1] = element;
}
void printStack(){
    if(top == -1){
        printf("Stack is Empty\n");
        return;
    }
    int i;
    for(i=top;i>=0;i--){
        printf("%d\n",stk[i]);
    }
}

void main(){
    push(3);
    push(4);
    push(2);
    push(1);
    // printf("Peep - %d\n",peep(5));
    printStack();
}