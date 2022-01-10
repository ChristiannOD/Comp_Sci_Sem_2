// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char joe;
	int sam;
	int dave;
	cout << "Please choose a symbol: ";
	cin>> joe;
	cout<< "Please enter box width: ";
	cin>> sam;
	cout<< "Please enter box height: ";
	cin>>dave;
	
	for( int g = 0; g < 10; g++)
	{
		for( int i = 0; i < 10; i++){
			gotoxy(5+i,6+i);
			cout<<joe;
		}
	}
	
}
	

