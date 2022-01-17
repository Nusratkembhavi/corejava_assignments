package assig2_5;

public abstract class Shape 
{
	public abstract void draw();
	

 static class Rectangle extends Shape
{
@Override
public void draw()
 {
   System.out.println("shapes of rectangle is drawn");
 }
}
 
static class Cube extends Shape
 {
	 @Override
	 public void draw() 
	 {
	 System.out.println("shapes of cube is drawn");
	 }
 }
static class Line extends Shape
 {
	 @Override
	 public void draw() 
	 {
	 System.out.println("shapes of line is drawn");
	 }
 }
 
 public static void main(String[] args)
 {
	 Rectangle r = new Rectangle();
	 Cube c = new Cube();
	 Line l = new Line();

	 r.draw();
	 c.draw();
	 l.draw();
	 }
 }
