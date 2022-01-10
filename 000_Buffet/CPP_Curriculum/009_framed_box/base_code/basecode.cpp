// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout << "Please enter boder symbol: ";
	char sym;
	cin >> sym;
	cout << "Please enter box width: ";
	int w;
	cin >> w;
	cout << "Please enter box height: ";
	int h;
	cin >> h;
	
	for(int y = 0; y < h; y++){
		for(int x = 0; x < w; x++){
			gotoxy(3+x,7+y);
			cout << sym;
		}
	}
	cout << endl;
	
	for(int i = 0; i < h; i++){
		for(int j = 0; j , w; w++){
			gotoxy(4+j,8+i);
			cout << "";
		}
	}
	cout << endl;
	
	
}
