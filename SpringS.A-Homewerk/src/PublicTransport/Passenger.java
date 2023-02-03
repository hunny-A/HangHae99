package PublicTransport;


public class Passenger {
    public int PMoney;

    public Passenger(int PMoney){
        this.PMoney = PMoney;
    }


    public void takeBus(Bus bus, int Money){
        PMoney = Money;
        bus.getBusPassenger(PMoney);
        this.PMoney -= bus.BusFare;
    }
}
