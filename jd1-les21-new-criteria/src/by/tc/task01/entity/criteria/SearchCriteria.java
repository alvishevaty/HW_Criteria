package by.tc.task01.entity.criteria;

public final class SearchCriteria {
	
	public static enum RobotCleaner{
		POWER, COLOR, NOISE_LEVEL, BATTERY_CAPACITY
	}
	
	public static enum MultiCooker{
		POWER, COLOR, BOWL_VOLUME
	}
	
	public static enum Refrigerator{
		USEFULL_VOLUME, NOISE_LEVEL, WEIGHT, HEIGHT, WIDTH, DEPTH
	}
	
	public static enum Washer{
		MAXIMUM_LOAD, SPIN_SPEED, ENERGY_CLASS, NOISE_LEVEL, WATER_CONSUMPTION
	}
	
	public static enum Dishwasher{
		MAXIMUM_LOAD, ENERGY_CLASS, NOISE_LEVEL, WATER_CONSUMPTION	
	}
	
	private SearchCriteria() {}
}


