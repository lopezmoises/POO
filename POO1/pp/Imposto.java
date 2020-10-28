package pp;

public class Imposto {

    private String Nombre;
    private float Salario;
    private String Cargo;

    /**
     * @return String return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return int return the Salario
     */
    public float getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(Float Salario) {

        if (Salario < 1000) {
            this.Salario = Salario;
        } else if (Salario > 1000 && Salario < 2000) {
            this.Salario = (float) (Salario * 0.05);
        } else if (Salario > 2000 && Salario < 3000) {
            this.Salario = (float) (Salario * 0.1);
        } else {
            this.Salario = (float) (Salario * 0.15);
        }
    }

    /**
     * @return String return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void calculator() {

    }
}