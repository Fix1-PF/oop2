package oop4;

public class Painting {

	PaintTool tool;
	void grab(PaintTool tool) {
		this.tool = tool;
	}
	
	void letPaint() {
		tool.paint();
	}
}
