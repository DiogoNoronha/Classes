package academy.mindswap;

public class Table {

    private boolean isTableUsed;
    private String clientName;
    private boolean isPayed;

    public Table() {
        this.clientName = "";
    }

    public void setClientIn(String clientName) {
        this.clientName = clientName;
        this.isTableUsed = true;
    }

    public void setClientOut() {
        this.clientName = "";
        this.isTableUsed = false;
        this.isPayed = false;
    }

    public String getClientName() {
        return clientName;
    }

    public void setPayed(boolean payed) {
        this.isPayed = payed;
    }

    public boolean getPayed() {
        return isPayed;
    }

    public boolean getTableOcupation(){
        return isTableUsed;
    }
}
