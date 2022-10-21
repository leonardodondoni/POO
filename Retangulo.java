public class Retangulo {
    
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Retangulo(double baseInicial, double alturaInicial){
        if(baseInicial > 0 || alturaInicial > 0){
            base = baseInicial;
            altura = alturaInicial;
        }
        else{
            base = 1;
            altura = 1;
        }
    }
    public double area(){
        area = base * altura;
        return area;
    }
    public double perimetro(){
        perimetro = 2 * (base + altura);
        return perimetro;
    }
}
