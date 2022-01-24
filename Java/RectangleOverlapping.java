/**
Given two rectangles, find if the given two rectangles overlap or not.
Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates. 
l1: Top Left coordinate of first rectangle. 
r1: Bottom Right coordinate of first rectangle. 
l2: Top Left coordinate of second rectangle. 
r2: Bottom Right coordinate of second rectangle.
 */

public class RectangleOverlapping{

    static class Point{
        int x, y;
    }
    public static void main(String[] args) {
        Point l1 = new Point(), r1 = new Point(), l2 = new Point(), r2 = new Point();
        l1.x=0;l1.y=10; r1.x=10;r1.y=0;
        l2.x=5;l2.y=5; r2.x=15;r2.y=0;

        if(isOverlapped(l1, r1, l2, r2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    static boolean isOverlapped(Point l1, Point r1, Point l2, Point r2) {
        if (l1.x == r1.x || l1.y == r1.y || l2.x == r2.x || l2.y == r2.y) {
                return false;
            }
        if(l1.x >= r2.x || l2.x>= r1.x){
            return false;
        }
        if(r1.y >= l2.y || r2.y >= l1.y ){
            return false;
        }
        return true;
    }
} 