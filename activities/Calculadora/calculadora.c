#include <stdio.h>
#include <stdlib.h>

int soma(int a, int b) {
    return a + b;
}

int subtracao(int a, int b) {
    if (a >= b)
        return a - b;
    else
        return b - a;
}

int multiplicacao(int a, int b) {
    return a * b;
}

float divisao(float a, float b) {
    if (a >= b)
        return a / b;
    else
        return b / a;
}

int main() {

    int a,b;

    printf("Didite o primeiro número: ");
    scanf ("%d", &a);
    
    printf("Didite o segundo número: ");
    scanf ("%d", &b);

    printf("Soma: %d \n",soma(a,b));
    printf("Subtração: %d \n",subtracao(a,b));
    printf("Multiplicação: %d \n",multiplicacao(a,b));
    printf("Divisão : %1.1f \n",divisao(a,b));

}