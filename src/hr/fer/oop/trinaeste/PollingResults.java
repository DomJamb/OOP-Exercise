package hr.fer.oop.trinaeste;

import java.util.HashMap;
import java.util.Map;

 class Workbook { 
	 public Sheet getSheet(int index) {
		 return null;
	 }
 }
 
 class Sheet {

	public Object getCell(int j, int i) {
		return null;
	}

	public int getRows() {
		return 0;
	}

	public int getColumns() {
		return 0;
	}

	public String getContents() {
		return null;
	} 
	 
 }


public class PollingResults {
	
	private Map<PollingStation, Map<String, Integer>> mayorResults;
    private Map<PollingStation, Map<String, Integer>> assemblyResults;
    
    private static final int START_CANDIDATES_INDEX = 13;
    private static final int END_POLLING_STATION_INDEX = 7;

    public PollingResults(Workbook workbook) {

        this.assemblyResults = fillResults(workbook.getSheet(0));

        this.mayorResults = fillResults(workbook.getSheet(1));
    }

    public Map<PollingStation, Map<String, Integer>> getAssemblyResults() {
        return assemblyResults;
    }

    public Map<PollingStation, Map<String, Integer>> getMayorResults() {
        return mayorResults;
    }
    
    private static Map<PollingStation, Map<String, Integer>> fillResults(Sheet sheet) {
    	
        Map<PollingStation, Map<String, Integer>> results = new HashMap<>();

        int rows = sheet.getRows();
        int columns = sheet.getColumns();

        String[] candidates = new String[columns - START_CANDIDATES_INDEX];
        for (int j = START_CANDIDATES_INDEX; j < columns; j++) {
            candidates[j - START_CANDIDATES_INDEX] = ((Sheet) sheet.getCell(j, 0)).getContents();
        }

        for (int i = 1; i < rows; i++) {
            String[] pollingStationData = new String[END_POLLING_STATION_INDEX + 1];
            for (int j = 0; j <= END_POLLING_STATION_INDEX; j++) {
                pollingStationData[j] = ((Sheet) sheet.getCell(j, i)).getContents();
            }
            PollingStation pollingStation = new PollingStation(Integer.parseInt(pollingStationData[0]), pollingStationData[1],
                    pollingStationData[2], pollingStationData[3], Integer.parseInt(pollingStationData[4]),
                    pollingStationData[5], pollingStationData[6], pollingStationData[7]);

            for (int j = START_CANDIDATES_INDEX; j < columns; j++) {
                Map<String, Integer> pollingStationResults = results.getOrDefault(pollingStation, new HashMap<>());
                pollingStationResults.put(candidates[j - START_CANDIDATES_INDEX], Integer.parseInt(((Sheet) sheet.getCell(j, i)).getContents()));
                results.put(pollingStation, pollingStationResults);
            }
        }

        return results;
    }
}


