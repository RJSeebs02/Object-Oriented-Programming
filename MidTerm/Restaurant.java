public class Restaurant {
    private String RName;
    private String RMotto;

    public Restaurant(String newName, String newMotto){
        RName = newName;
        RMotto = newMotto;
    }
    public void setRName(String newName){
        this.RName = newName;
    }
    public String getRName(){
        return RName;
    }
    public void setRMotto(String newMotto){
        this.RMotto = newMotto;
    }
    public String getRMotto(){
        return RMotto;
    }


}
