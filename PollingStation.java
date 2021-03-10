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
	protected static int cand1_votes;
	protected static int cand2_votes;
	protected static int cand3_votes;
	
	
	public void collate() {
		
		
	}
	
	public static void main(String[] args) {

		HashMap<String, Integer> votes = new HashMap<String, Integer>();
		votes.put(cand1, cand1_votes);
		votes.put(cand2, cand2_votes);
		votes.put(cand3, cand3_votes);
		
	}
	
	
}

