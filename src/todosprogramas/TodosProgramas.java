
package todosprogramas;
import java.util.Scanner;
//import javax.swing.JOptionPane;
public class TodosProgramas {    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int menuPrincipal = 1,menuSecundario ;        
        while (menuPrincipal != 0){
            System.out.println("    MENU PRINCIPAL");
            //JOptionPane.showMessageDialog(null,"Menu principal");
            System.out.println(" ");
            System.out.println("Digite uma opção");
            System.out.println(" ");
            System.out.println(" 1 - Área de um triangulo");
            System.out.println(" 2 - Média de quatro notas");
            System.out.println(" 3 - Preço final de um automóvel");
            System.out.println(" 4 - Gasto no cinema");
            System.out.println(" 5 - Quantidade de pisos por determinada área");
            System.out.println(" 6 - Média de altura de tres pessoas");
            System.out.println(" 7 - Converter Graus celcius em farenheith");
            System.out.println(" 8 - Média de 4 notas - aprovado/reprovado");
            System.out.println(" 9 - Ler tres números e informar qual é o maior");
            System.out.println("11 - Percentual de aumento conforme idade");
            System.out.println("12 - Valor da conta para consumo até 80Kw e a partir de 80Kw");
            System.out.println("14 - Números ímpares no intervalo de 1 até 100");
            System.out.println("15 - Números pares em determinado intervalo");
            System.out.println("16 - Número de pessoas acima de 50 anos");
            System.out.println(" ");System.out.print("Opção: ");
                menuSecundario=input.nextInt();
                //JOptionPane.showInputDialog(menuSecundario = input.nextInt());
            switch (menuSecundario){
  //----------------------------------------------------------------------------                                                 
                case 1:
                    System.out.println("Área de um triangulo");
                    double lado1,lado2,area;
       
        System.out.println("Informe o primeiro lado");
        lado1=input.nextDouble();
        System.out.println("Informe o segundo lado");
        lado2=input.nextDouble();
        
        area = (lado1*lado2)/2;
        
        System.out.println("A area do triangulo é "+area +" m²");
        
        
                    break;
//------------------------------------------------------------------------------                    
                    case 2:
                           double nota1,nota2,nota3,nota4,media;
        System.out.println("Média de quatro notas");
        System.out.println(" ");
        
        
        System.out.println("Digite a primeira nota");
        nota1=input.nextDouble();
        while (nota1 <0 || nota1>10){
            System.err.println("Digite vlor entre 0 e 10");
            nota1=input.nextDouble();
        }
        
        
        System.out.println("Digite a segunda nota");
        nota2=input.nextDouble();
        while (nota2 <0 || nota2>10){
            System.err.println("Digite vlor entre 0 e 10");
            nota2=input.nextDouble();
        }
        System.out.println("Digite a terceira nota");
        nota3=input.nextDouble();
        while (nota3 <0 || nota3>10){
            System.err.println("Digite vlor entre 0 e 10");
            nota3=input.nextDouble();
        }
        System.out.println("Digite a quarta nota");
        nota4=input.nextDouble();
        while (nota4 <0 || nota4>10){
            System.err.println("Digite vlor entre 0 e 10");
            nota4=input.nextDouble();
        }
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("A média das qutro notas é "+ media);
                    break;
//------------------------------------------------------------------------------
                    case 3:
                         double precoFabrica,valorFinal,impostos = 0.45,porcentagemRevendedor = 0.28;
        String marcaAutomovel;
        
        System.out.println("Preço final de um automóvel");
        System.out.println(" ");
        
        System.out.println("informe o preço de fábrica");
        precoFabrica=input.nextDouble();
        valorFinal=(precoFabrica*impostos)+(precoFabrica*porcentagemRevendedor)+precoFabrica;
        System.out.println("Valor de fábrica: "+ precoFabrica);
        System.out.println("Porcentagem de impostos: "+impostos*100+" %");
        System.out.println("Porcentagem do vendedor: "+porcentagemRevendedor*100+" %");
        System.out.println("O valor final do veículo é "+ valorFinal);

                    break;
//------------------------------------------------------------------------------                    
                    case 4:
       final double entrada= 4.00;
        int qtPessoas ;
        double valorGasto;
        String nomeFilme;
        
        System.out.println("Gasto no cinema");
        System.out.println(" ");
        System.out.println("Informe o nome so filme");
        nomeFilme=input.next();
        System.out.println("Quantas pessoas foram ao cinema");
        qtPessoas=input.nextInt();
        valorGasto=qtPessoas*entrada;
        System.out.println(qtPessoas+" pessoa foram assistir ao filme "+nomeFilme+ " e gastaram R$"+valorGasto);
        
        
                    break;
//------------------------------------------------------------------------------                    
                    case 5:
        final double piso= 0.3;
        double lado, qtPisos,area1;
        
        System.out.println("Quantidade de pisos por determinada área");
        System.out.println(" ");
        System.out.println("Informe a medida do um lado do quadrado");
        lado=input.nextDouble();
        
        area1=Math.pow(lado, 2);
        qtPisos=Math.ceil(area1/piso);
        System.out.println("Para se cobrir uma área de "+area1+" m² são necessários "+qtPisos+" pisos");
                    break;
//------------------------------------------------------------------------------                    
                    case 6:
         double altura1, altura2, altura3, mediaAltura;
        
        System.out.println("Média de altura de tres pessoas");
        System.out.println(" ");
        System.out.println("Informe a altura da primeira pessoa");
        altura1=input.nextDouble();
        System.out.println("Informe a altura da segunda pessoa");
        altura2=input.nextDouble();
        System.out.println("Informe a altura da terceira pessoa");
        altura3=input.nextDouble();
        
        mediaAltura = (altura1+altura2+altura3)/3;
        
        System.out.println("A média de altura das tres pessoas é "+mediaAltura);                 
                    break;
//------------------------------------------------------------------------------                    
                    case 7:
        double grausCelcius, farenheith;
        
        System.out.println("Converter Graus celcius em farenheith");
        System.out.println(" ");
        System.out.println("Informe a temperatura em celcius");
        grausCelcius=input.nextDouble();
        farenheith = (9 * grausCelcius + 160)/5;
        
        System.out.println(grausCelcius+" graus celcius convertidos para farenheith são "+farenheith);
                    break;
//------------------------------------------------------------------------------                    
                    case 8:
        double n1,n2,n3,n4,media1;
        
        System.out.println("Média de 4 notas - aprovado/reprovado");
        System.out.println(" ");
        
        System.out.println("Informe a nota A1");
        n1=input.nextDouble();
        while(n1<0 || n1>10){
            System.err.println("Notas só vão de 0 a 10");
             n1=input.nextDouble();
             }
        System.out.println("Informe a nota A2");
        n2=input.nextDouble();
        while(n2<0 || n2>10){
            System.err.println("Notas só vão de 0 a 10");
             n2=input.nextDouble();
             }
        System.out.println("Informe a nota A3");
        n3=input.nextDouble();
        while(n3<0 || n3>10){
            System.err.println("Notas só vão de 0 a 10");
             n3=input.nextDouble();
             }
        System.out.println("Informe a nota A4");
        n4=input.nextDouble();
        while(n4<0 || n4>10){
            System.err.println("Notas só vão de 0 a 10");
             n4=input.nextDouble();
             }
        media1= (n1+n2+n3+n4)/4;
        
        if (media1<6){
            System.err.println("O aluno obteve média "+media1+" e foi reprovado");
        }else{
            System.out.println("O aluno obteve média "+media1+" e foi aprovado");
        }
                    break;
//------------------------------------------------------------------------------                    
                    case 9:
        int na,nb,nc;
        System.out.println("Ler tres números e informar qual é o maior");
        System.out.println(" ");
        System.out.println("informe o valor de A");
        na=input.nextInt();
         System.out.println("informe o valor de B");
        nb=input.nextInt();
         System.out.println("informe o valor de C");
        nc=input.nextInt();
        
        if (na==nb || na==nc || nc==nb){
            System.err.println("Não podem existir valores repetidos");
        }else{
         if(na>nb && na>nc){
            System.out.println("O valor de A é maior que os valores de B e C");
        }else if(nb>na && nb>nc){
            System.out.println("O valor de B é maior que os valores de A e C");
        }else if(nc>na && nc>nb){
            System.out.println("O valor de C é maior que os valores de A e B");
        }
        }
                    break;
//------------------------------------------------------------------------------                     
                    case 10:
                         System.out.println("3");
                    break;
//------------------------------------------------------------------------------                     
                    case 11:
        int idadeAssociado;
        double valorMensalidade, precoFinal, porcentegem0a12 = 5,porcentagem13a21 = 8, porcentagem21mais = 10;
        System.out.println("Percentual de aumento conforme idade");
        System.out.println(" ");
        System.out.println("Informe a idade do associado");
        idadeAssociado=input.nextInt();
        System.out.println("Informe o valor da mensalidade");
        valorMensalidade=input.nextDouble();
        
        if (idadeAssociado >0 && idadeAssociado<=12){
            precoFinal = valorMensalidade * ((porcentegem0a12/100)+1);
            System.out.println("Idade do associado: "+idadeAssociado+" anos");
            System.out.println("Para associadodos com idade entre 0 e 12 anos ");
            System.out.println("Valor da mensalidade antigo: R$"+valorMensalidade);
            System.out.println("Percentual de aumento: "+porcentegem0a12+" %");
            System.out.println("Valor atualizado: R$"+precoFinal);
            System.out.println("Houve um aumenro de R$"+(precoFinal-valorMensalidade));
        }else if(idadeAssociado >12 && idadeAssociado<=21){
            precoFinal = valorMensalidade * ((porcentagem13a21/100)+1);
            System.out.println("Idade do associado: "+idadeAssociado+" anos");
            System.out.println("Para associadodos com idade entre 13 e 21 anos ");
            System.out.println("Valor da mensalidade antigo: R$"+valorMensalidade);
            System.out.println("Percentual de aumento: "+porcentagem13a21+" %");
            System.out.println("Valor atualizado: R$"+precoFinal);
            System.out.println("Houve um aumenro de R$"+(precoFinal-valorMensalidade));
        }else if (idadeAssociado >21){
            precoFinal = valorMensalidade * ((porcentagem21mais/100)+1);
            System.out.println("Idade do associado: "+idadeAssociado+" anos");
            System.out.println("Para associadodos com idade maior que 21 anos ");
            System.out.println("Valor da mensalidade antigo: R$"+valorMensalidade);
            System.out.println("Percentual de aumento: "+porcentagem21mais+" %");
            System.out.println("Valor atualizado: R$"+precoFinal);
            System.out.println("Houve um aumenro de R$"+(precoFinal-valorMensalidade));
        }else{
            System.err.println("Idade invalida");
    }
                    break;
//------------------------------------------------------------------------------                     
                    case 12:
        double consumoKw, consumoAte80 = 0.10, consumoMaisDe80 = 0.07, valorPago;
            System.out.println("Valor da conta para consumo até 80Kw e a partir de 80Kw");
                        System.out.println(" ");
            System.out.println("Informe o consumo de Kw utilizado");
        consumoKw=input.nextDouble();
        
        if (consumoKw > 0 && consumoKw <= 80){
        valorPago = consumoKw*consumoAte80;
            System.out.println("O valor a ser pago para consumo até 80 Kw é de R$"+consumoAte80+" por Kw totalizando R$"+valorPago);
        }else if(consumoKw > 80){
            valorPago=consumoKw*consumoMaisDe80;
            System.out.println("O valor a ser pago para consumo acima de 80 Kw é de R$"+consumoMaisDe80+" por Kw totalizando R$"+valorPago);
        }else{
            System.err.println("Vlor inválido");
        }                 
                    break;
//------------------------------------------------------------------------------                     
                    case 13:
                         System.out.println("6");
                    break;
                    case 14:
        System.out.println("Números ímpares no intervalo de 1 até 100"); 
        System.out.println("  ");
        int num=0;
        
        while(num<=100){
        if((num%2)!=0){
           System.out.println(num+" ");       
        }
        num=num+1;
        }
                    break;
//------------------------------------------------------------------------------                     
                    case 15:
        int numeroInicial,numeroFinal;
        System.out.println("Números pares em determinado intervalo");
        System.out.println(" ");
        System.out.println("Informe um número inicial");
        numeroInicial=input.nextInt();
        System.out.println("Informe um número final");
        numeroFinal=input.nextInt();
        
         while (numeroFinal < numeroInicial){
                 System.err.println("O número inicial não pode ser maio que o final");
            System.out.println("Digite novamente");
            System.out.println("Informe um número inicial");
        numeroInicial=input.nextInt();
        System.out.println("Informe um número final");
        numeroFinal=input.nextInt();
            
         }
        
        
       while (numeroInicial <=numeroFinal){
          
       if((numeroInicial%2)==0){
           System.out.println(numeroInicial+" ");       
       }
       numeroInicial=numeroInicial+1;
       }
        
                    break;
//------------------------------------------------------------------------------                     
                    case 16:
     int []idadePessoa = new int [10];
       int f,totalMais50 = 0;
       
        System.out.println("Número de pessoas acima de 50 anos");
        System.out.println(" ");
        System.out.println("Informe a idade");
        
        for(f=0;f<10;f++){
        idadePessoa[f]=input.nextInt();
        }
     for(f=0;f<10;f++){
                 
         if(idadePessoa[f] > 50){
         System.out.print(idadePessoa[f]+" - ");
         totalMais50 = totalMais50 + 1;          
         }         
     }
                        System.out.println(" ");
     if(totalMais50==1){
     System.out.println(totalMais50+" pessoa possui mais de 50 anos");   
    }else{
     System.out.println(totalMais50+" pessoas possuem mais de 50 anos"); 
     } 
                    break;
//------------------------------------------------------------------------------                     
                    case 17:
                         System.out.println("ex9");
                    break;
//------------------------------------------------------------------------------                     
                    case 18:
                         System.out.println("ex10");
                    break;
//------------------------------------------------------------------------------                     
                    default:
                        System.err.println("Opção inválida");
                                
            }
                
            System.out.println("  ");
            System.out.println("Digite 0 para sair ou qualquer valor para voltar ao menú principal");
            menuPrincipal=input.nextInt();
        }
        
    }
    
}
