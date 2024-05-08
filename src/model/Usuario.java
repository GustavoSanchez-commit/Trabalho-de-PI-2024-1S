
package model;


public class Usuario {
    private int id;
    private String username;
    private String senha;
    private String perfil;

    // Construtor
    public Usuario(int id, String username, String senha, String perfil) {
        this.id = id;
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public String getPerfil() {
        return perfil;
    }
}
