import java.util.ArrayList;
/**
 * 
 * @author Team 1 9
 *
 */
public class Vote extends Candidate{
	
	Vote(String candidate_name, int candidate_id, String political_Party) {
		super(candidate_name, candidate_id, political_Party);
		// TODO Auto-generated constructor stub
	}

	private int VoteID;
	
	/**
	 * 
	 * @return Voters ID
	 */
	public int getVoteID() {
		return VoteID;
	}
	
	/**
	 * 
	 * @param voteID
	 */
	public void setVoteID(int voteID) {
		VoteID = voteID;
	}
	
	
	protected static int counter = 0;
	
	/**
	 * 
	 * @return Number of Votes according to how many times method is called
	 */
	public int voteCount() {
		counter++;
		System.out.println(counter);
		return counter;
	}

	
	/**
	 * Driver Code
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> candidates = new ArrayList<String>();
		candidates.add("Nana Akuffo Addo");
		candidates.add("John Dramani Mahama");
		candidates.add("Akua Donkor");
	}
	

}
