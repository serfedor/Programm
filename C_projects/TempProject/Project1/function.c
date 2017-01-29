//by SerLonic 1/26/17

#include "function.h"
#include<stdio.h>

int printTemp(int lower, int upper, int step)
{
	int fahr;
	for (fahr = lower; fahr <= upper; fahr += step) {
		printf("%5.2f\t%5d\n", (5.0/9.0)*(fahr-32), fahr);
	}
	return 0;
}
