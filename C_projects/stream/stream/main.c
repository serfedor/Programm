//by SerLonic 1/31/17
//stream

#include <stdio.h>

main() {
	/*first version

	int c = getchar();//read symbol 
	while (c != EOF) {
		putchar(c);//print symbol
		c = getchar();//read symbol
	}
	*/
	//second version
	int c;
	while ((c = getchar()) != EOF)
		putchar(c);
	system("pause");
}