import java.util.Scanner;

public class hamburgueria {
    public static void main(String[] args) { 

      Scanner ler = new Scanner (System.in);
      System.out.println("Selecione o que voce deseja:");

      boolean continuar = true;
      double totalPedido = 0;
      while (continuar) {

      


       MostrarCardapio();


      String produto = ler.nextLine();
      System.out.println("voce escolheu: " + produto );

      double preco = 0;
    

      if (produto.equalsIgnoreCase("Hamburguer")) {
          System.out.println("valor: R$ 30,00 ");
                        preco = 30.00;
          
        }

      else if (produto.equalsIgnoreCase("batata")){
          System.out.println("valor: R$ 15,00 ");
                        preco = 15.00;

        }  
      else if (produto.equalsIgnoreCase("refrigerante")){
          System.out.println("valor: R$ 8,50 ");
                        preco = 8.50; 
        }

      else if (produto.equalsIgnoreCase("Onion rings")){
          System.out.println("valor: R$18,00");
                       preco = 18.00;
         }

      else {
        System.out.println("produto nao encontrado");
        continue;
        
           }
         
      
      System.out.println("quantas unidades? ");
      int quantidade = 0;
      try {quantidade=ler.nextint();
        }  catch (ImputMisMatchException e) {
          Systen.out.println("digite um numero valido!)
           ler.nextLine();
          continue;
           }

      if (quantidade <= 0) {
          System.out.println("quantidade invalida");
          ler.nextLine();
          continue;
           }
     
      double total = CalcularPedido(preco, quantidade);

      System.out.println("voce escolheu: " + produto + quantidade);
      System.out.println("Total do pedido: R$:" + total );

      totalPedido = totalPedido + total;

      System.out.println("deseja continuar? (sim/nao)");
      ler.nextLine();
      String resposta = ler.nextLine();

      if (resposta.equalsIgnoreCase("sim")) {

      }
      else if (resposta.equalsIgnoreCase("nao")){
        continuar = false;

      }
      }
      
      System.out.println("total final do pedido: R$ " + totalPedido);



       }


        

       

      

    

     
  public static void MostrarCardapio () {
        System.out.println("Hamburguer - R$ 30,00");
        System.out.println("Batata - R$ 15,00 " );
        System.out.println("Refrigerante - R$ 8,50");
        System.out.println("Onion rings - R$ 18,00");
        

}
  public static void MostrarProduto(String produto, double preco) {
System.out.println(produto + " R$ " + preco);
  } 
  
  public static double CalcularPedido(double preco, int quantidade ) {
    return preco * quantidade;
    
    }
  }
       
       

