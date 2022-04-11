public class SpaceShip {
    private String nombre;
    private String matriculagalatica;
    private int aceleracion;
    private int velocidadX;
    private int velocidadY;
    private int coordenadaX;
    private int coordenadaY;
    private int direccionX;
    private int direccionY;
    int velocidadFinal;
    int coordenadaFinal;

    public SpaceShip(int velocidadX, int velocidadY, int coordenadaX, int coordenadaY, int direccionX, int direccionY) {
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.direccionX = direccionX;
        this.direccionY = direccionY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculagalatica() {
        return matriculagalatica;
    }

    public void setMatriculagalatica(String matriculagalatica) {
        this.matriculagalatica = matriculagalatica;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }

    public int getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }


    public int speedUp(){
        velocidadFinal = velocidadX + aceleracion;
        coordenadaFinal = coordenadaX + velocidadFinal;
        return  coordenadaFinal;
    }
    @Override
    public String toString() {
        return "SpaceShip{" +
                "nombre='" + nombre + '\'' +
                '}'  + "           ___\n" +
                "     |     | |\n" +
                "    / \\    | |\n" +
                "   |--o|===|-|\n" +
                "   |---|   |d|\n" +
                "  /     \\  |w|\n" +
                " | U     | |b|\n" +
                " | S     |=| |\n" +
                " | A     | | |\n" +
                " |_______| |_|\n" +
                "  |@| |@|  | |\n" +
                "___________|_|_\n" ;
    }
}