
    public class Contenedor implements Runnable {
        private Banco bank;
        public Contenedor(Banco bank) {
            this.bank = bank;
        }
        @Override
        public void run() {
            while(Boolean.TRUE)
            {
                bank.retirarDinero(20);
                bank.depositarDinero(30);
                bank.retirarDinero(20);
                bank.retirarDinero(20);
            }
        }
        public static void main(String[] args) {
            Banco bank=new Banco();
            Thread hilo1=new Thread(new Contenedor(bank));
            Thread hilo2=new Thread(new Contenedor(bank));
            Thread hilo3=new Thread(new Contenedor(bank));

            hilo1.start();
            hilo2.start();
            hilo3.start();
        }
    }


