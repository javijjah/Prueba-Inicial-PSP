public class Cliente_registrado implements Cliente {
    private String Nombre;
    private String Apellidos;
    private String DNI;
    private String Telefono;
    private float Saldo;
    private int descuento = 2;
    private boolean esVIP;

    public Cliente_registrado(String nombre, String apellidos, String DNI, String telefono,
                              float saldo, int descuento, boolean esVIP) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.DNI = DNI;
        Telefono = telefono;
        Saldo = saldo;
        this.descuento = descuento;
        this.esVIP = esVIP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public float getSaldo() {
        return Saldo;
    }

    public int getDescuento() {
        return descuento;
    }

    boolean valida_DNI() {
        //TODO
        return true;
    }

    boolean esVIP() {
        return esVIP;
    }

    void actualizaDescuento() {
        if (getSaldo() > 100) {
            descuento = 5;
        }
        for (int i = 0; i < (getSaldo() / 50) || descuento < 30; i++) {
            descuento += 1;
        }
    }


    void anyadirsaldo(float cantidad) {
        Saldo += cantidad;
    }


    @Override
    public String toString() {
        return "Cliente_registrado{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Saldo=" + Saldo +
                ", descuento=" + descuento +
                ", esVIP=" + esVIP +
                '}';
    }

    @Override
    //he entendido que aplicar descuento era restar el precio con el descuento que tenga el cliente de forma
    //personal, por lo que no le he visto sentido a que devolviese un int y lo he cambiado a float
    public float aplicaDescuento(Producto producto) {
        actualizaDescuento();
        float mult = descuento;
        return producto.getPrecio() * (mult / 100);
    }

    @Override
    public boolean pagar(float cantidad) {
        if (Saldo < cantidad) {
            return false;
        }
        Saldo -= cantidad;
        return true;
    }
}
