#include <stdio.h>
#include <string.h>

int Palindromo(char entrada[])
{
    int tam = strlen(entrada);
    for (int i = 0; i < tam / 2; i++)
    {
        if (entrada[i] != entrada[tam - i - 1])
            return 0;
    }
    return 1;
}

int Fim(char entrada[])
{
    if (entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M')
    {
        return 0;
    }
    else
        return 1;
}

int main(void)
{
    char entrada[500];
    scanf("%[^\n]%*c", entrada);
    while (Fim(entrada))
    {
        if (Palindromo(entrada))
        {
            printf("SIM\n");
        }
        else printf("NAO\n");
        scanf("%[^\n]%*c", entrada);
    }
    return 0;
}
