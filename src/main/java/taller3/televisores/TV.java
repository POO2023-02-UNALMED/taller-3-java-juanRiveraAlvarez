package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.numTV = this.numTV + 1;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public void turnOff(){
        this.estado = false;
    }

    public void turnOn(){
        this.estado = true;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void canalUp(){
        if(this.estado && this.canal>1 && this.canal<120){
            this.canal = this.canal+1;
        } 
    }

    public void canalDown(){
        if(this.estado && this.canal>1 && this.canal<120){
            this.canal = this.canal-1;
        }
    }

    public void volumenUp(){
        if(this.estado && this.volumen>1 && this.volumen<7){
            this.volumen = this.volumen+1;
        }
    }

    public void volumenDown(){
        if(this.estado && this.volumen>1 && this.volumen<7){
            this.volumen = this.volumen-1;
        }
    }
  
}
