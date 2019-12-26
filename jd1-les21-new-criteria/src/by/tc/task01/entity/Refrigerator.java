package by.tc.task01.entity;

public class Refrigerator implements Appliance{
		
	private int usefullVolume;
	private int noiseLevel;
	private double weight;
	private double height;
	private double width;
	private double depth;
	private String name;
		
	public Refrigerator() {}
	
	public Refrigerator(String name, int usefullVolume, int noiseLevel, double weight, double height, double width, double depth) {
		this.name = name;
		this.usefullVolume = usefullVolume;
		this.noiseLevel = noiseLevel;
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public int getUsefullVolume() {
		return usefullVolume;
	}

	public void setUsefullVolume(int usefullVolume) {
		this.usefullVolume = usefullVolume;
	}

	public int getNoiseLevel() {
		return noiseLevel;
	}

	public void setNoiseLevel(int noiseLevel) {
		this.noiseLevel = noiseLevel;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(depth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + noiseLevel;
		result = prime * result + usefullVolume;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (noiseLevel != other.noiseLevel)
			return false;
		if (usefullVolume != other.usefullVolume)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [usefullVolume=" + usefullVolume + ", noiseLevel=" + noiseLevel + ", weight=" + weight
				+ ", height=" + height + ", width=" + width + ", depth=" + depth + ", name=" + name + "]";
	}	

}
