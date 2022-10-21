public class Retangulo {

    private double base;
    private double altura;
    private double area;
    private double perimetro;
    private double diagonal;

    public Retangulo(double baseInicial, double alturaInicial) {
        if (baseInicial > 0)
            base = baseInicial;
        else
            base = 2;
        if (alturaInicial > 0)
            altura = alturaInicial;
        else
            altura = 1;
        if (base == altura)
            altura++;
    }
    public double getBase() { return base; }

    public double getAltura() { return altura;  }

    public void setBase(double novaBase){
        if(novaBase > 0) base = novaBase;
    }
    public void setAltura(double novaAltura){
        if(novaAltura > 0) altura = novaAltura;
    }
    public String toString(){
        return "Base = " + base + "\nAltura = " + altura + "\nÁrea: " + area() + "\nPerímetro: " + perimetro() + "\nDiagonal: " + diagonal();
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
       return 2 * (base + altura);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura,2));
        
    }
}
