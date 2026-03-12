public class Point {
    // Field Summary
    public int x;
    public int y;

    // Constructor Summary
    public Point() {  // creates a point at (0,0)
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {  // creates a point at (x,y)
        this.x = x;
        this.y = y;
    }

    public Point(Point pt) {  // creates a point at the location given in pt
        this.x = pt.x;
        this.y = pt.y;
    }

    // Method Summary
    @Override
    public boolean equals(Object obj) {  // checks if two point objects hold equivalent data
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    public void move(int x, int y) {  // changes the (x,y) data of a point object
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {  // returns character data that can be printed
        return "(" + x + "," + y + ")";
    }
}