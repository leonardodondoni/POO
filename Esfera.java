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

    public double getRaio() {
        return raio;
    }

    public void setRaio(double novoRaio) {
        if (novoRaio > 0)
            raio = novoRaio;
    }

    public String toString() {
        return "Raio: " + raio;
    }

    public double volume() {
      return 4 / 3.0 * Math.PI * Math.pow(raio, 3);
    }

    public double area() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}
