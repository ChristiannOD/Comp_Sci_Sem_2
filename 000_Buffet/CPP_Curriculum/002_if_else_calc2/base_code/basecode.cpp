// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int num1;
	int num2;
	int num3;
	char joe;
	cout << "Enter first number: ";
	cin >> num1;
	cout << "Enter second number: ";
	cin >> num2;
	cout << "Enter operation symbol: ";
	cin >> joe;
	if(joe == ('+')){
		cout << num1 + num2;
	}
	if(joe == ('-')){
		cout << num1 - num2;
	}
	if(joe == ('*')){
		cout << num1 * num2;
	}
	if(joe == ('/')){
		cout << num1/num2;
	}
	if(joe == ('%')){
		cout << num1%num2;
	}
}
