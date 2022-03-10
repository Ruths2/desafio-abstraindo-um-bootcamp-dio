package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    public Mentoria() {
        
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return " \n** Mentoria **\n" +
            "titulo = '" + getTitulo() + " '\n" +
            "descricao = '" + getDescricao() + " '\n" +
            "data = '" + data + " '";
        
    }
}
