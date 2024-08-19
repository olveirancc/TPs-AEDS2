#include <stdio.h>
#include <string.h>

void combinar(char entrada[], char entrada2[]) {
    int tam1 = strlen(entrada);
    int tam2 = strlen(entrada2);
    char saida[tam1 + tam2 + 1];
    int i = 0, j = 0, z = 0;
    while (i < tam1 && j < tam2) {
        saida[z++] = entrada[i++];
        saida[z++] = entrada2[j++];
    }
    while (i < tam1) {
        saida[z++] = entrada[i++];
    }
    while (j < tam2) {
        saida[z++] = entrada2[j++];
    }
    saida[z] = '\0';
    printf("%s\n", saida);
}

int main(void)
{
    char entrada[100];
    char entrada2[100];
    while (scanf(" %s %s", entrada, entrada2) == 2)
    {
        combinar(entrada, entrada2);
    }
    return 0;
}