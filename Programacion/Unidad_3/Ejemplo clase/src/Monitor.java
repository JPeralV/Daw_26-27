public class Monitor {
    //Atributos
    public double size;
    public double weight;
    public String color;
    public int refreshRate;
    public String brand;
    public int resolution;
    public boolean isOn;

    //Constructor
    //Objeto
    public Monitor (double size, double weight){
        this.size = size;
        this.weight = weight;
        this.isOn = false;
    }
    //Metodo
    public void on (){
        this.isOn = true;
    }
    
    public void off (){
        this.isOn =false;
    }

}
