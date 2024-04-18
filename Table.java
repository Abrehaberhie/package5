package homeWork4_15_24;

public class Table extends Product {
	private double height;
    private double width;
    private double length;
		    public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

		

		    // Constructor
		    public Table(int id, String name, double price, int rating, double height, double width, double length) {
		        super(id, name, price, rating);
		        this.height = height;
		        this.width = width;
		        this.length = length;
		    }

		    // Override toString method
		    @Override
		    public String toString() {
		        return super.toString() + ", height: " + height + ", width: " + width + ", length: " + length;
		    }

		    // Override equals method
		    @Override
		    public boolean equals(Object obj) {
		        if (!(obj instanceof Table)) return false;
		       Table other = (Table) obj;
		        return this.id == other.id && this.height == other.height && this.width == other.width && this.length == other.length;
		    }

		    // Other methods specific to Table
		    public double area() {
		        return width * length;
		    }

		    public double volume() {
		        return width * length * height;
		    }

			@Override
			public void checkTotalSales() {
				// TODO Auto-generated method stub
				
			}

}
