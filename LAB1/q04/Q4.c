#include <stdio.h>
#include <string.h>

int Fim (char entrada[]){
    if(entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M'){
        return 1;
    }
    else return 0;
}

int Maiuscula (char entrada[]){
    int contador = 0;
    for(int i = 0; i < strlen(entrada); i++){
        if(entrada[i] >= 'A' && entrada[i] <= 'Z'){
            contador++;
        }
    }
    if(Fim(entrada)){
        return 0;
    }
    printf("%i \n", contador);
    scanf("%[^\n]%*c", entrada);
    return Maiuscula(entrada);
}

int main (void) {
    char entrada[200];
    scanf("%[^\n]%*c", entrada);
    Maiuscula(entrada);
    return 0;
}
