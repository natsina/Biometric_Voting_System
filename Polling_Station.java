public class Polling_Station extends Vote{
    private int Stat_ID;
    private String districtname;
    private String regionname;

    Polling_Station(){
    	super();
    }
   
    Polling_Station( int Stat_ID, String districtname, String regionname){
      
        this.Stat_ID=Stat_ID;
        this.districtname=districtname;
        this.regionname=regionname;
        
    }


    public int getStat_ID() {
        return Stat_ID;
    }


    public void setStaID(int staID) {
        Stat_ID = staID;
    }


    public String getDistrictname() {
        return districtname;
    }


    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }


    public String getRegionname() {
        return regionname;
    }


    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }


    @Override
    public String toString() {
        return "Polling_Station [StaID=" + Stat_ID + ", districtname=" + districtname + ", regionname=" + regionname
                + "]";
    }
    

}