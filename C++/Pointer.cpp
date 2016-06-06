#include <stdio.h>
#include <cmath>


void update(int *a,int *b) {

    int tmpA = *a;
    *a = *a + *b;
    *b = fabs(tmpA - *b);
    
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
