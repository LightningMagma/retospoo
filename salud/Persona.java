package salud;
import java.util.*;
public class Persona {
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private double estatura;
    private double peso;   
    Scanner sc =new Scanner(System.in); 
    
    public Persona(){}
    
    public Persona(String tipoDoc, String documento, String nombre, String apellido, String sexo, int edad, double estatura, double peso) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
    
    public void pedirDatos()    
    {
        System.out.println("Por favor ingrese los datos que se le solicitan\nIngrese el tipo de documento del persona.");
        tipoDoc = sc.next();
        System.out.println("Ingrese el numero de documento");
        documento = sc.next();
        System.out.println("Ingrese el nombre de la persona");
        nombre = sc.next();
        System.out.println("Ingrese el apellido de la persona");
        apellido = sc.next();
        System.out.println("Ingrese el peso en kilogramos");
        peso = sc.nextFloat();
        System.out.println("Ingrese la estatura en metros");
        estatura = sc.nextFloat();
        System.out.println("Ingrese la edad de la persona");
        edad = sc.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        sexo = sc.next();
    }
    public void mostrarPersona()
    {
        System.out.println("Estos son los datos del persona\nTipo de documento: "+tipoDoc+"\nDocumento: "+documento+"\nNombre: "+nombre);
    }
    public void calcularImc() {
        double pesoactual = peso/(estatura*estatura);
        if(pesoactual < 20) {
            System.out.println("Esta por debajo del peso actual");
        }
        else if(pesoactual > 20 && pesoactual < 25) {
            System.out.println("El peso es ideal");
        }
        else {
            System.out.println("TIene sobrepeso");
        }
    }
    public void mayoredad() {
        if(edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad"
            );}
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
