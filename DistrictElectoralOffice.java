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
	
	private static int party1;
	private static int party2;
	private static int party3;
	private static int party4;
	
	
	public static void collate() {
		PollingStation results = new PollingStation();
		
		party1 = results.getpoll1().get("NPP") + results.getpoll2().get("NPP") + results.getpoll3().get("NPP");
		party2 = results.getpoll1().get("NDC") + results.getpoll2().get("NDC") + results.getpoll3().get("NDC");
		party3 = results.getpoll1().get("GUM") + results.getpoll2().get("GUM") + results.getpoll3().get("GUM");
		party4 = results.getpoll1().get("PPP") + results.getpoll2().get("PPP") + results.getpoll3().get("PPP");
		
		district.put("NPP", party1);
		district.put("NDC", party2);
		district.put("GUM", party3);
		district.put("PPP", party4);		
	}
	

	public static void main(String[] args) {
		DistrictElectoralOffice dist = new DistrictElectoralOffice();
		DistrictElectoralOffice.collate();
		
		System.out.println("NPP -> " + district.get("NPP"));
		System.out.println("NDC -> " + district.get("NDC"));
		System.out.println("GUM -> " + district.get("GUM"));
		System.out.println("PPP -> " + district.get("PPP"));
	}
	
}
