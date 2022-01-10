// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	char sym;
	int l;
	int x;
	int y;
	
	cout << "Please choose a symbol: ";
	cin >> sym;
	cout << "Please enter the line length: ";
	cin >> l;
	cout << "Please enter line x coordinate: ";
	cin >> x;
	cout << "Please enter line y coordinate: ";
	cin >> y;
	
	for(int i = 0; i < l; i++){
			gotoxy(x+i,y);
			cout << sym;
		}
	
}
