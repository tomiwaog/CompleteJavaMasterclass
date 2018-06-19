package composition;

public class Dimensions {
	private int width, height, depth;

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getDepth() {
		return depth;
	}

	public Dimensions(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
