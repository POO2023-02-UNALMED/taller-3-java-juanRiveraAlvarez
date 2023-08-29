package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.numTV = this.numTV + 1;

        this.canal = 1;
        this.precio = 500;
        this.volumen = 1;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public Control getControl() {
        return this.control;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        if(this.estado && canal >= 1 && canal <= 120){
            this.canal = canal;
        }
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        if(this.estado && volumen >= 1 && volumen <= 7){
            this.volumen = volumen;
        }
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
        if(this.estado && this.canal < 120){
            this.canal = this.canal+1;
        } 
    }

    public void canalDown(){
        if(this.estado && this.canal>1){
            this.canal = this.canal-1;
        }
    }

    public void volumenUp(){
        if(this.estado &&  this.volumen<7){
            this.volumen = this.volumen+1;
        }
    }

    public void volumenDown(){
        if(this.estado && this.volumen>1){
            this.volumen = this.volumen-1;
        }
    }
  
}
