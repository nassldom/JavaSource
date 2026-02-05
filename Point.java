java.awt
Class Point

// Field Summary

int x;
int y;

// Constructor Summary

Point();			// creates a point at (0,0)
Point(int x, int y);		// creates a point at (x,y)
Point(Point pt);		// creates a point at the location given in pt

// Method Summary

boolean equals(Object obj);	// checks if two point objects hold equivalent data
void move(int x, int y);	// changes the (x,y) data of a point object
String toString();		// returns character data that can be printed