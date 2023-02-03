import PublicTransport.Bus;
import PublicTransport.Passenger;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int PMoney = 0;
        int CSpeed = 0;
        Passenger passengers = new Passenger(PMoney);
        Bus bus1 = new Bus();

        while (true){

            bus1.forChangeSpeed(0);

            Scanner sc = new Scanner(System.in);
            System.out.print("넣을 금액을 입력하세요 : ");
            PMoney = sc.nextInt();

            passengers.takeBus(bus1,PMoney);
            System.out.println();

            System.out.print("바꿀 속도 입력 : ");
            CSpeed = sc.nextInt();
            bus1.forChangeSpeed(CSpeed);
            System.out.println();

            bus1.stateChange();
            bus1.showInfo();
            System.out.println("--------");
        }
    }
}