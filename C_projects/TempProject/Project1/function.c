//by SerLonic 1/26/17

#include "function.h"
#include<stdio.h>

int printTemp(int lower, int upper, int step)
{
	int fahr, celsius;
	fahr = lower;
	while (fahr <= upper) {
		celsius = 5 * (fahr - 32) / 9;
		printf("%d\t%d\n", celsius, fahr);
		fahr += step;
	}
	return 0;
}
