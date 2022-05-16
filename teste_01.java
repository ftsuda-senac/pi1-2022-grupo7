
package entender_conceitos;
import java.util.Scanner;

public class teste_01 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
                int a, b,c, x;              //inicio do mundo 
                //1 leste 
               // 2 oeste
               // 3 norte
             System.out.println("***SEJA BEM VINDO A SAINT VALLEY***");
             System.out.println("chega na cidade e caminha até a praça");
             System.out.println("existem 3 caminhos, Leste, que te levará a sorveteria ");
             System.out.println("a caminho Oeste, te levará ao edificio da amazon");
             System.out.println("E por ultimo, caminho Norte, para um grande laboratório");
             
        do{ System.out.println(" PARA QUAL CAMNHO VOCÊ QUER SEGUIR ?");
            System.out.println("Leste= 1");
            System.out.println("Oeste= 2");
            System.out.println("Norte=3");
            System.out.println("DIGITE:");
                x= input.nextInt();
          }while (x>3 || x<=0);

            if (x==1){ //Leste
                  
                  int t;
                    System.out.println("Voce segue para sorveteria");
            do{ System.out.println("Na sorveteria, vc enfrenta um policial robo-cop");
                    System.out.println("Ganhou(1) ou perdeu (0) ?");
                t= input.nextInt();
             }while (t >1 || t <0);

         if (t==1){ //ganhaar do robo cop
                       int o;
                    System.out.println("Voce ganhou do robô=cop");
                    System.out.println("Você recebeu 4 baterias");
                    System.out.println("Você volta para a praça");
                    
                  do{ System.out.println("E agora, para qual caminho quer seguir ?");
                   System.out.println("Oeste= 1 \n" + "Norte= 2");
                  o = input.nextInt();
             }while ( o>=3 || o<=0);
              
         if (o==1){ //Oeste (1)
                   int w;
                   System.out.println("Voce chegou no Edificio da Tesla");
            do{ System.out.println("Luta contra robo humanoide");
                    System.out.println("Ganhou (1) ou Perdeu (0)");
                   w= input.nextInt();
            }while (w >1 || w <0);
                
             switch (w){//caso vença
                case '0':
                     System.out.println("Você morreu");

                case '1' :
                     System.out.println("Você venceu o robô humanoide");
                     System.out.println("Você recebeu um motor de rede");
                     System.out.println("Você volta a praça e segue para o Norte");
                     //Norte (1)
                  int r;
                    System.out.println("A sua frente esta o laboratório abandonado da google");
                    System.out.println("Você entra e vê a torre de rede desativada");
            do{ System.out.println("Olhando a lateria direita da torre, você vê um codigo:");
                    System.out.println("12 pilhas + 4 baterias + 1 motor"); 
                    System.out.println("Você tem a combinação ?");
                    System.out.println("Sim= 1");
                    System.out.println("Não= 0");
                  r= input.nextInt();
            }while (r >1 || r <0);
                   
            if (r==1){
                    System.out.println("Você coloca a combinação na maquina");
                    System.out.println("Você ativou a torre de rede");
                    System.out.println("A estação voltou a funcionar");
                    System.out.println("Proxima cidade");
           }else
                     System.out.println("Impossivel");

        
     }                 
                      

                    

            
        }else if (o==2); //caso escolha Norte
                    int y;
                System.out.println("A sua frente esta o laboratório abandonado da google");
                System.out.println("Você entra e vê a torre de rede desativada");
            do{ System.out.println("Olhando a lateria direita da torre, você vê um codigo:");
                System.out.println("12 pilhas + 4 baterias + 1 motor"); 
                System.out.println("Você tem a combinação ?");
                System.out.println("Não= 0");
                  y= input.nextInt();

            }while (y >0 || y <0);

                System.out.println("Você volta para a praça e segue para Oeste");   //Oeste da opção norte

                 int i;
                System.out.println("Voce chegou no Edificio da Tesla");
            do{ System.out.println("Luta contra robo humanoide");
                System.out.println("Ganhou (1) ou Perdeu (0)");
                   i= input.nextInt();
            }while (i >1 || i <0);
                
            if (i==1){ //caso vença
                     System.out.println("Você venceu o robô humanoide");
                     System.out.println("Você recebeu um motor de rede");
                     System.out.println("Você volta a praça e segue para o Norte");
                     //Norte (1)
                  int r;
                    System.out.println("A sua frente esta o laboratório abandonado da google");
                    System.out.println("Você entra e vê a torre de rede desativada");
            do{ System.out.println("Olhando a lateria direita da torre, você vê um codigo:");
                    System.out.println("12 pilhas + 4 baterias + 1 motor"); 
                    System.out.println("Você tem a combinação ?");
                    System.out.println("Sim= 1");
                    System.out.println("Não= 0");
                  r= input.nextInt();
            }while (r >1 || r <0);
                   
            if (r==1){
                    System.out.println("Você coloca a combinação na maquina");
                    System.out.println("Você ativou a torre de rede");
                    System.out.println("A estação voltou a funcionar");
                    System.out.println("Proxima cidade");
           }else if (r==0)
                     System.out.println("Impossivel");
            
        }else if (i==0);
                     System.out.println("Você morreu");
                


             }else if (t==0) //morreu lua leste
                    System.out.println("Você morreu");


        }else if(x==2){ //oeste
                    int t;
                    System.out.println("Voce chegou no Edificio da Tesla");
            do{ System.out.println("Luta contra robo humanoide");
                    System.out.println("Ganhou (1) ou Perdeu (0)");
                   t= input.nextInt();
            }while (t >1 || t <0);
                
            if (t==1){ 
                     System.out.println("Você venceu o robô humanoide");
                     System.out.println("Você recebeu um motor de rede");
                     System.out.println("Você volta a praça");
            
            }else if (t==0)
                     System.out.println("Você morreu");
                

        }else if (x==3){ //norte
            int t;
                    System.out.println("A sua frente esta o laboratório abandonado da google");
                    System.out.println("Você entra e vê a torre de rede desativada");
            do{ System.out.println("Olhando a lateria direita da torre, você vê um codigo:");
                    System.out.println("12 pilhas + 4 baterias + 1 motor"); 
                    System.out.println("Você tem a combinação ?");
                    System.out.println("Sim= 1");
                    System.out.println("Não= 0");
                  t= input.nextInt();
            }while (t >1 || t <0);
                   
            if (t==1){
                    System.out.println("Você coloca a combinação na maquina");
                    System.out.println("Você ativou a torre de rede");
                    System.out.println("A estação voltou a funcionar");
                    System.out.println("Proxima cidade");
           }else if (t==0)
                     System.out.println("Você morreu");
} System.out.println("*****FIM DO TESTE*****");
          
       
    }
    
}

