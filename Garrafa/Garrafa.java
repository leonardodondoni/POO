package Garrafa;

public class Garrafa {
    
    private double raio1, raio2, altura1, altura2,altura3;

    public Garrafa(double raio1Inicial, double raio2Inicial, double altura1Inicial, double altura2Inicial, double altura3Inicial){
        if(raio1Inicial > 0) raio1 = raio1Inicial;
        else raio1 = 1;
        if(raio2Inicial > 0) raio2= raio2Inicial;
        else raio2 = 1;
        if(altura1Inicial > 0) altura1 = altura1Inicial;
        else altura1 = 1;
        if(altura2Inicial > 0) altura2 = altura2Inicial;
        else altura2 = 1;
        if(altura3Inicial > 0) altura3 = altura3Inicial;
        else altura3 = 1;
    }
    
    public double getRaio1() {
        return raio1;
    }
    public double getRaio2() {
        return raio2;
    }
    public double getAltura1() {
        return altura1;
    }
    public double getAltura2() {
        return altura2;
    }
    public double getAltura3() {
        return altura3;
    }
    public void setRaio1(double novoRaio1){
        if(novoRaio1 > 0) raio1 = novoRaio1;
    }
    public void setRaio2(double novoRaio2){
        if(novoRaio2 > 0) raio2 = novoRaio2;
    }
    public void setAltura1(double novaAltura1){
        if(novaAltura1 > 0) altura1 = novaAltura1;
    }
    public void setAltura2(double novaAltura2){
        if(novaAltura2 > 0) altura2 = novaAltura2;
    }
    public void setAltura3(double novaAltura3){
        if(novaAltura3 > 0) altura3 = novaAltura3;
    }
    public double volume(){
        return (Math.PI * raio2 * altura1) + (Math.PI * ((Math.pow(raio2,2) + raio1 * raio2 + Math.pow(raio2,2) * altura1 / 3)));
    }
}
    