// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	int c = 5;
	int x = 25;
	
	while(true) {
		cout << c  <<endl;
		if(c==x){
			break;
		}
		c = c + 1;
	}
	cout<<endl;
	int z = 15;
	while(true){
		cout << z <<endl;
		if(z==5){
			break;
		}
		z = z - 1;
	}
	
	cout<<endl;
	
	for(int i = 5; i <= 25; i = i + 1){
		cout << i << endl;
	}
	
	cout<<endl;
	for(int d = 15; d >=5; d = d - 1){
		cout << d << endl;
	}
}
