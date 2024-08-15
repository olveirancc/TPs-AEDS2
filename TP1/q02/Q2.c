#include <stdio.h>
#include <string.h>


int Palindromo (char entrada[]){
    for(int i = 0; i <= strlen(entrada)/2; i++){
        if(entrada[i] != entrada[strlen(entrada) - i - 1]) return 0;
    }
    return 1;
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
        if(Palindromo(entrada)) printf("SIM\n");
        else printf("NAO\n");
        scanf("%[^\n]%*c", entrada);
    }
    return 0;
}
