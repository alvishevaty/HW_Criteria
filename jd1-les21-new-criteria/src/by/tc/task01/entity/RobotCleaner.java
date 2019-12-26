package by.tc.task01.entity;

public class RobotCleaner implements Appliance{
	
	private int power;
	private String color;
	private int noiseLevel;
	private int batteryCapacity;
	private String name;
	
	public RobotCleaner() {}
	
	public RobotCleaner(String name, int power, String color, int noiseLevel, int batteryCapacity) {
		this.name = name;
		this.power = power;
		this.color = color;
		this.noiseLevel = noiseLevel;
		this.batteryCapacity = batteryCapacity;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoiseLevel() {
		return noiseLevel;
	}

	public void setNoiseLevel(int noiseLevel) {
		this.noiseLevel = noiseLevel;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
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
		result = prime * result + batteryCapacity;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + noiseLevel;
		result = prime * result + power;
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
		RobotCleaner other = (RobotCleaner) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (noiseLevel != other.noiseLevel)
			return false;
		if (power != other.power)
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
		return "RobotCleaner [POWER=" + power + ", COLOR=" + color + ", NOISE_LEVEL=" + noiseLevel
				+ ", BATTERY_CAPACITY=" + batteryCapacity + "]";
	}

}
