public class Cliente implements Autenticador {
	
	private int compras;
	private String senha;
	private String banco;
	private String nome;
	
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getCompras() {
		return compras;
	}
	
	public void setCompras(int compras) {
		this.compras = compras;
	}
	
	public String getBanco() {
		return banco;
		
	}

	public void setBanco(String banco) {
		this.banco = banco;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public Cliente(String nome, String senha, String banco, int compras) {
    	
    	this.nome = nome;
    	this.banco = banco;
    	this.compras = compras;
    	this.senha = senha;
    }
    
    @Override
    public String toString() {
    	return "Cliente{" +
    "nome= " + nome + '\'' +
    ", senha= " + senha +
    ", banco= " + banco + '\'' +
    ", compras= " + compras + 
    "}";
    }

    @Override
    public boolean autenticator(String senha) {
    	if (this.senha != senha) {
    		System.out.println("Não autenticado!");
    		return false;
    	}
    	else {
    		System.out.println("Autenticado!");
    		return true;
    	}
    }
    
}