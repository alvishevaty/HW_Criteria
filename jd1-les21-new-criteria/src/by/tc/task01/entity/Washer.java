package by.tc.task01.entity;

public class Washer implements Appliance {
	
	private int maximumLoad;
	private int spinSpeed;
	private String energyClass;
	private int noiseLevel;
	private int waterConsumption;
	private String name;

	public Washer() {}
	
	public Washer(String name, int maximumLoad, int spinSpeed, String energyClass, int noiseLevel, int waterConsumption) {
		this.name = name;
		this.maximumLoad = maximumLoad;
		this.spinSpeed = spinSpeed;
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

	public int getSpinSpeed() {
		return spinSpeed;
	}

	public void setSpinSpeed(int spinSpeed) {
		this.spinSpeed = spinSpeed;
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

	public int getWaterConsumption() {
		return waterConsumption;
	}

	public void setWaterConsumption(int waterConsumption) {
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
		result = prime * result + spinSpeed;
		result = prime * result + waterConsumption;
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
		Washer other = (Washer) obj;
		if (energyClass == null) {
			if (other.energyClass != null)
				return false;
		} else if (!energyClass.equals(other.energyClass))
			return false;
		if (maximumLoad != other.maximumLoad)
			return false;
		if (noiseLevel != other.noiseLevel)
			return false;
		if (spinSpeed != other.spinSpeed)
			return false;
		if (waterConsumption != other.waterConsumption)
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
		return "Washer [MAXIMUM_LOAD=" + maximumLoad + ", SPIN_SPEED=" + spinSpeed + ", ENERGY_CLASS=" + energyClass
				+ ", NOISE_LEVEL=" + noiseLevel + ", WATER_CONSUMPTION=" + waterConsumption + "]";
	}

}
