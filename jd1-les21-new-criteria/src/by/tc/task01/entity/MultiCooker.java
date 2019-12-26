package by.tc.task01.entity;

public class MultiCooker implements Appliance {

	private int power;
	private String color;
	private int bowlVolume;
	private String name;

	public MultiCooker() {}
	
	public MultiCooker(String name, int power, String color, int bowlVolume) {
		this.name = name;
		this.power = power;
		this.color = color;
		this.bowlVolume = bowlVolume;
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

	public int getBowlVolume() {
		return bowlVolume;
	}

	public void setBowlVolume(int bowlVolume) {
		this.bowlVolume = bowlVolume;
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
		result = prime * result + bowlVolume;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		MultiCooker other = (MultiCooker) obj;
		if (bowlVolume != other.bowlVolume)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
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
		return "MultiCooker [power=" + power + ", color=" + color + ", bowlVolume=" + bowlVolume + ", name=" + name
				+ "]";
	}

}
