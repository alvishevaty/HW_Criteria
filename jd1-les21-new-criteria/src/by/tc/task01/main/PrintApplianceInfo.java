package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Dishwasher;
import by.tc.task01.entity.MultiCooker;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.RobotCleaner;
import by.tc.task01.entity.Washer;

public class PrintApplianceInfo {

	public static void print(List<Appliance> applianceList) {
		
		if (applianceList.size() != 0) {
			for (Appliance appliance : applianceList) {

				switch (appliance.getClass().getSimpleName().toUpperCase()) {

				case ("DISHWASHER"): {
					Dishwasher dishwasher = (Dishwasher) appliance;
					System.out.println("• " + dishwasher.getClass().getSimpleName() + ":");
					System.out.printf("\t♦	%-20s/%-10s%n", "MAXIMUM_LOAD", dishwasher.getMaximumLoad());
					System.out.printf("\t♦	%-20s/%-10s%n", "ENERGY_CLASS", dishwasher.getEnergyClass());
					System.out.printf("\t♦	%-20s/%-10s%n", "NOISE_LEVEL", dishwasher.getNoiseLevel());
					System.out.printf("\t♦	%-20s/%-10s%n%n", "WATER_CONSUMPTION", dishwasher.getWaterConsumption());
					break;
				}

				case ("MULTICOOKER"): {
					MultiCooker multiCooker = (MultiCooker) appliance;
					System.out.println("• " + multiCooker.getClass().getSimpleName() + ":");
					System.out.printf("\t♦	%-20s/%-10s%n", "POWER", multiCooker.getPower());
					System.out.printf("\t♦	%-20s/%-10s%n", "COLOR", multiCooker.getColor());
					System.out.printf("\t♦	%-20s/%-10s%n%n", "BOWL_VOLUME", multiCooker.getBowlVolume());
					break;
				}

				case ("REFRIGERATOR"): {
					Refrigerator refrigerator = (Refrigerator) appliance;
					System.out.println("• " + refrigerator.getClass().getSimpleName() + ":");
					System.out.printf("\t♦	%-20s/%-10s%n", "USEFULL_VOLUME", refrigerator.getUsefullVolume());
					System.out.printf("\t♦	%-20s/%-10s%n", "NOISE_LEVEL", refrigerator.getNoiseLevel());
					System.out.printf("\t♦	%-20s/%-10s%n", "WEIGHT", refrigerator.getWeight());
					System.out.printf("\t♦	%-20s/%-10s%n", "HEIGHT", refrigerator.getHeight());
					System.out.printf("\t♦	%-20s/%-10s%n", "WIDTH", refrigerator.getWidth());
					System.out.printf("\t♦	%-20s/%-10s%n%n", "DEPTH", refrigerator.getDepth());
					break;
				}

				case ("ROBOTCLEANER"): {
					RobotCleaner robotCleaner = (RobotCleaner) appliance;
					System.out.println("• " + robotCleaner.getClass().getSimpleName() + ":");
					System.out.printf("\t♦	%-20s/%-10s%n", "BATTERY_CAPACITY", robotCleaner.getBatteryCapacity());
					System.out.printf("\t♦	%-20s/%-10s%n", "COLOR", robotCleaner.getColor());
					System.out.printf("\t♦	%-20s/%-10s%n", "NOISE_LEVEL", robotCleaner.getNoiseLevel());
					System.out.printf("\t♦	%-20s/%-10s%n%n", "POWER", robotCleaner.getPower());
					break;
				}

				case ("WASHER"): {
					Washer washer = (Washer) appliance;
					System.out.println("• " + washer.getClass().getSimpleName() + ":");
					System.out.printf("\t♦	%-20s/%-10s%n", "MAXIMUM_LOAD", washer.getMaximumLoad());
					System.out.printf("\t♦	%-20s/%-10s%n", "SPIN_SPEED", washer.getSpinSpeed());
					System.out.printf("\t♦	%-20s/%-10s%n", "ENERGY_CLASS", washer.getEnergyClass());
					System.out.printf("\t♦	%-20s/%-10s%n", "NOISE_LEVEL", washer.getNoiseLevel());
					System.out.printf("\t♦	%-20s/%-10s%n%n", "WATER_CONSUMPTION", washer.getWaterConsumption());
					break;
				}

				default:
					System.out.println("• No such " + appliance.getClass().getSimpleName() + " in the list.\n");
				}
			}
		} else {
			System.out.println("• No such appliances in the list. Change your parameters.\n");
		}
	}
}
