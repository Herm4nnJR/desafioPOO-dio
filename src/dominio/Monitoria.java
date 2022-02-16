package dominio;

import java.time.LocalDate;

public class Monitoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Mentoria{" + 
        "titulo=" + titulo + '\'' +
        ", descricao=" + descricao + '\'' + 
        ", data = " + data + 
        '}';
    }
}
