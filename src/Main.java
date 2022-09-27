public class Main {
    public static void main(String[] args) {
    Instrument[] a = new Instrument[3];
    a[0] = new Guitar();
    a[1] = new Drumka();
    a[2] = new Truba();

    for (Instrument instrument : a){
        instrument.play();
    }
    }
}