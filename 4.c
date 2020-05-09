#include<stdio.h>

int main()
{
    char f[3][8] = {
        "English",
        "Chinese",
        "British"
    };
    for(int i = 0;i< 3;i++)
    {   for(int j = 0;j<8;j++)
        {putchar(f[i][j]);
           if(f[i][j] == '\0')
             putchar('\n');
        }
    }

    const char *f2[3] = {
        "English",
        "Chinese",
        "British"
    };
    for(int i = 0;i< 3;i++)
    {   for(int j = 0;j<8;j++)
        {
            putchar(*(f2[i]++) );
            if(*(f2[i]-1) == '\0')
            putchar('\n');
        }
    }

    return 0;
}