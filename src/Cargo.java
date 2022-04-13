public class Cargo  extends  SpaceShip{
    private int cargaMáxima;
    private  int  numeroContainers;

    public Cargo(int velocidadX, int velocidadY, int coordenadaX, int coordenadaY, int direccionX, int direccionY, int cargaMáxima, int numeroContainers) {
        super(velocidadX, velocidadY, coordenadaX, coordenadaY, direccionX, direccionY);
        this.cargaMáxima = cargaMáxima;
        this.numeroContainers = numeroContainers;
    }

    public int getCargaMáxima() {
        return cargaMáxima;
    }

    public void setCargaMáxima(int cargaMáxima) {
        this.cargaMáxima = cargaMáxima;
    }

    public int getNumeroContainers() {
        return numeroContainers;
    }

    public void setNumeroContainers(int numeroContainers) {
        this.numeroContainers = numeroContainers;
    }
}
