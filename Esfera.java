public class Esfera {

    private double raio;
    private double volume;
    private double area;

    public Esfera(double raioInicial) {
        if (raioInicial > 0)
            raio = raioInicial;
        else
            raio = 1;
    }

    public double volume() {
        volume = 4 / 3.0 * Math.PI * Math.pow(raio, 3);
        return volume;
    }

    public double area() {
        area = 4 * Math.PI * Math.pow(raio, 2);
        return area;
    }
}
