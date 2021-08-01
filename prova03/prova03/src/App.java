import java.io.PrintStream;
import java.util.ArrayList;

import classes.Produtos;

public class App {

  public static <Vendas> void main(String[] args){
    int opcao, quantidadeVendida = 1; 

    do {
       System.out.print("Digite o código do produto:\n");
       System.out.print("Digite o nome do produto:\n");
       System.out.print("Digite o valor do produto:\n");
       System.out.print("Digite a quantidade do produto em estoque:\n");
       System.out.print("Data da venda:\n");
       System.out.print("Produto vendido:\n"); 
       System.out.print("Quantos produtos estão sendo vendidos?");


    

    }while (quantidadeVendida != 1);
    System.out.println("Inválido, Só pode vender uma mercadoria por vez");
    PrintStream in;
    in.close();

    int quantidadeEmEstoque;
    for (int i = 0; i < quantidadeEmEstoque; i++){
}

    char[] Codigo;
    System.out.print(Codigo);
    char[] Nome;
    System.out.print(Nome);
    char[] QuantidadeEmEstoque;
    System.out.print(QuantidadeEmEstoque);
    char[] Valor;
    System.out.print(Valor);
    

    if (quantidadeEmEstoque == 0) {
        System.out.println("\nNão tem produtos no estoque. ");
                Object in;
                voltarMenu(in);
                continue;
            }
          
            for (int i = 0; i < quantidadeEmEstoque; i++) {
                Object[] produtos;
                System.out.printf("Produto %d: %s\n", (i + 1), ((Produtos) produtos[i]).getNome());
            }

System.out.println("Qual é o código do produto a ser vendido?")
System.out.print(tela.getQuantidadeEmEstoque());

  private Tela menuPrincipal() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("**************\n");
    stringBuilder.append("Tela Principal\n");
    stringBuilder.append("**************\n");
    stringBuilder.append("1 - Cadastro de produtos\n");
    stringBuilder.append("2 - \n");
    stringBuilder.append("3 - Registro de venda\n");
    stringBuilder.append("0 - Sair\n\n");
    stringBuilder.append("Op");
    return new Tela(stringBuilder.toString(), 0);
  }

private Tela menuInternoCadastro() {
  StringBuilder stringBuilder = new StringBuilder();
  stringBuilder.append("**************\n");
  stringBuilder.append(" Fazer cadastro de produtos \n");
  stringBuilder.append("**************\n");
  stringBuilder.append("1 - Consultar\n");
  stringBuilder.append("2 - Adicionar\n");
  stringBuilder.append("0 - Voltar\n\n");
  stringBuilder.append("Op");
  return new Tela(stringBuilder.toString(), 1);
}

private Tela cadastroConsultar() {
  StringBuilder stringBuilder = new StringBuilder();
  stringBuilder.append("*************\n");
  stringBuilder.append("*** PRODUTOS - CONSULTA ***\n");
  stringBuilder.append("*************\n");
  return (Tela)new ConsultaProduto(stringBuilder.toString(), 11)

  private Tela registrarVenda() {
    return (Tela)new RegistroVenda("", 3, 
        obterRepositorio(11));

        private Tela relatorioProdutos() {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("**************\n");
          stringBuilder.append("Lista de produtos"\n");
          stringBuilder.append("**************\n");
          return (Tela)new RelatorioProduto(stringBuilder.toString(), 21);
        }
        
        private Tela relatorioVendasDetalhado() {
          return (Tela)new RelatorioVendaDetalhado("", 22);
        }
        
        private Tela relatorioVendasConsolidado() {
          return (Tela)new RelatorioVendaConsolidado("", 23);
        }