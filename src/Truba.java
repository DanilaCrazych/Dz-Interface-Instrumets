public class Truba implements Instrument{

    private double dirka = 100;
    public void setDirka(double dirka){
        this.dirka = dirka;
    }

    public double getDirka(){
        return dirka;
    }

    @Override
    public void play(){
        System.out.println("Труба гудит " +toString());
    }

    @Override
    public String toString(){
        return "Диаметр дудки: " +dirka +"mm";
    }
}
