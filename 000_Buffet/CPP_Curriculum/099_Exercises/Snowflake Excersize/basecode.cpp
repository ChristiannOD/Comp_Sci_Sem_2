// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char joe;
	int a=0;
	int b=2;
	int c=0;

	cout<<"Please enter a symbol for your snowflake"<<endl;

	cin >>joe;
	
	while(true){
		a=a+1;
		gotoxy(1,b+a);
		cout<<" "<<endl;
		cout<<joe<<endl;
		sleep(1);
		
		c = c +1;
	}
	
}
