package academy.mindswap;

public class Tyre {
    private int tyreLife;
    private boolean isTyreOk;

    public Tyre (){
        this.isTyreOk = true;
        this.tyreLife = 1000;
    }

    public boolean tyreIntegraty(int distance){
        if (isTyreOk) {
            tyreLife -= distance;
            if (tyreLife <= 0){
                isTyreOk = false;
                return isTyreOk;
            }
        }
        return false;
    }

    public boolean getTyreIntegrety(){
        return isTyreOk;
    }

    public void changeTyres(){
        isTyreOk = true;
        tyreLife = 500;
    }
}
