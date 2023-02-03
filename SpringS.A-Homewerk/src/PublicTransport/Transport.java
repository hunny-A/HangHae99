package PublicTransport;

public class Transport {
    protected int MaxBusPasseneger;   //1. 최대 승객수
    protected int NowBusPassenger;   //2. 현재 승객수
    protected int BusFare;    //3. 요금
    protected String BusNum;  //4. 버스 번호
    protected int NowBusRefuel = 100;  //5. 주유량
    protected int NowBusSpeed;   //6. 현재 속도
    protected int NowBusState = 1;   //7. 상태 (운행, 차고지행)
    protected int Money; //얻은 돈


    public Transport(){

    }
    //상태 변경
    public void stateChange(){
        // 1일시 운행, 0일시 차고지
        this.NowBusState = 1;
        this.NowBusRefuel -= 5;
        if(NowBusRefuel<10){
            System.out.println("주유가 필요합니다. 차고지로 향하는 중...");
            NowBusState = 0;
        } else {NowBusState = 1;}
        System.out.println(NowBusState==1?"현재 상태 : 운행 중":"현재 상태 : 차고지");
        System.out.println();
    }

    //속도 변경
    public int forChangeSpeed(int ChangeSpeed){
        if (this.NowBusRefuel >= 10){
            NowBusSpeed = ChangeSpeed;
            System.out.println("속도 "+ChangeSpeed+"로 전환");
        } else System.out.println("주유량을 확인해 주세요.");

        return NowBusSpeed;
    }

}
