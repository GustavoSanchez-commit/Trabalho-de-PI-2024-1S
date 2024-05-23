package model;

public class Usuario {
    private int id;
    private String username;
    private String senha;
    private String perfil;

    public Usuario(int id, String username, String senha, String perfil) {
        this.id = id;
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
    }

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

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + username + ", senha=" + senha + ", perfil=" + perfil + '}';
    }
    
}
