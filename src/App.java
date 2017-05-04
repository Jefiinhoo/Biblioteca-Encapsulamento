import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando objetos
Scanner leitor = new Scanner(System.in); 
	Biblioteca livro1 = new Biblioteca();
		
	System.out.println("Informe Seu Nome: ");
	livro1.nomep  = leitor.next();
	
	System.out.println("Informe seu RG: ");
	livro1.setRg(leitor.nextDouble());  
	
	
	livro1.nome = "Coração Partido";

	livro1.autor = "Dias gomes";

	livro1.categoria = "Romance";

	livro1.codigo = 1001;

	livro1.getDiasdevolucao(); 

	livro1.disponibilidade = true;

	livro1.estado = "Novo";

	
	livro1.taxaPorCategoria();

	// acessando informações do objeto

	System.out.println("Olá Cliente: " + livro1.nomep + " De Rg " + livro1.getRg());
	System.out.println("-------------");
	
	System.out.println("O Seu Livro: " + livro1.nome);

	System.out.println("De Autor: " + livro1.autor);

	System.out.println("Categoria : " + livro1.categoria);

	System.out.println("Taxa : " + livro1.getTaxa());

	double multa = livro1.TaxaporAtraso(10);
		
		
		
		
		
		
		
		
		
	}
}