import java.util.Scanner;
public class Classe01 {
	Scanner entrada = new Scanner(System.in);
	private String nome;
	private String endere�o;
	private String cpf;
	private String paisdestino;
	private String cidadedestino;
	private String datapartida;
	private String dataretorno;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPaisdestino() {
		return paisdestino;
	}

	public void setPaisdestino(String paisdestino) {
		this.paisdestino = paisdestino;
	}

	public String getCidadedestino() {
		return cidadedestino;
	}

	public void setCidadedestino(String cidadedestino) {
		this.cidadedestino = cidadedestino;
	}

	public String getDatapartida() {
		return datapartida;
	}

	public void setDatapartida(String datapartida) {
		this.datapartida = datapartida;
	}

	public String getDataretorno() {
		return dataretorno;
	}

	public void setDataretorno(String dataretorno) {
		this.dataretorno = dataretorno;
	}
	public void cadastrocliente() {
		System.out.println("!* CADASTRO DE CLIENTES *!");
		System.out.println("Informe o nome completo do clinte:");
		this.nome = entrada.next();
		System.out.println("Informe o endere�o do cliente:");
		this.endere�o = entrada.next();
		System.out.println("Informe CPF:");
		this.cpf = entrada.next();
		System.out.println("CADASTRO EFETUADO!");
	}
	public void cadastrodestino () {
		System.out.println("CADASTRO DE VIAJEM");
		System.out.println("Qual o pa�s do destino ?");
		this.paisdestino = entrada.next();
		System.out.println("Cidade:");
		this.cidadedestino = entrada.next();
		System.out.println("Data de partida:");
		this.datapartida = entrada.next();
		System.out.println("Retorno:");
		this.dataretorno = entrada.next();
		System.out.println("VIAJEM MARCADA COM SUCESSO");
		
	}
	public void consulta () {
		System.out.println("Cliente"+this.nome +"\n CPF:"+ this.cpf+"\n Endere�o: "+ this.endere�o+"\n Destino: "+this.paisdestino+" "+this.cidadedestino+"\n Data de partida:"+this.datapartida+"\n Retorno:"+this.dataretorno);
		
	}
	

}
