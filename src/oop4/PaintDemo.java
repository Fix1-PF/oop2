package oop4;

public class PaintDemo {

	public static void main(String[] args) {
		PaintTool t1 = new PaintTool();
		PaintTool t2 = new Pen();
		PaintTool t3 = new Brush();
		
		Painting paint = new Painting();
		
		paint.grab(t1);
		paint.letPaint();
		
		paint.grab(t2);
		paint.letPaint();
		
		paint.grab(t3);
		paint.letPaint();
	}
}
