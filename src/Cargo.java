public class Cargo  extends  SpaceShip{
    private final int cargaMaxima= 100;
    private  final int  container = 1;
    private int contenedores;
    public Cargo(String nombre, String matriculagalatica,int velocidadX, int velocidadY, int coordenadaX, int coordenadaY, int direccionX, int direccionY, int cargaMaxima, int numeroContainers) {
        super(nombre,matriculagalatica,velocidadX, velocidadY, coordenadaX, coordenadaY, direccionX, direccionY);

    }


    public void load() {
        if (contenedores >= cargaMaxima){
            System.out.println("No se puede introducir otro contenedor, la bodega ya esta llena \n");
        } else{
            contenedores= contenedores + container;
        }
    }
    public void unload() {
        if (contenedores <= 0){
            System.out.println("La nave esta vacia \n");
        } else{
            contenedores = contenedores -container;
        }
    }
}


