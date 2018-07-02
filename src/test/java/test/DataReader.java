package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

	public List<String> getData (String filepath) {
		List<String> dataList = new ArrayList<String>();
		File file = new File(filepath);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			System.out.println("Reading the file using readLine(): ");
			
			while (true) {
				String dataLine = br.readLine();
				if (dataLine!=null) {
					dataList.add(dataLine);
				} else {
					break;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("File was not Found!");
		} catch (IOException e) {
			System.out.println("Error opening file");
		} finally {
			try {
				if (br != null) {
					br.close();
				}

			} catch (IOException e) {
				System.out.println("Error closing BufferedReader");
			}
		}
		return dataList;
	}
	
}