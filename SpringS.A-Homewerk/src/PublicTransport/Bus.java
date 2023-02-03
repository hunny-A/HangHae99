package PublicTransport;
import java.util.UUID;

public class Bus extends Transport {

    int MaxBusPasseneger=30;   //1. 최대 승객수
//    int NowBusPassenger;   //2. 현재 승객수
    int BusFare=1000;    //3. 요금
//    String BusNum;  //4. 버스 번호
//    int NowBusRefuel=20;  //5. 주유량
//    int NowBusSpeed;   //6. 현재 속도
//    int NowBusState=1;   //7. 상태 (운행, 차고지행)
//    int Money; //얻은 돈


    public Bus(){
        this.BusNum = UUID.randomUUID().toString();
    }

    //운행 기능
    void busService(){
    }

    //승객 탑승
    public void getBusPassenger(int PMoney){
        if(this.MaxBusPasseneger<this.NowBusPassenger){
            System.out.println("인원이 초과되었습니다.");
        } else {
            if(PMoney < this.BusFare){
                System.out.println("잔액이 부족합니다.");
            } else if (PMoney >=this.BusFare){
                this.NowBusPassenger++;
                Money += BusFare;
                System.out.println((PMoney-BusFare)+"원 반환");
            }
        }
    }

    public void showInfo() {
        System.out.println("버스 번호 "+BusNum+"의 승객은"+NowBusPassenger+"명이고, 수입은 "+Money+"원.");
        System.out.println("주유량 : "+NowBusRefuel+ ", 현재 속도 : "+NowBusSpeed);
        System.out.println();
        System.out.println(NowBusState==1?"상태 : 운행 중":"상태 : 차고지");
    }

}
