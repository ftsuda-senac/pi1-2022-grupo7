

package com.mycompany.sistemadeinicial;
import java.util.Scanner;

public class SistemaDeInicial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
      
        // Variaveis 
        String nome;
        String resposta;
        //intro
        System.out.println("Digite Start para começar:");
       
        //começo
        
        System.out.println("Olá seja muito bem vindo ao mundo de The Clash 77!");
        System.out.println("Mas antes de você saber sobre esse mundo preciso saber.");
        System.out.println("Qual é o seu nome?");
        nome = input.next();
        System.out.println("Então seu nome é: " + nome);
        System.out.println("Que legal!");
        
        System.out.println("Bom, por onde podemos começar, a sim pelo começo rsrs.");
        System.out.println("Ah muitos anos atrás, ouve uma crise climatica que devastou boa parte da terra,");
        System.out.println("e os poucos locais habitaveis que sobraram, foram divididos por pensamentos distintos,");
        System.out.println("uns focados em biotecinologia, outro focado em tecnologias mais antigas como nos anos 80, ");
        System.out.println("outro focado em tecnologias mais futuristas, outro com um tecnologias mais sustentáveis ");
        System.out.println("e outro focado em tecnologias espaciais."); 
        System.out.println("Com o decorrer dos anos esses pensamentos viraram 5 cidades; ");
        System.out.println("Saint Valley, Ziuns, Cyber City, Qawha e a ultima cidade qua ainda não escolhaemos o nome kkk.");
        System.out.println("Em algum momento as cidades perceberam que precisavam de algumas coisas que só exitiam nas outras,");
        System.out.println("então foi feito um trem ligando todas as cidades, para manterem relações comerciais.");
        System.out.println("Você é um cidadão nascido em Saint Valley, que quer conhecer o mundo em busca de aventura ");
        
        do{
            System.out.println("você está preparado para a sua aventura?");
            resposta = input.next();
         
        if (resposta.equals ("sim") ) {
            System.out.println("você entrou em Saint Valley!");
          break;
        }

        }while(resposta.equals ("não"));

}    

}    