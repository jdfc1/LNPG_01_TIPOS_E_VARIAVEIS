#include <stdio.h>
#include <stdlib.h>

int main(){

    float n1, n2, n3, m;
    scanf ("%f %f %f", &n1, &n2, &n3);

    m = (n1 + n2 + n3)/3;

    if (m >= 7) {
        printf ("aprovado\n");
    }
    else if (m < 3) {
        printf ("reprovado\n");
    }
    else if ((m >= 3) || (m < 7)) {
        printf ("prova final\n");
    }
}
