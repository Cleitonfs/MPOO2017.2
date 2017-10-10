import java.util.Calendar;

public class Print {
    private String nome;

    Calendar data = Calendar.getInstance();
    int hora = data.get(Calendar.HOUR_OF_DAY);
    int min = data.get(Calendar.MINUTE);
    int seg = data.get(Calendar.SECOND);

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void imprimir() {
        System.out.println(hora + ":" + min + ":" + seg + " -  Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns!");
    }
}
