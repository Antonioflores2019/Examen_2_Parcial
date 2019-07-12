package antonio;
import antonio.excepciones.ErrorValidacion;

public  class   Alumno {

    public String nombre;
    public String numerocuenta;
    public String apellido;
    public int edad;

    public String getNumeroCuenta() {
        return numerocuenta;
    }
    public String getNombre(){return nombre;}
    public String getApellido()return apellido;}

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() != 50) {
            throw new ErrorValidacion("Ingrese otro nombre ya que sobrepasa el limite de caracteres");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) throws Exception {
        if (apellido.length() != 50) {
            throw new ErrorValidacion("Ingrese otro apellido ya que sobrepasa el limite de caracteres");
        }
        this.apellido = apellido;
    }

    public void setEdad(int edad) throws Exception {
        if (edad <= 16 && edad >50) {

            throw new ErrorValidacion("Ingrese otra edad que este entre 16 y 50 ");
        }
        this.edad = edad;
    }

    public void setNumerocuentas(String numerocuenta) throws Exception {
        if (numerocuenta.length() != 13) {
            throw new ErrorValidacion("El numero de identidad debe contener 13 caracteres.");
        }
        this.numerocuenta = numerocuenta;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

}










