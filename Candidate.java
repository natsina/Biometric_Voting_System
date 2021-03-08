import java.util.ArrayList;


public class Candidate{
    private String candidate_name;
    private int candidate_id;
    private String political_Party;

    Candidate(String candidate_name, int candidate_id,String political_Party){
        this.candidate_name=candidate_name;
        this.candidate_id=candidate_id;
        this.political_Party=political_Party;
    }
    
    public String getCandidate_name() {
        return candidate_name;
    }

    public void setCandidate_name(String candidate_name) {
        this.candidate_name = candidate_name;
    }

    public int getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(int candidate_id) {
        this.candidate_id = candidate_id;
    }

    public String getPolitical_Party() {
        return political_Party;
    }

    public void setPolitical_Party(String political_Party) {
        this.political_Party = political_Party;
    }



    @Override
    public String toString() {
        return "Candidate [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", political_Party="
                + political_Party + "]";
    }
        
    
}