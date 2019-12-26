package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Dishwasher;
import by.tc.task01.entity.MultiCooker;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.RobotCleaner;
import by.tc.task01.entity.Washer;

public class AppliancesFactory {

	public List<Appliance> create(List<String> strAppliancesData) {

		List<Appliance> results = new ArrayList<Appliance>();

		for (String data : strAppliancesData) {
			results.add(create(data));
		}

		return results;

	}

	private Appliance create(String data) {
		String regex = " \\: ";
		String[] applianceData = data.split(regex);

		switch (applianceData[0].toUpperCase()) {
		case "DISHWASHER":
			return createDishwasher(applianceData);
		case "MULTICOOKER":
			return createMultiCooker(applianceData);
		case "REFRIGERATOR":
			return createRefrigerator(applianceData);
		case "ROBOTCLEANER":
			return createRobotCleaner(applianceData);
		case "WASHER":
			return createWasher(applianceData);
		default:
			return null;
		}
	}

	private Appliance createDishwasher(String[] data) {
		Dishwasher dishwasher = new Dishwasher();
		String parametersStr = data[1];
		String regex = "\\, ";
		String[] parametersList = parametersStr.split(regex);

		String[] parameters;
		regex = "\\=";
		for (int i = 0; i < parametersList.length; i++) {
			parameters = parametersList[i].split(regex);
			switch (parameters[0].toUpperCase()) {
			case "MAXIMUM_LOAD":
				dishwasher.setMaximumLoad(Integer.parseInt(parameters[1]));
				break;
			case "ENERGY_CLASS":
				dishwasher.setEnergyClass(parameters[1]);
				break;
			case "NOISE_LEVEL":
				dishwasher.setNoiseLevel(Integer.parseInt(parameters[1]));
				break;
			case "WATER_CONSUMPTION":
				dishwasher.setWaterConsumption(Double.parseDouble(parameters[1]));
				break;
			}
		}
		return dishwasher;
	}

	private Appliance createMultiCooker(String[] data) {
		MultiCooker multiCooker = new MultiCooker();
		String parametersStr = data[1];
		String regex = "\\, ";
		String[] parametersList = parametersStr.split(regex);

		String[] parameters;
		regex = "\\=";
		for (int i = 0; i < parametersList.length; i++) {
			parameters = parametersList[i].split(regex);
			switch (parameters[0].toUpperCase()) {
			case "POWER":
				multiCooker.setPower(Integer.parseInt(parameters[1]));
				break;
			case "COLOR":
				multiCooker.setColor(parameters[1]);
				break;
			case "BOWL_VOLUME":
				multiCooker.setBowlVolume(Integer.parseInt(parameters[1]));
				break;
			}
		}
		return multiCooker;
	}

	private Appliance createRefrigerator(String[] data) {
		Refrigerator refrigerator = new Refrigerator();
		String parametersStr = data[1];
		String regex = "\\, ";
		String[] parametersList = parametersStr.split(regex);

		String[] parameters;
		regex = "\\=";
		for (int i = 0; i < parametersList.length; i++) {
			parameters = parametersList[i].split(regex);
			switch (parameters[0].toUpperCase()) {
			case "USEFULL_VOLUME":
				refrigerator.setUsefullVolume(Integer.parseInt(parameters[1]));
				break;
			case "NOISE_LEVEL":
				refrigerator.setNoiseLevel(Integer.parseInt(parameters[1]));
				break;
			case "WEIGHT":
				refrigerator.setWeight(Double.parseDouble(parameters[1]));
				break;
			case "HEIGHT":
				refrigerator.setHeight(Double.parseDouble(parameters[1]));
				break;
			case "WIDTH":
				refrigerator.setWidth(Double.parseDouble(parameters[1]));
				break;
			case "DEPTH":
				refrigerator.setDepth(Double.parseDouble(parameters[1]));
				break;
			}
		}
		return refrigerator;
	}

	private Appliance createRobotCleaner(String[] data) {
		RobotCleaner robotCleaner = new RobotCleaner();
		String parametersStr = data[1];
		String regex = "\\, ";
		String[] parametersList = parametersStr.split(regex);

		String[] parameters;
		regex = "\\=";
		for (int i = 0; i < parametersList.length; i++) {
			parameters = parametersList[i].split(regex);
			switch (parameters[0].toUpperCase()) {
			case "POWER":
				robotCleaner.setPower(Integer.parseInt(parameters[1]));
				break;
			case "COLOR":
				robotCleaner.setColor(parameters[1]);
				break;
			case "NOISE_LEVEL":
				robotCleaner.setNoiseLevel(Integer.parseInt(parameters[1]));
				break;
			case "BATTERY_CAPACITY":
				robotCleaner.setBatteryCapacity(Integer.parseInt(parameters[1]));
				break;
			default:
				break;
			}
		}
		return robotCleaner;
	}

	private Appliance createWasher(String[] data) {
		Washer washer = new Washer();
		String parametersStr = data[1];
		String regex = "\\, ";
		String[] parametersList = parametersStr.split(regex);

		String[] parameters;
		regex = "\\=";
		for (int i = 0; i < parametersList.length; i++) {
			parameters = parametersList[i].split(regex);
			switch (parameters[0].toUpperCase()) {
			case "MAXIMUM_LOAD":
				washer.setMaximumLoad(Integer.parseInt(parameters[1]));
				break;
			case "SPIN_SPEED":
				washer.setSpinSpeed(Integer.parseInt(parameters[1]));
				break;
			case "ENERGY_CLASS":
				washer.setEnergyClass(parameters[1]);
				break;
			case "NOISE_LEVEL":
				washer.setNoiseLevel(Integer.parseInt(parameters[1]));
				break;
			case "WATER_CONSUMPTION":
				washer.setWaterConsumption(Integer.parseInt(parameters[1]));
				break;
			}
		}
		return washer;
	}
}
