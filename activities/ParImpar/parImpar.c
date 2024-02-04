#include <stdio.h>
#include <stdlib.h>

int parImpar(int a) {
    if (a % 2 == 0)
        return 0;
}

int main() {

    int a,b;

    printf("Digite o número para verificar se é par ou impar: ");
    scanf ("%d", &a);

    if (parImpar(a) == 0) 
        printf("O número: %d é par \n",a);
    else
        printf("O número: %d é impar \n",a);

}