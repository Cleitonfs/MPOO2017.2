import java.util.Calendar;

public class Application {

    public static void main(String[] args) {

        //System.out.println(hora + ":" + min + ":" + seg);

        Print helloworld = new Print();
        helloworld.setNome("Genilton");
        helloworld.imprimir();

        Print helloworld2 = new Print();
        helloworld2.setNome("Cleiton");
        helloworld2.imprimir();

        Print helloworld3 = new Print();
        helloworld3.imprimir();
    }
}
