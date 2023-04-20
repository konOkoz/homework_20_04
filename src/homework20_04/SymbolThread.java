package homework20_04;

public class SymbolThread extends Thread {
    String symbol;

    public SymbolThread(String symbol) {
        this.symbol = symbol;
    }

    public void run(){
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(200);
                System.out.print(symbol);
                i++;
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
