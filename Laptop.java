package homeWork4_15_24;

public class Laptop extends Product {
	    private double screenSize;
	    private int RAM;
	    private int SSD;
	    private String processor;
	    // Other methods specific to Laptop
	    public void checkCharging() {
	        // Implementation
	    }

	    public void checkLogin() {
	        // Implementation
	    }

		@Override
		public void checkTotalSales() {
			// TODO Auto-generated method stub
			
		}
	    public double getScreenSize() {
			return screenSize;
		}

		public void setScreenSize(double screenSize) {
			this.screenSize = screenSize;
		}

		public int getRAM() {
			return RAM;
		}

		public void setRAM(int rAM) {
			RAM = rAM;
		}

		public int getSSD() {
			return SSD;
		}

		public void setSSD(int sSD) {
			SSD = sSD;
		}

		public String getProcessor() {
			return processor;
		}

		public void setProcessor(String processor) {
			this.processor = processor;
		}

		

	    // Constructor
	    public Laptop(int id, String name, double price, int rating, double screenSize, int RAM, int SSD, String processor) {
	        super(id, name, price, rating);
	        this.screenSize = screenSize;
	        this.RAM = RAM;
	        this.SSD = SSD;
	        this.processor = processor;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return super.toString() + ", screenSize: " + screenSize + ", RAM: " + RAM + ", SSD: " + SSD + ", processor: " + processor;
	    }

	    // Override equals method
	    @Override
	    public boolean equals(Object obj) {
	        if (!(obj instanceof Laptop)) return false;
	        Laptop other = (Laptop) obj;
	        return this.id == other.id && this.RAM == other.RAM && this.SSD == other.SSD && this.processor.equals(other.processor);
	    }

	 
	}



