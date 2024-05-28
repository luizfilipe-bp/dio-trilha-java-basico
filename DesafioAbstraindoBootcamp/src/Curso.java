public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso [titulo=" + this.getTitulo() + ", descricao=" + this.getCargaHoraria() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    @Override
    public double calcularXP() {
        return getXpPadrao() * cargaHoraria;
    }

}