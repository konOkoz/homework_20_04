package homework20_04;

public class Main {
    /*
    Написать метод 100 раз печатающий символ и вывести на экран результат его работы для двух потоков (Например,
    один поток печатает # а второй *).
    В конце работы на экран должно выводиться "end of main"
     */
    public static void main(String[] args) {

        SymbolThread st = new SymbolThread("#");
        Thread th1 = new Thread(st);
        th1.start();

        SymbolThread st1 =new SymbolThread("*");
        Thread th2 = new Thread(st1);
        th2.start();
        try {
            th1.join();
            th2.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("end of main");
    }
}
