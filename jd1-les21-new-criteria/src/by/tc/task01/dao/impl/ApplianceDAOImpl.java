package by.tc.task01.dao.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws ApplianceDAOException {
		try {
			List<Appliance> appliance = null;
			ApplianceReader reader = new ApplianceReader("resources\\appliances.txt");
			ApplianceMatcher matcher = new ApplianceMatcher();
			AppliancesFactory appliancesFactory = new AppliancesFactory();

			List<String> applianceStringList = null;

			applianceStringList = reader.read(criteria.getGroupSearchName());

			List<String> resultApplianceStringList = matcher.match(applianceStringList, criteria);

			appliance = appliancesFactory.create(resultApplianceStringList);

			return appliance;
		} catch (Exception ae){
			throw new ApplianceDAOException(ae);
		}
	}
}