#include <stdio.h>
#include <limits.h>

void main()
{
    int n;
    printf("Enter the no. of denominations: ");
    scanf("%d", &n);
    int d[n + 1];
    printf("Enter the denominations: ");
    for (int i = 1; i <= n; i++)
    {
        scanf("%d", &d[i]);
    }
    int amount;
    printf("Enter the amount: ");
    scanf("%d", &amount);
    int dp[n + 1][amount + 1];

    for (int i = 0; i <= n; i++)
    {
        dp[i][0] = 0;
    }
    for (int j = 1; j <= amount; j++)
    {
        dp[0][j] = INT_MAX - 1;
    }
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= amount; j++)
        {
            if (i == 1)
            {
                if (j >= d[1])
                {
                    dp[i][j] = 1 + dp[i][j - d[1]];
                }
                else
                {
                    dp[i][j] = INT_MAX - 1;
                }
            }
            else if (j < d[i])
            {
                dp[i][j] = dp[i - 1][j];
            }
            else
            {
                int include = 1 + dp[i][j - d[i]];
                int exclude = dp[i - 1][j];
                dp[i][j] = (include < exclude) ? include : exclude;
            }
        }
    }

    printf("DP Table:\n");
    for (int i = 0; i <= n; i++)
    {
        for (int j = 0; j <= amount; j++)
        {
            if (dp[i][j] == INT_MAX - 1)
                printf("INF\t ");
            else
                printf("%d\t ", dp[i][j]);
        }
        printf("\n");
    }
}