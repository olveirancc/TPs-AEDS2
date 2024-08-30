#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool isInteiro(double numero) {
    return numero == (int)numero;
}

void readFileAndWrite(char* filename, int n) {
    double num = 0.0;
    FILE* arquivo = fopen(filename, "rb");
    fseek(arquivo, 0, SEEK_END);
    double fileSize = ftell(arquivo);
    rewind(arquivo);
    for (int i = 0; i < n; i++) {
        fseek(arquivo, fileSize - (i + 1) * sizeof(double), SEEK_SET);
        fread(&num, sizeof(double), 1, arquivo);

        if (isInteiro(num)) {
            printf("%d\n", (int)num);
        } else {
            printf("%g\n", num);
        }
    }
    fclose(arquivo);
}

int main(int argc, char* argv[]) {
    int n;
    double num;
    FILE* arquivo = fopen("Q9.bin", "wb");

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%lf", &num);
        fwrite(&num, sizeof(double), 1, arquivo);
    }
    fclose(arquivo);
    readFileAndWrite("Q9.bin", n);
    return 0;
}