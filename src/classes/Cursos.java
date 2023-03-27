package classes;

import java.time.LocalDate;

public class Cursos extends Conteudo {

    private LocalDate data;


    @Override  // sobrescretida do método abstrato;
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "data=" + data +
                ", nome='" + getNome()+ '\'' +
                ", descrisao='" + getDescrisao() + '\'' +
                '}';
    }
}
