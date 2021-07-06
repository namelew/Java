package cc_execices;

import java.util.Scanner;

public class quest5 {
    public static void main(String[] args){
        Circulo c = new Circulo();
        Scanner input = new Scanner(System.in);

        int raio = input.nextInt();

        c.setRaio(raio);

        System.out.println("Raio: "+c.getRaio());
        System.out.println("Area: "+c.area());
        System.out.println("Perimetro: "+c.circu());

        input.close();

    }
}

class Circulo{
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public Circulo(){
        this.raio = 0;
    }

    public double area(){
        return (raio*raio)*3.14;
    }

    public double circu(){
        return (2*3.14)*raio;
    }

    public int getRaio(){
        return raio;
    }

    public void setRaio(int raio){
        if(raio < 0){
            this.raio = 0;
        }else{
            this.raio = raio;
        }
    }
}