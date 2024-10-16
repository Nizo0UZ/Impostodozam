
package imposto3;

import java.util.Scanner;

public class Imposto3 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
         double sal, serv, cap, med, edu;
         
         System.out.println("Renda anual com salário:");
         sal = ler.nextDouble();
         System.out.println("Renda anual com prestação de serviço:");
         serv = ler.nextDouble();
         System.out.println("Renda anual com ganho de capital:");
         cap = ler.nextDouble();
         System.out.println("Gastos médicos:");
         med = ler.nextDouble();
         System.out.println("Gastos educacionais:");
         edu = ler.nextDouble();
         
         if(sal < 0 || serv < 0 || cap < 0 || med < 0 || edu < 0){
             System.out.println("ERRO! VALOR(ES) INVÁLIDO(S)");
         } else{
         //calcular imposto salario
         double salmes, impsal;
         
         salmes = (sal / 12);
         if(salmes < 3000){
             impsal = 0;
         } else if(salmes >= 3000 && salmes < 5000){
             impsal = sal*0.1;
         } else {
             impsal = sal*0.2;
         }
         
         //impostos sobre serviços
         double impserv;
         
         impserv = serv*0.15;
         
         //impostos sobre capital 
         double impcap;
         
         impcap = cap*0.2;
         
         //Maximo dedutivel e gasto dedutivel 
         double max, gastos;
         
         max = (impsal + impserv + impcap)*0.3;
         
         gastos = med + edu;
         
         //IMPOSTO BRUTO, ABATIMENTO E DEVIDO
         double total, abat, devido;
         
         total = impsal + impserv + impcap;
         
         if(gastos >= max){
             abat = max;
         } else if(gastos < max){
             abat = med + edu;
         }else{
             abat = 0;
         }
         
         devido = total - abat;
         
         System.out.println("\n##RELATÓRIO DE IMPOSTO DE RENDA##\n");
         System.out.println("\nCONSOLIDADO DE RENDA\n");
         
         System.out.printf("Imposto sobre salário: %.2f\n", impsal);
         System.out.printf("Renda anual com prestação de serviço: %.2f\n", impserv);
         System.out.printf("Renda anual com ganho de capital: %.2f\n", impcap);
         
         System.out.println("\nDEDUÇÕES\n");
         System.out.printf("Máximo dedutível: %.2f\n", max);
         System.out.printf("Gastos dedutíveis: %.2f\n", gastos);
         
         System.out.println("\nRESUMO\n");
         System.out.printf("Imposto bruto total: %.2f\n", total);
         System.out.printf("Abatimento: %.2f\n", abat);
         System.out.printf("Imposto devido: %.2f\n", devido);
        
         // Arrumar o numero negativo, variaveis e o sal 
    }
    }
}
