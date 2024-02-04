#include <stdio.h>
#include <stdlib.h>

int main() {

    float celcius;

    printf("Digite em graus Celsius para conversão: ");
    scanf ("%f", &celcius);

    float calculo = (celcius * 1.8) + 32;

    printf ("%.1fº Celsius é igual a %1.2f em Graus Fahrenheit\n", celcius, calculo);

}