package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.FileNotFoundException;
import java.util.List;

import by.tc.task01.dao.impl.ApplianceDAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws ApplianceDAOException, FileNotFoundException {
		List<Appliance> appliance = null;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaRobotCleaner = new Criteria(RobotCleaner.class.getSimpleName());// "RobotCleaner"
		criteriaRobotCleaner.add(RobotCleaner.POWER.toString(), 60);

		appliance = service.find(criteriaRobotCleaner);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaDishwasher = new Criteria(Dishwasher.class.getSimpleName());// "Dishwasher"
		criteriaDishwasher.add(Dishwasher.ENERGY_CLASS.toString(), "A+");
		criteriaDishwasher.add(Dishwasher.NOISE_LEVEL.toString(), 44);

		appliance = service.find(criteriaDishwasher);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());// "Dishwasher"
		criteriaRefrigerator.add(Refrigerator.NOISE_LEVEL.toString(), 42);
	
		appliance = service.find(criteriaRefrigerator);

		PrintApplianceInfo.print(appliance);

	}

}
