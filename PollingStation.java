import java.util.HashMap;

public class PollingStation extends Vote{
	private int pollStatID;
	private String districtName;
	private String regionName;
	public int votes;
	
	
	
	public PollingStation(int pollStatID, String districtName, String regionName, int votes) {
		super();
		this.pollStatID = pollStatID;
		this.districtName = districtName;
		this.regionName = regionName;
		this.votes = votes;
	}

	public PollingStation() {}
	
	public int getPollStatID() {
		return pollStatID;
	}

	public void setPollStatID(int pollStatID) {
		this.pollStatID = pollStatID;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	
	// Instance variables represent total votes at polling station level
	protected static int party1;
	protected static int party2;
	protected static int party3;
	protected static int party4;
	
	

		public static HashMap<String, Integer> poll1 = new HashMap<String, Integer>();
		
		public HashMap<String, Integer> getpoll1(){
			return poll1;
		}
		
		
		public static HashMap<String, Integer> poll2 = new HashMap<String, Integer>();
		
		public HashMap<String, Integer> getpoll2(){
			return poll2;
		}
		
		
		public static HashMap<String, Integer> poll3 = new HashMap<String, Integer>();
		
		public HashMap<String, Integer> getpoll3(){
			return poll3;
		}

	
	public static void main(String[] args) {
		
		PollingStation results = new PollingStation();
		
		poll1.put("NPP", 234);
		poll1.put("NDC", 251);
		poll1.put("GUM", 128);
		poll1.put("PPP", 356);
		
		poll2.put("NPP", 234);
		poll2.put("NDC", 251);
		poll2.put("GUM", 128);
		poll2.put("PPP", 356);
		
		poll3.put("NPP", 234);
		poll3.put("NDC", 251);
		poll3.put("GUM", 128);
		poll3.put("PPP", 356);
		
		int part = results.getpoll1().get("NPP") + results.getpoll2().get("NPP") + results.getpoll3().get("NPP");
		System.out.println(part);
	}
	
	
}

