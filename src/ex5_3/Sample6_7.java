package ex5_3;

public class Sample6_7 {
    public static void main(String[] args) {
        Company cmp = new Company();

        Driver dr1 = new Driver(cmp);
        dr1.start();

        Driver dr2 = new Driver(cmp);
        dr2.start();
    }
}

class Company{
    private int sum = 0;

    public void add(int a){
        int tmp = sum;
        System.out.println("目前的合計金額是"+tmp+"元");
        System.out.println("賺到"+a+"元");
        tmp = tmp + a;
        System.out.println("合計金額是"+tmp+"元");
        sum = tmp;
    }
}
class Driver extends Thread{
    private Company comp;
    public Driver(Company c){
        comp = c;
    }
    public void run(){
        for(int i = 0;i<3;i++){
            comp.add(50);
        }
    }
}
