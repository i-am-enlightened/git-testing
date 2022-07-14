package interviewPrepMiscellanous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class apacheLog {
	
	public static String mostVisitedWebsite(String[] sArray) {
		String mostVisited="";
		int i;
		List<String> ipList = new ArrayList<>();
		int maxCount=0;
		
		for(i=0;i<sArray.length;i++) {
			String log = sArray[i];
			String[] IP_Log = log.split("-");
			ipList.add(IP_Log[0]);
		}
		
		Iterator<String> itr = ipList.iterator();
		
		HashMap<String, Integer> ipMap = new HashMap<>();
		while(itr.hasNext()) {
			String IPAddress = itr.next();
			if(ipMap.containsKey(IPAddress)) {
				ipMap.put(IPAddress, (int) ipMap.get(IPAddress)+1);
			}
			else {
				ipMap.put(IPAddress, 1);
			}
		}
	
		for(Entry<String, Integer> entry: ipMap.entrySet()) {
			int value = entry.getValue();
			if(value>maxCount) {
				maxCount = value;
			}
		}
		
		for(Entry<String, Integer> entry: ipMap.entrySet()) {
			if(entry.getValue()==maxCount) {
				mostVisited = entry.getKey();
				break;
			}
		}
		
		return mostVisited;
	}
	
	public static void main(String[] args) {
		String[] sArray = {
			"10.0.0.1 - log entry 1 11",
			"10.0.0.1 - log entry 2 213",
			"10.0.0.2 - log entry 1331332"	
		};
		
		String mostVisitedWebsite = mostVisitedWebsite(sArray);
		System.out.println(mostVisitedWebsite);
	}

}
