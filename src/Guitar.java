public class Guitar implements Instrument{

    private int StringNum = 8;
    public void setStringNum(int StringNum) {
        this.StringNum = StringNum;
    }
    public int getStringNum() {return StringNum; }

    @Override
    public void play(){
        System.out.println("Гитара играет " + toString());
    }

    @Override
    public String toString() {return "Количество струн: " +StringNum; }
}
