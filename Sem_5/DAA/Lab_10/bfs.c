#include <stdio.h>

#define SIZE 8
#define V 8
int queue[SIZE];
int front = -1, rear = -1;

void enqueue(int element)
{
    if (rear >= SIZE - 1)
    {
        printf("Queue Overflow\n");
        return;
    }
    rear++;
    queue[rear] = element;
    if (front == -1)
    {
        front = 0;
    }
}
int dequeue()
{
    if (front == -1)
    {
        printf("Queue Underflow\n");
        return -1;
    }
    int temp = queue[front];
    if (front == rear)
    {
        front = rear = -1;
    }
    else
    {
        front++;
    }
    return temp;
}
int isEmpty()
{
    return front == -1;
}

void printQueue()
{
    if (front == -1)
    {
        printf("Queue is Empty\n");
        return;
    }
    int i;
    for (i = front; i <= rear; i++)
    {
        printf("%d ", queue[i]);
    }
}

void bfs(int graph[V][V])
{
    int visited[V] = {0};

    for (int i = 0; i < V; i++)
    {
        if (visited[i] == 0)
        {
            visited[i] = 1;
            enqueue(i);

            while (!isEmpty())
            {
                int u = dequeue();
                printf("%d ", u + 1);
                for (int i = 0; i < V; i++)
                {
                    if (visited[i] == 0 && graph[u][i] != 0)
                    {
                        visited[i] = 1;
                        enqueue(i);
                    }
                }
            }
            printf("\n");
        }
    }
}

void main()
{
    int graph[V][V] = {
        {0, 1, 1, 0, 0, 0, 0, 0},
        {1, 0, 1, 0, 1, 1, 0, 0},
        {1, 1, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 1, 1},
        {0, 1, 0, 0, 0, 1, 0, 0},
        {0, 1, 1, 0, 1, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 1},
        {0, 0, 0, 1, 0, 0, 1, 0}};
    bfs(graph);
}