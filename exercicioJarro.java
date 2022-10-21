public class exercicioJarro {
    public static void main(String args[]){

        Jarro j1 = new Jarro(4);
        Jarro j2 = new Jarro(3);

        j2.encher();
        j2.despejar(j1);
        j2.encher();
        j2.despejar(j1);
        j1.esvaziar();
        j2.despejar(j1);

        System.out.println(j1.getLitros());
        System.out.println(j2.getLitros());

    }
}
