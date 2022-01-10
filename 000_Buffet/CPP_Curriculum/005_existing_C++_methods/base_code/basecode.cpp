// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char sym;
	char joe;
	int length;
	int i;
	cout << "Please enter a symbol: ";
	cin >> sym;
	cout << "Please enter line length: ";
	cin >> length;
	cout << "Horizontal, Vertical, or Diagnol? ";
	cin >> joe;
	if(joe=='h') {
		for( i = 0; i < length; i++) 
		cout << sym;
	}
	if(joe=='v') {
		for( i = 0; i < length; i++) {
		cout << sym <<endl;
	}
}
	if(joe==('d')){
		for( i=0; i < length; i++){
		gotoxy(5+i,6+i);
		cout<<sym<<endl;
		}	
	}
}
