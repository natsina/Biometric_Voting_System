package voting_system;

/**
 * The type Candidate.
 *
 * @author Group 9
 */
public class Candidate {


    private String candidate_name;
    private int candidate_id;
    private String political_Party;

    /**
     * Instantiates a new Candidate.
     *
     * @param candidate_name  the candidate name
     * @param candidate_id    the candidate id
     * @param political_Party the political party
     */
    Candidate(String candidate_name, int candidate_id,String political_Party){
        this.candidate_name=candidate_name;
        this.candidate_id=candidate_id;
        this.political_Party=political_Party;
    }

    /**
     * Gets candidate name.
     *
     * @return the candidate name
     */
    public String getCandidate_name() {
        return candidate_name;
    }

    /**
     * Sets candidate name.
     *
     * @param candidate_name the candidate name
     */
    public void setCandidate_name(String candidate_name) {
        this.candidate_name = candidate_name;
    }

    /**
     * Gets candidate id.
     *
     * @return the candidate id
     */
    public int getCandidate_id() {
        return candidate_id;
    }

    /**
     * Sets candidate id.
     *
     * @param candidate_id the candidate id
     */
    public void setCandidate_id(int candidate_id) {
        this.candidate_id = candidate_id;
    }

    /**
     * Gets political party.
     *
     * @return the political party
     */
    public String getPolitical_Party() {
        return political_Party;
    }

    /**
     * Sets political party.
     *
     * @param political_Party the political party
     */
    public void setPolitical_Party(String political_Party) {
        this.political_Party = political_Party;
    }



    @Override
    public String toString() {
        return "Candidate [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", political_Party="
                + political_Party + "]";
    }


}