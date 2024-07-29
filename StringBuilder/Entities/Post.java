package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date data;
    private String titulo;
    private String conteudo;
    private int likes;

    private List<Comment> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(Date data, String titulo, String conteudo, int likes) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(data) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comments:\n");
        for (Comment c : comentarios) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }

    public void agregarComentario(Comment comentario) {
        comentarios.add(comentario);
    }

    public void removerComentario(Comment comentario) {
        comentarios.remove(comentario);
    }
}