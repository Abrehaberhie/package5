package homeWork4_15_24;

public abstract class Product {
	protected int id;
    protected String name;
    protected double price;
    protected int rating;
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	

	    // Constructor
	    public Product(int id, String name, double price, int rating) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.rating = rating;
	    }

	    // Normal method
	    public  void checkTotalSales() {
	    	
	    }

	    

	    // Override toString method
	    @Override
	    public String toString() {
	        return "id: " + id + ", name: " + name + ", price: " + price + ", rating: " + rating;
	    }

	    // Override equals method
	    @Override
	    public abstract boolean equals(Object obj);
	}

	

	
	

	
	
	


