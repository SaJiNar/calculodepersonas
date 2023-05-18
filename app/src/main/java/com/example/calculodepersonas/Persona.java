package com.example.calculodepersonas;

public class Persona {

    private static final char genero_default = 'H';

    private static final int peso_bajo = -1;
    private static final int peso_bien = 0;
    private static final int sobrepeso = 1;
    private String nombre;
    private int edad;
    private String DNI;
    private String sexo;
    private double peso;
    private double altura;



    public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        ObtenerDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        ObtenerSexo();
    }

    private void ObtenerSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = String.valueOf(genero_default);
        }
    }

    private void ObtenerDNI() {
        int numDNI = ((int) (Math.random() * 100000000 - 100000000) + 100000000);
    int resultado = numDNI - (numDNI/divisor * divisor);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
