
package entender_conceitos;
import java.util.Random;
import java.util.Scanner;

public class Saint_Valley {


static int playerATKflash(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("ESCOLHA SEU ATAQUE");
        System.out.println("(1)Soco");
        System.out.println("(2)Chute");
        return input.nextInt();
    }

    static int inimigoATKflash(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }
    
    static void hpTelaflash( int hpPlayer,  int hpFlash){
        System.out.println("===========");
        System.out.println("HP PLayer  " + hpPlayer);
        System.out.println("HP Flash  " + hpFlash);
        System.out.println("===========");
    }

    static void batalhaflash(){
        
        int hpPlayer = 100;
        int hpFlash = 100;
        int escolhaATK ;
        while(hpPlayer >0 && hpFlash >0){
        escolhaATK = playerATKflash();
        hpTelaflash (hpPlayer, hpFlash);
        switch(escolhaATK){
            case 1:
                System.out.println("Você deu um soco!");
                hpFlash -=15;  
                break;
            case 2: 
                System.out.println("Você deu um chute!");
                hpFlash -=20;
                break;
            default:
                System.out.println("perdeu sua vez!");     
        }
        if(hpFlash>0){
            escolhaATK = inimigoATKflash();
            switch(escolhaATK){
                case 1:
                System.out.println("O Flash te deu um soco!");
                hpPlayer -=25;  
                break;
            case 2: 
                System.out.println("O Flash te deu um chute!");
                hpPlayer -=12;
                break;
                    
            } 
        }
        else{
            System.out.println("Você venceu o Flash!");
        }
    }if (hpPlayer<0){
           System.out.println("Você morreu");
}

}
/////////////////////////////////////////////////////////////////
 static int playerATKrobo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha seu ataque");
        System.out.println("(1)Soco");
        System.out.println("(2) Chute");
        return input.nextInt();
    }

    static int inimigoATKrobo(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }
    
    static void hpTelarobo( int hpPlayer,  int hpInimigo){
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Robô" + hpInimigo);
        System.out.println("===========");
    }
    static void batalharobo(){
        
        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK ;
        while(hpPlayer >0 && hpInimigo >0){
        escolhaATK = playerATKrobo();
        hpTelarobo (hpPlayer, hpInimigo);
        switch(escolhaATK){
            case 1:
                System.out.println("Você deu um soco!");
                hpInimigo -=15;  
                break;
            case 2: 
                System.out.println("Você deu um chute!");
                hpInimigo -=20;
                break;
            default:
                System.out.println("perdeu sua vez!");     
        }
        if(hpInimigo>0){
            escolhaATK = inimigoATKrobo();
            switch(escolhaATK){
                case 1:
                System.out.println("O robô deu um soco!");
                hpPlayer -=20;  
                break;
            case 2: 
                System.out.println("O robô te deu um chute!");
                hpPlayer -=15;
                break;
                    
            } 
        }
        else{
            System.out.println("Você venceu parabéns!");
        }
    }if (hpPlayer<0){
            System.out.println("Você morreu");
}




}






    
    public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
    int caminho;

       //Inicio do jogo
        System.out.println("Um dia normal de manhã, você está indo até a estação de trem para ir entregar curriculo nas outras cidades,\nao chegar na estação você percebe que ela está desativada.");
        System.out.println("Ao lado da bilheteria à uma placa com um aviso:");
        System.out.println("  'O sinal da rede Google foi cortado, previsão de retorno às 16hrs' ");
        System.out.println("\n Saindo da estação,indo em direção na praça no centro da cidade, você encontra seu velho amigo de infância, o Jorge.\n");

        //fala do Jorge 
        System.out.println("Jorge: Eai personagem, quanto tempo, como está ?");    
        System.out.println("      Parece que a Tesla está desenvolvendo uma nova tecnologia, e roubou hoje cedo o motor de rede do laboratório Google.\n      Todos nós funcionarios fomos despedidos pelo acontecimento.\n      Olha personagem, eu sinto um mal presentimento por isso, irei tentar encontrar outro emprego, boa sote!");
        System.out.println("Jorge foi embora.");
        System.out.println("\n Um pouco a frente, um mendigo te para e fala: \n ");  

        //fala do mendigo
        System.out.println("Mendigo: Ohhh. Você pode me ajudar ? Estou com muita fome,\n         pegue aqui essas pilhas, em troca eu queria um sorvete, por favor senhor!!!!");
        System.out.println("Você recebeu 12 pilhas.\n");

        //indo a sorveteria
        System.out.println("Usuario: Ta bom, vou até a sorveteria.");
        System.out.println("Você segue em direção a sorveteria...\n");
        
        
        
        
    //Caminho = Leste
    
    int t;
        System.out.println("     *---Sorveteria Cold Stone Creamey---*");
        System.out.println("Você  chega e entra na  sorveteria.");
        System.out.println("Atendente: Bem Vindo à sorveteria Cold Stone Creamey. Qual será seu pedido ?\n");
        System.out.println("Antes de finalizar o pedido, seu antigo rival de escola, o Flash Mason, chega na sorveteria.\n ");

       //Dialogos
        System.out.println("Flash: Ora, ora, ora, se não é o usuario, ainda trabalhando para sua qeurida falida empresa Google ?\n");
        System.out.println("Usuario: Olá Flash, e não trabalho mais com a Google.\n");
        System.out.println("Flash: Finalmente aprendeu, essa tecnologia limitada de vocês, aprendam com a Tesla, acabamos de criar um robo humanoide de guerra perfeito.");
        System.out.println("______________________________________________________________________________________________________________________________________________________\n");
        //Explicação
        System.out.println("'Na escola, Flash era um dos alunos mais populares da escola e o meu melhor amigo, \n depois da crise climatica do mundo resolvemos trabalhar na aréa de tecnologia para podermos evoluir tecnologicamente \n e criar novos tipos de inteligencia artificial para o mundo, ");
        System.out.println(" mas tudo mudou quando ele entrou para a Tesla, eu era da Google na época,\n e no ultimos anos, a Tesla veio crescendo com suas novas tecnologias e se tornou a maior empresa de tecnologia de armas do mundo,\n em um dos seus experimentos, Flash era o voluntario que iria testa a mais nova criação da Tesla, \n um braço robotico movido a baterias com diversos sensores e que disparava um laser que poderia derreter até mesmo os aços mais fortes da terra.");
        System.out.println(" Na época, esses braços seriam usados como arma para os policiais da cidades, para torna-los como policiais 'robo-cop',\n mas os experimentos não deram certo e o projeto foi deixado de lado,\n Flash é o único que tem esse tipo de braço.");
        System.out.println("______________________________________________________________________________________________________________________________________________________\n ");
        //dialogos
        System.out.println("Usuario: Como vocês conseguiram energia suficiente para criar esse robo ?");
        System.out.println("Flash: Não foi dificil, roubamos um motor de rede da torre do laboratório Google e utilizamos como nucléo para nosso robo. ");
        System.out.println("Usuario: O que ?? Você acha que isso ficará assim ? Vou contar ao diretor da empresa o que vocês fizeram.");
        System.out.println("Flash: Você não vai a lugar nenhum! \n ");

        //inicio da luta
        int u;
        System.out.println("Flash tira sua jaqueta e com seu braço robotico te chama pra brigar \n");
    do{ System.out.println(" VOCÊ ESTÁ PRONTO PRA LUTA ?");
        System.out.println("Sim=1 || Não=0");
         u=input.nextInt();
    }while (u>1 || u<1);

         batalhaflash();

   

    //ganhar do Flash
    
        
        System.out.println("Você recebeu 4 baterias\n");

        //Voltar para a praça
        System.out.println("Usuario: preciso ir até o edificio da Tesla, que tipo de arma eles criaram ? \nPor que estão fazendo isso ?\n");
        System.out.println("Usuario volta para a praça e segue para Oeste\n");
    
    
       // Oeste 
        int x;
        System.out.println("Você chega no edificio da Tesla \n");
        System.out.println("Entrando no edificio, no salão principal, você segue para uns dos computadores da Tesla.");

        //ligar o computador
    do{ System.out.println("VOCÊ QUER LIGAR O COMPUTADOR ?");
        System.out.println(" Sim= 1 \n Não= 0");
         x=input.nextInt();
    }while (x>1 || x<1);
    int a;
        System.out.println("Você liga o computador \n");
        System.out.println("Usuario: preciso achar esse robo pelas cameras de segurança antes que seja tarde de...");
        System.out.println("Usuario: que barulho foi esse ?\n ");
        System.out.println("Você se vira e vê o robo humanoide no salão principal \n");
        System.out.println("Usuario: Aquele deve ser o robo que o Flash falou, o que é aquilo no peito dele ? \nÉ o motor de rede que a Tesla roubou da Google, \nTenho que pega-lo devolta! \n");
     

        int i;
        System.out.println("VOCÊ ESTÁ PRONTO PRA LUTA ?");
    do{System.out.println("Sim=1 || Não=0");
         i=input.nextInt();
    }while(i>1 || i<1);
       
            batalharobo();
        
     //Ganhou do Robo
      int b;
        System.out.println("Você ganhou do robo");
        System.out.println("Você recebeu 1 motor de rede \n");


        //Caminho Norte
        System.out.println("Você volta para a praça e segue para o caminho Norte\n");
        System.out.println("Você entra no laboratório da Google e segue em direção a torre que está desativada, \nna lateral direita da torre existe uma combinação que diz:");
        System.out.println(" 12 PILHAS + 4 BATERIAS + 1 MOTOR \n");
    
        //Combinação final 
    do{ System.out.println("VOCÊ TEM ESSA COMBINAÇÃO ?");
        System.out.println("Sim= 1");
         b=input.nextInt();
    }while (b>1 || b<1);
        System.out.println("Você ativa a torre da Google \n");
        System.out.println("No elevador a sua esquerda, sai um senhor de cadeira de rodas, ele é o CEO da Google.\n");

        //dialogos
        System.out.println("Sundar Pichai: Você conseguiu ativar a torre meu jovem, mas isso foi só o começo, \na Tesla está desenvolvendo uma nova Inteligência Artificial, mas essa tecnologia não são deles, é muito mais avançado, alguém está fornecendo a tecnologia para criação de robos em formas de armas com a nova I.A, \nvocê deve impedi-los, soube que essa tecnologia tem como matérias-primas recursos de outras cidades.");
        System.out.println("Vá e descubra o que está acontecendo\n");
        System.out.println("Você sai do laboratório e segue para a estação de trem e segue para a proxima cidade."); 
        System.out.println("--------------FIM---------------");
        

        //FIM

      
 } 
    
}
