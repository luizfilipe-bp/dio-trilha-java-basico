import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
    
    @Override
    public String toString() {
        return "Mentoria [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", data=" + data + "]";
    }

    @Override
    public double calcularXP() {
        return getXpPadrao() + 20d;
    }
}
