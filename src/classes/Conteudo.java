package classes;

public abstract class Conteudo {
    protected static final double  XP_PADRAO = 10d;

    private String nome;
    private String descrisao;

    public abstract double calcularXP(); // esse método nao pode ser instanciada pois o objetivo
    // é extender para outras classses seus métdos e atributos.
    // uma vez que essas classes tem os mesmos métodos e atributos.
    // EVITAR REPERTIÇÃO DE CÓDIGO.

    public String getNome() {
        return nome;
    }

    public void setNome(String titulo) {
        this.nome= titulo;
    }

    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }








}
