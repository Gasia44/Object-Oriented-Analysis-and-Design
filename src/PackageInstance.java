import java.util.Date;

public class PackageInstance {

    private int id;
    private String registrationAddress;
    private Date activeFrom;
    private Date activeTo;
    private double balance;
    private int freeFixedMinutes;
    private boolean isActive;

    public boolean checkIfHasFixedTariff(){
        return true;
    };

    public double getTotalPrice(){
        return 0;
    };

    public void chargeForTalkedMinutes(Call call){

    };

    public void increaseBalance(double amount){

    };

}
