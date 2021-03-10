import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Team 1 9
 *
 */
public class Vote extends Candidate{
private int VoteID;

Vote(){
	super();
}
	Vote(int VoteID) {
	this.VoteID=VoteID;
	}

	
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
	@Override
	public String toString() {
		return "Vote [VoteID=" + VoteID + "]";  }
public void() {
// user voting
	Scanner scan = new Scanner(System.in);
	  int VoteID = scan
}


}
