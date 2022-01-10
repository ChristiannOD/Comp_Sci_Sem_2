// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char joe;
	int w;
	int h;
	int x;
	int y;
	
	cout<<"Please enter border symbol: ";
	cin>> joe;
	cout<<"Please enter box width: ";
	cin>>w;
	cout <<"Please enter box height: ";
	cin >> h;
	cout << "Please enter x coordinate: ";
	cin >> x;
	cout <<"Please enter y coordinate: ";
	cin >> y;
	
	for(int i = 0; i < h; i++){
		for(int j = 0; j < w; j++){
			gotoxy(x+j,y+i);
			cout << joe;
		}
		cout << endl;
	}

}
