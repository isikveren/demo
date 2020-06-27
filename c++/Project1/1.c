#include<stdio.h>

int Sum(int n);

int main() {
	int n = 100;
	n = Sum(n);
	printf("%d", n);
	printf("hello World!");
}

int Sum(int n) {
	if (n == 1)	return 1;
	else
		return n + Sum(n - 1);
	
}