/**
 * Project package: com.company
 */
/* @authors
   Mario Aryeh
   Nii Armah Tettey
   George Debrah
   
   *Class:Main
   * Accessibility Modifier: Public
*/
 


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {
    static class Voter {
        String fullName;
        String voterNo;
/**
	 * Constructor
	 * @param fullname, age, voters ID number
    
	 * Accessor 
	 * @param fullname, voterNo
	 */

	 

        public Voter(String fullName, String voterNo) {
            this.fullName = fullName;
            this.voterNo = voterNo;
        }
    }
    static class Candidate{
        String fullName;
        int numVotes;
        String party;
        int no;
/**
	 * Constructor
	 * @param fullname, party, no
    
	 * Accessor 
	 * @param party, no
	 */

        public Candidate(String fullName, String party, int no) {
            this.fullName = fullName;
            this.party = party;
            this.no = no;
        }
    }

    //List to store all voters
    static Voter[] votersList = {new Voter("Mario Aryeh", "00001"),
            new Voter("Kwaku Reckson", "00002"),
            new Voter("Dean Areha", "00002"),
            new Voter("Ama Dzefa", "00003"),
            new Voter("Sabina Dadson", "00004"),
            new Voter("Elijah Michaelson", "00005"),
            new Voter("Klaus Michaelson", "00006"),
            new Voter("Hayley Dadson", "00008"),
            new Voter("Ama Dadson", "00009"),
            new Voter("Steve Rogers", "00010")};

    //Hashmap to store all candidates
    static HashMap<Candidate, Integer> voteCountsHashMap = new HashMap<>();

    //Deques data struture to store voters who have voted already
    static Deque<Candidate> votedUsers = new ArrayDeque<>();

/**
	 * Main Method
	 * @param args
	 */

    public static void main(String[] args) {
        //Initialize hashmap with candidates and set initial votes to 0
        voteCountsHashMap.put(new Candidate("Nana Addo","NPP",1), 0);
        voteCountsHashMap.put(new Candidate("John Mahama","NDC",2), 0);
        voteCountsHashMap.put(new Candidate("Maame Akua Donkor","GFP",3), 0);
        voteCountsHashMap.put(new Candidate("Ivor Greenstreet","CPP",4), 0);

        System.out.println("**************Enter Details**********");
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter voter No: ");
        String voterNo = scanner.nextLine();

        boolean found = false;

        for (Voter voter : votersList) {
            if((voterNo.equals(voter.voterNo) && name.equals(voter.fullName))){
                found = true;
            }
        }
        if(!found) {
            System.out.println("Details do not match, Ask for Assistance!");
            System.exit(0);
        }
        System.out.println("No \t\tParty \t\tFullName");
        voteCountsHashMap.forEach(new BiConsumer<Candidate, Integer>() {
            @Override
            public void accept(Candidate candidate, Integer integer) {
                System.out.println(candidate.no + "\t\t" + candidate.party + "\t\t" + candidate.fullName);
            }
        });

        System.out.println("Type the number indicating your selection: ");

        int userSelection = scanner.nextInt();

        voteCountsHashMap.forEach(new BiConsumer<Candidate, Integer>() {
            @Override
            public void accept(Candidate candidate, Integer integer) {
                if (candidate.no == userSelection) {
                    //Increase the vote count by 1
                    voteCountsHashMap.put(candidate, integer++);

                    //Add user to deque
                    votedUsers.add(candidate);

                    //prompt the use of their selection and exit
                    System.out.println("Congratulations your vote for " + candidate.fullName + " has been logged\n" +
                            "Thank you for voting :)");
                }
            }
        });



    }
}
