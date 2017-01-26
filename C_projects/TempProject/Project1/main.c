//by SerLonic 1/26/17
//print table of temperature

#include<stdio.h>
#include "function.h"

main() {
	int upper, lower, step;
	lower = 0; //lower border of temperature 
	upper = 200;//upper border of temperature
	step = 20; //step on table

	printTemp(lower, upper, step);
	system("pause");
	return 0;
}
