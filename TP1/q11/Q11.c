#include <stdio.h>
#include <string.h>

int Fim(char entrada[])
{
    if (entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M')
    {
        return 1;
    }
    else
        return 0;
}

void Palindromo(char entrada[])
{
    if (Fim(entrada))
    {
        return;
    }
    
    int tam = strlen(entrada);
    int palindromo = 1; 
    for (int i = 0; i < tam / 2; i++)
    {
        if (entrada[i] != entrada[tam - i - 1])
        {
            palindromo = 0; 
        }
    }
    
    if (palindromo)
        printf("SIM\n");
    else
        printf("NAO\n");
    scanf(" %[^\r\n]", entrada);
    Palindromo(entrada);
}

int main(void)
{
    char entrada[500];
    scanf("%[^\r\n]", entrada);
    Palindromo(entrada);
    return 0;
}
