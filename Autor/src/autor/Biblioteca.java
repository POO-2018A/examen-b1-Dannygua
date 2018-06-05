
package autor;

public class Biblioteca {
    
   
    private String titulo;
    private int ano;
    private Autor [] autor;
    private boolean favorito;
    int u =1;
  

    public Biblioteca(String titulo, int ano, Autor[] autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String info = "titulo: " + titulo + "\n" + "anio: " + ano + "\n";
        
                for (int i = 0; i < u; i++) {
            info+= ( "Autor "+ (i+1) + " \n" +this.autor[i]);
        }
        u++;
        return info;
        
        
        
    }

  
}
