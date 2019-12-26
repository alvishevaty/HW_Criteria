package by.tc.task01.entity;

public class Dishwasher implements Appliance {

	private int maximumLoad;
	private String energyClass;
	private int noiseLevel;
	private double waterConsumption;
	private String name;

	public Dishwasher() {
	}

	public Dishwasher(String name, int maximumLoad, String energyClass, int noiseLevel, double waterConsumption) {
		this.name = name;
		this.maximumLoad = maximumLoad;
		this.energyClass = energyClass;
		this.noiseLevel = noiseLevel;
		this.waterConsumption = waterConsumption;
	}

	public int getMaximumLoad() {
		return maximumLoad;
	}

	public void setMaximumLoad(int maximumLoad) {
		this.maximumLoad = maximumLoad;
	}

	public String getEnergyClass() {
		return energyClass;
	}

	public void setEnergyClass(String energyClass) {
		this.energyClass = energyClass;
	}

	public int getNoiseLevel() {
		return noiseLevel;
	}

	public void setNoiseLevel(int noiseLevel) {
		this.noiseLevel = noiseLevel;
	}

	public double getWaterConsumption() {
		return waterConsumption;
	}

	public void setWaterConsumption(double waterConsumption) {
		this.waterConsumption = waterConsumption;
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
		result = prime * result + ((energyClass == null) ? 0 : energyClass.hashCode());
		result = prime * result + maximumLoad;
		result = prime * result + noiseLevel;
		long temp;
		temp = Double.doubleToLongBits(waterConsumption);
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
		Dishwasher other = (Dishwasher) obj;
		if (energyClass == null) {
			if (other.energyClass != null)
				return false;
		} else if (!energyClass.equals(other.energyClass))
			return false;
		if (maximumLoad != other.maximumLoad)
			return false;
		if (noiseLevel != other.noiseLevel)
			return false;
		if (Double.doubleToLongBits(waterConsumption) != Double.doubleToLongBits(other.waterConsumption))
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
		return "Dishwasher [maximumLoad=" + maximumLoad + ", energyClass=" + energyClass + ", noiseLevel=" + noiseLevel
				+ ", waterConsumption=" + waterConsumption + ", name=" + name + "]";
	}

}
