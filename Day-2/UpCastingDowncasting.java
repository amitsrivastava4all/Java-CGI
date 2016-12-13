
abstract  class Shape{
	void draw(){
		System.out.println("Generic Shape Draw Call");
	}
	void rotate(){
		System.out.println("Generic Shape Rotate Call");
	}
	abstract  void fillColor();
}
class Circle extends Shape
{
	@Override
	void draw(){
		System.out.println("Circle Shape Draw Call");
	}

	@Override
	void fillColor() {
		// TODO Auto-generated method stub
		
	}
}
class Square extends Shape{
	@Override
	void draw(){
		System.out.println("Square Shape Draw Call");
	}
	void allSideEquals(){
		System.out.println("Square All Side Equals Call");
	}
	@Override
	void fillColor() {
		// TODO Auto-generated method stub
		
	}
}
class Triangle extends Shape{
	@Override
	void draw(){
		System.out.println("Triangle Shape Draw Call");
	}
	void threeSides(){
		System.out.println("Three Sides ");
	}
	@Override
	void fillColor() {
		// TODO Auto-generated method stub
		
	}
}
class Drawing{
	static void drawShape(Shape shape){
		//Shape shape =new Square();
		shape.draw();
		shape.rotate();
		if(shape instanceof Square){
			Square square = (Square)shape; //Downcasting
			square.allSideEquals();
		}
		else
			if(shape instanceof Triangle){
				((Triangle)shape).threeSides();
				//Square square = (Square)shape; //Downcasting
				//square.allSideEquals();
			}
	}
}

public class UpCastingDowncasting {

	public static void main(String[] args) {
		//Drawing.drawShape(new Shape());
		Drawing.drawShape(new Square());
		Drawing.drawShape(new Triangle());
		Drawing.drawShape(new Circle());
		// TODO Auto-generated method stub
//		Shape shape =new Square();
//		shape.draw();
//		shape.rotate();
//		
//		shape = new Triangle();
//		shape.draw();
//		shape.rotate();
		
		//shape.allSideEquals();
//		Square square = new Square();
//		square.draw();
//		square.allSideEquals();
//		Triangle tr = new Triangle();
//		tr.draw();
//		tr.threeSides();
//		
//		Circle cr =new Circle();
//		cr.draw();
	}

}
