package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
   
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
        
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return " \n** Curso **\n" +
                "titulo = '" + getTitulo() + " '\n" +
                "descricao = '" + getDescricao() + " '\n" +
                "cargaHoraria = '" + cargaHoraria + " '";
                
    }
}
