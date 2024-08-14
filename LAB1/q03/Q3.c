#include <stdio.h>
#include <string.h>


int Maiuscula (char entrada[]){
    int contador = 0;
    for(int i = 0; i < strlen(entrada); i++){
        if(entrada[i] >= 'A' && entrada[i] <= 'Z'){
            contador++;
        }
    }
    return contador;
}

int Fim (char entrada[]){
    if(entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M'){
        return 1;
    }
    else return 0;
}

int main (void) {
    char entrada[200];
    scanf("%[^\n]%*c", entrada);
    while(!(Fim(entrada))){
        printf("%i \n", Maiuscula(entrada));
        scanf("%[^\n]%*c", entrada);
    }
    return 0;
}
