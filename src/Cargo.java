public class Cargo  extends  SpaceShip{
    private int cargaMaxima;
    private  int  container;
    public Cargo(int velocidadX, int velocidadY, int coordenadaX, int coordenadaY, int direccionX, int direccionY, int cargaMaxima, int numeroContainers) {
        super(velocidadX, velocidadY, coordenadaX, coordenadaY, direccionX, direccionY);
        this.cargaMaxima = cargaMaxima;
        this.container = numeroContainers;
    }

    public int getCargaMáxima() {
        return cargaMaxima;
    }

    public void setCargaMáxima(int cargaMáxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getContainer() {
        return container;
    }

    public void setcontainer(int container) {
        this.container = container;
    }

    public void load() {
        if (container >= cargaMaxima){
            System.out.println("No se puede introducir otro contenedor, la bodega ya esta llena \n");
        } else{
            container++;
        }
    }
    public void unload() {
        if (container <= 0){
            System.out.println("La nave esta vacia \n");
        } else{
            container = container -1;
        }
    }
}


