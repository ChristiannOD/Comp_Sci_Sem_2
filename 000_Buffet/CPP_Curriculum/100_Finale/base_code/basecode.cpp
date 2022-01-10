// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here

	
	cout << "Please choose box symbol: ";
	char sym;
	cin >> sym;
	
	cout << "Please choose box height: ";
	int h;
	cin >> h;
	
	cout << "Please choose box width: ";
	int w;
	cin >> w;
	
	
	for(int y = 0; y < 5; y++){
		for(int x = 0; x < 6; x++){
			gotoxy(5+x,8+y);
			cout << sym;
		}
	}
	
	for(int y = 0; y < 3; y++){
		for(int x = 0; x < 4; x++){
			gotoxy(6+x,9+y);
			cout << " ";
		}
	}

	gotoxy(7,7);
	cout << "<>";

}

