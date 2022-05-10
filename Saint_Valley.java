
package entender_conceitos;
import java.util.Scanner;

public class Saint_Valley {

    
    public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
    int caminho;

       //Inicio do jogo
        System.out.println("Um dia normal indo para o trabalho, o personagem ao chegar na estação percebe que ela está desativada.");
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
        System.out.println("Você recebeu 12 pilhas.");

        //caminhos 
        System.out.println("Você está na praça no centro da cidade e existe 3 caminhos:");
        System.out.println("Caminho Leste, que te levará a sorveteria ");
        System.out.println("Caminho Oeste, te levará ao edificio da Tesla");
        System.out.println("E por ultimo, caminho Norte, para um grande laboratório");
             
    do{ System.out.println(" PARA QUAL CAMNHO VOCÊ QUER SEGUIR ?");
        System.out.println("Leste= 1");
        System.out.println("Oeste= 2");
        System.out.println("Norte=3");
        System.out.println("DIGITE:");
            caminho= input.nextInt();
     }while (caminho>3 || caminho<=0);
        
    //Caminho = Leste
    if(caminho==1){
    int t;
        System.out.println("Você entra na  sorveteria.");
        System.out.println("   Atendente: Bem Vindo à sorveteria Cold Stone Creamey. Qual será seu pedido ?");
        System.out.println("Antes de finalizar o pedido, seu antigo rival de escola, o Flash Mason, chega na sorveteria.\n ");

       //Dialogos
        System.out.println("Flash: Ora, ora, ora, se não é o usuario, ainda trabalhando para sua falida empresa Google ?\n");
        System.out.println("Usuario: Olá Flash, e não trabalho mais com a Google.\n");
        System.out.println("Flash: Finalmente aprendeu, essa tecnologia limitada de vocês, aprendam com a Tesla, acabamos de criar um robo humanoide de guerra perfeito. \n");

        //Explicação
        System.out.println("'Na escola, Flash era um dos alunos mais populares da escola e o meu melhor amigo, \n depois da crise climatica do mundo resolvemos trabalhar na aréa de tecnologia para podermos evoluir tecnologicamente \n e criar novos tipos de inteligencia artificial para o mundo, ");
        System.out.println("mas tudo mudou quando ele entrou para a Tesla, eu era da Google na época,\n e no ultimos anos, a Tesla veio crescendo com suas novas tecnologias e se tornou a maior empresa de tecnologia de armas do mundo,\n em um dos seus experimentos, Flash era o voluntario que iria testa a mais nova criação da Tesla, \n um braço robotico movido a baterias com diversos sensores e que disparava um laser que poderia derreter até mesmo os aços mais fortes da terra.'\n");
        // falar sobre os policiais robo-cops

        //dialogos
        System.out.println("Usuario: Como vocês conseguiram energia suficiente para criar esse robo ?");
        System.out.println("Flash: Não foi dificil, roubamos um motor de rede da torre do laboratório Google e utilizamos como nucléo para nosso robo. ");
        System.out.println("Usuario: O que ?? Você acha que isso ficará assim ? Vou contar ao diretor da empresa o que vocês fizeram.");
        System.out.println("Flash: Você não vai a lugar nenhum! \n ");

        //inicio da luta
        System.out.println("Flash tira sua jaqueta e com seu braço robotico te chama pra brigar \n");
   do{  System.out.println("Você enfrenta Flash");
        System.out.println("Ganhou(1) ou perdeu (0) ?");
             t= input.nextInt();
    }while (t >1 || t <0);

    if (t==1){ //ganhar do Flash
    int o;
        System.out.println("Você ganhou do Flash");
        System.out.println("Você recebeu 4 baterias");

        //Voltar para a praça
        int caminho2;
        System.out.println("Usuario: preciso ir até o edificio da Tesla, que tipo de arma eles criaram ? \n         Por que estão fazendo isso ?");
        System.out.println("Usuario volta para a praça");
    do{ System.out.println("PARA QUAL CAMINHO DESEJA SEGUIR ?");
        System.out.println("Oeste= 1");
        System.out.println("Norte= 2");
         caminho2= input.nextInt();
    }while (caminho2 >2 || caminho2<1);
    
    // Oeste (1)
    if (caminho2== 1){
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
        System.out.println("Usuario: Aquele deve ser o robo que o Flash falou, o que é aquilo no peito dele ? \n  É o motor de rede que a Tesla roubou da Google, \n Tenho que pega-lo devolta! \n");
     
        //Luta contra robo 
    do{ System.out.println("Você enfrenta o robo");
        System.out.println("Ganhou (1) ou Perdeu (0) ?");
         a= input.nextInt();
    }while(a>1 || a<0);
        
    if( a==1){ //Ganhou do Robo
      int b;
        System.out.println("Você ganhou do robo");
        System.out.println("Você recebeu 1 motor de rede \n");
        //Caminho Norte
        System.out.println("Você volta para a praça e segue para o caminho Norte");
        System.out.println("Você entra no laboratório da Google e segue em direção a torre que está desativada, \n na lateral direita da torre existe uma combinação que diz:");
        System.out.println(" 12 PILHAS + 4 BATERIAS + 1 MOTOR \n");
    
        //Combinação final 
    do{ System.out.println("VOCÊ TEM ESSA COMBINAÇÃO ?");
        System.out.println("Sim= 1 \n Não= 0");
         b=input.nextInt();
    }while (b>1 || b<1);
        System.out.println("Você ativa a torre da Google \n");
        System.out.println("No elevador a sua esquerda, sai um senhor de cadeira de rodas, ele é o CEO da Google.\n");

        //dialogos
        System.out.println("Sundar Pichai: Você conseguiu ativar a torre meu jovem, mas isso foi só o começo, \n a Tesla está desenvolvendo uma nova Inteligência Artificial, mas essa tecnologia não são deles, é muito mais avançado, alguém está fornecendo a tecnologia para criação de robos em formas de armas com a nova I.A, \n você deve impedi-los, soube que essa tecnologia tem como matérias-primas recursos de outras cidades.");
        System.out.println("Vá e descubra o que está acontecendo\n");
        System.out.println("Você sai do laboratório e segue para a estação de trem e segue para a proxima cidade.");





}else // Derrota do robo 
            System.out.println("Você morreu");
  
        


}//caminho2 Norte


}else // derrota Flash
            System.out.println("Você morreu");

   
}//Caminho 1 



      
 } 
    
}
