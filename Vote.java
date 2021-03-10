import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Team 1 9
 *
 */
public class Vote{
	
	/*
	 * Vote(String candidate_name, int candidate_id, String political_Party) {
	 * super(candidate_name, candidate_id, political_Party); // TODO Auto-generated
	 * constructor stub }
	 */

	
	
	
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

	public void submitVote() {
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Enter your ID number: ");
		String voterID = input.nextLine();
		input.close();
		
		try {
			FileWriter writer = new FileWriter("VoterID.txt", true);
			BufferedWriter bw = new BufferedWriter(writer);
			
			bw.write(voterID);
			bw.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("Success");
			
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
	
	Vote test = new Vote();
	test.submitVote();
	}

}
