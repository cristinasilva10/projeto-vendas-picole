package model;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente("Nome", "0000000000");
		Produto prod = new Produto("Produto", 2.0);
		ItemVenda  Venda = new ItemVenda();
		Venda venda = new Venda ();
		cliente.setNome("nome1");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEndereco());
	    System.out.println(prod.getDescricao());
	   
	}

}
