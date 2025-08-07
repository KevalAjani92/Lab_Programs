#include<stdio.h>

#define SIZE 100
int queue[SIZE];
int front = -1,rear = -1;

void enqueue(int element){
    if(rear >= SIZE-1){
        printf("Queue Overflow\n");
        return;
    }
    rear++;
    queue[rear] = element;
    if(front == -1){
        front = 0;
    }
}
int dequeue(){
    if(front == -1){
        printf("Queue Underflow\n");
        return -1;
    }
    int temp = queue[front];
    if(front == rear){
        front = rear = -1;
    }else{
        front++;
    }
    return temp;
}
void printQueue(){
    if(front == -1){
        printf("Queue is Empty\n");
        return;
    }
    int i;
    for(i=front;i<=rear;i++){
        printf("%d ",queue[i]);
    }
}
void main(){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    dequeue();
    printQueue();
}