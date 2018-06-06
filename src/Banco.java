public class Banco {

    private int saldo;

    public synchronized void retirarDinero(int retiro) {
        if (getSaldo() >= retiro) {
            this.saldo = this.saldo - retiro;
            System.out.println("retiraste " + retiro);
            System.out.println("el saldo" + getSaldo());
        } else {
            System.out.println("saldo insuficiente al intentar retirar " + retiro);
        }
    }

    public synchronized void depositarDinero(int deposito) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.saldo = this.saldo + deposito;
        System.out.println("depositaste " + deposito);
        System.out.println("luego de depositar el saldo" + getSaldo());
    }

    public synchronized int getSaldo() {
        return saldo;
    }

}
