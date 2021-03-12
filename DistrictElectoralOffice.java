import java.util.HashMap;

public class DistrictElectoralOffice extends PollingStation {
	
	private int DistrictID;
	private String DistrictName;
	
	public DistrictElectoralOffice(int pollStatID, String districtName, String regionName, int votes) {
		super(pollStatID, districtName, regionName, votes);
		// TODO Auto-generated constructor stub
	}
	
	public DistrictElectoralOffice() {}
	
	public int getDistrictID() {
		return DistrictID;
	}


	public void setDistrictID(int districtID) {
		DistrictID = districtID;
	}


	public String getDistrictName() {
		return DistrictName;
	}


	public void setDistrictName(String districtName) {
		DistrictName = districtName;
	}


	@Override
	public String toString() {
		return "DistrictElectoralOffice [DistrictID=" + DistrictID + ", DistrictName=" + DistrictName + "]";
	}

	public static HashMap<String, Integer> district = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getdist(){
		return district;
	}
	
	public static HashMap<String, Integer> district1 = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getdist1(){
		return district1;
	}

	
	public static HashMap<String, Integer> district2 = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getdist2(){
		return district2;
	}
	
	
	private static int party1;
	private static int party2;
	private static int party3;
	private static int party4;
	
	
	public static void collatePoll() {
		PollingStation distresults = new PollingStation();
		distresults.insertPoll();
		
		try {
		
		party1 = distresults.getpoll1().get("NPP") + distresults.getpoll2().get("NPP") + distresults.getpoll3().get("NPP");
		party2 = distresults.getpoll1().get("NDC") + distresults.getpoll2().get("NDC") + distresults.getpoll3().get("NDC");
		party3 = distresults.getpoll1().get("GUM") + distresults.getpoll2().get("GUM") + distresults.getpoll3().get("GUM");
		party4 = distresults.getpoll1().get("PPP") + distresults.getpoll2().get("PPP") + distresults.getpoll3().get("PPP");
		
		district.put("NPP", party1);
		district.put("NDC", party2);
		district.put("GUM", party3);
		district.put("PPP", party4);
		
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
		
	public void insertDist() {
		district1.put("NPP", 759);
		district1.put("NDC", 883);
		district1.put("GUM", 432);
		district1.put("PPP", 316);
		
		district2.put("NPP", 892);
		district2.put("NDC", 820);
		district2.put("GUM", 579);
		district2.put("PPP", 482);
		
	}

	public static  void tallyDist() {
		DistrictElectoralOffice results = new DistrictElectoralOffice();
		DistrictElectoralOffice.collatePoll();
		results.insertDist();
	}

	public static void main(String[] args) {
		DistrictElectoralOffice.tallyDist();
		
		System.out.println("NPP -> " + district.get("NPP"));
		System.out.println("NDC -> " + district.get("NDC"));
		System.out.println("GUM -> " + district.get("GUM"));
		System.out.println("PPP -> " + district.get("PPP"));
	}
}


