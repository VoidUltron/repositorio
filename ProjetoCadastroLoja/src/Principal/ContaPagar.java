package Principal;
public class ContaPagar extends Conta {
	String fornecedor;
	SituaçãoConta sit;
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.fornecedor = fornecedor.getNome();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	public void pagar() {
		sit = SituaçãoConta.PAGA;
        System.out.println("Conta foi quitada");
	}
    public ContaPagar(){}
   
public void setFornecedor(Fornecedor fornecedor) {
	this.fornecedor = fornecedor.getNome();
}
}