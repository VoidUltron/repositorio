package Principal;
public class ContaReceber extends Conta {
	String cliente;
	SituaçãoConta sit;
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		this.cliente = cliente.getNome();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	public void receber() {
		sit = SituaçãoConta.PAGA;
		System.out.println("Conta paga");
	}
	public void cancelar() {
		if(this.valor > 50000) {
			sit = SituaçãoConta.PENDENTE; 
			System.out.println("Conta esta pendente");
		}else {
			sit = SituaçãoConta.CANCELADA;
			System.out.println("Conta foi cancelada");
		}
		   
	}
public ContaReceber(){}
public void setCliente(Cliente cliente) {
	this.cliente = cliente.getNome();
}
}

