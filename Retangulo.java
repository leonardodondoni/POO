public class Retangulo {

    private double base;
    private double altura;
    private double area;
    private double perimetro;

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
        return "Base = " + base + "\nAltura = " + altura;
    }

    public double area() {
        area = base * altura;
        return area;
    }

    public double perimetro() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }
}
