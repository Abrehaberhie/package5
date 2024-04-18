package homeWork4_15_24;

public class Light extends Product {
	private int watts;
    private int lumens;
	    public int getWatts() {
		return watts;
	}

	public void setWatts(int watts) {
		this.watts = watts;
	}

	public int getLumens() {
		return lumens;
	}

	public void setLumens(int lumens) {
		this.lumens = lumens;
	}

		

	    // Constructor
	    public Light(int id, String name, double price, int rating, int watts, int lumens) {
	        super(id, name, price, rating);
	        this.watts = watts;
	        this.lumens = lumens;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return super.toString() + ", watts: " + watts + ", lumens: " + lumens;
	    }

	    // Override equals method
	    @Override
	    public boolean equals(Object obj) {
	        if (!(obj instanceof Light)) return false;
	        Light other = (Light) obj;
	        return this.id == other.id && this.watts == other.watts && this.lumens == other.lumens;
	    }

	    // Other methods specific to Light
	    public void checkPowerUtil() {
	        // Implementation
	    }

		@Override
		public void checkTotalSales() {
			// TODO Auto-generated method stub
			
		}
	}



