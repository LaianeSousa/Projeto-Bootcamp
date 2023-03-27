package classes;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends Conteudo {

private final LocalDate dataInicial = LocalDate.now(); // data de hoje
private final LocalDate dataFinal = dataInicial.plusDays(45); // data de hoje + 45 dias
private Set<Conteudo> conteudos = new LinkedHashSet<>();
private  Set<Bootcamp>  devsInscritos = new HashSet<>();

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Bootcamp> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Bootcamp> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + getNome()+ '\'' +
                ", descrisao='" + getDescrisao() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return dataInicial.equals(bootcamp.dataInicial) && dataFinal.equals(bootcamp.dataFinal) && conteudos.equals(bootcamp.conteudos) && devsInscritos.equals(bootcamp.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicial, dataFinal, conteudos, devsInscritos);
    }
}
