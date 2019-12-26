package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

	private BufferedReader applianceReader;

	public ApplianceReader(String fileName) throws FileNotFoundException {
		applianceReader = new BufferedReader(new FileReader(fileName));
	}

	public List<String> read(String applianceType) throws IOException {
		if (applianceType == null) {
			return readAll();
		} else {
			return readWithType(applianceType);
		}
	}

	private List<String> readAll() throws IOException {

		try {
			List<String> allApplianceTypesList = new ArrayList<String>();
			String readNewLine = applianceReader.readLine();

			while (readNewLine != null) {
				allApplianceTypesList.add(readNewLine);
				readNewLine = applianceReader.readLine();
			}
			return allApplianceTypesList;
		} finally {
			try {
				applianceReader.close();
			} finally {
			}
		}
	}

	private List<String> readWithType(String applianceType) throws IOException {

		try {
			List<String> applianceTypeList = new ArrayList<String>();
			String readNewLine = applianceReader.readLine();

			while (readNewLine != null) {
				if (readNewLine.contains(applianceType)) {
					applianceTypeList.add(readNewLine);
				}
				readNewLine = applianceReader.readLine();
			}
			return applianceTypeList;
		} finally {
			try {
				applianceReader.close();
			} finally {

			}
		}
	}
}
