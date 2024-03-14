package projetolivro;

public class projetoLivro {
    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro[] l = new Livro[3];

       p[0] = new Pessoa("José", 22, "M");
       p[1] = new Pessoa("Maria", 18, "F");
       l[0] = new Livro("O Alquimista", "Paulo Coelho", 350, p[0]);
       l[1] = new Livro("O Vagabundo", "Jose  de Alencar", 400, p[1]);
       l[2] = new Livro("A Brisa e o Mar", "Manuel Antônio", 600, p[0]);
       

       l[0].abrir();
       l[0].folhear(200);
       System.out.println(l[0].detalhes());

    }
    
}
