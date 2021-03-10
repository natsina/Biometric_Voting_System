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
	
	// Instance of candidate names for input in hashmap as key when values have been collated
	protected static String cand1 = "Nana Akuffo Addo";
	protected static String cand2 = "John Dramani Mahama";
	protected static String cand3 = "Ivor Greenstreet";
	protected static String cand4 = "Christian Kwabena Andrews";
	

	


}