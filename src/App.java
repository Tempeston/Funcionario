
public class App {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Marcos");
		f.setSalario(1000);
		f.aumentaSalario();
		System.out.println("Funcionario = > Nome: " +f.getNome() + " Salario: " + f.getSalario());
	
		Gerente g = new Gerente();
		g.setNome("Manuel");
		g.setSalario(2000);
		g.aumentaSalario();
		System.out.println("Funcionario = > Nome: " +g.getNome() + " Salario: " + g.getSalario());
	
		Programador p = new Programador();
		p.setNome("Matheus");
		p.setSalario(32000);
		p.aumentaSalario();
		System.out.println("Funcionario = > Nome: " +p.getNome() + " Salario: " + p.getSalario());
		
		
		AnalistaDeSistemas a = new AnalistaDeSistemas();
		a.setNome("Escravo");
		a.setSalario(10);
		a.aumentaSalario();
		System.out.println("Funcionario = > Nome: " +a.getNome() + " Salario: " + a.getSalario());
		
	
	}

}
