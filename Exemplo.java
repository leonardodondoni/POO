public class Exemplo {
    public static void main(String args[]){

        Square casa = new Square();
        Triangle teto = new Triangle();
        
        casa.makeVisible();
        casa.changeSize(130);
        casa.changeColor("blue");
        casa.moveVertical(100);

        teto.makeVisible();
        teto.changeSize(130, 130);
        teto.changeColor("black");
        teto.moveHorizontal(63);
        
        


    }
}
