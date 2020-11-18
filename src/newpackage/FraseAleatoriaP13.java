/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class FraseAleatoriaP13 {

    public static void main(String[] args) {

        String[] wordListUm = {"24/7", "várias camadas", "30.000 pés", "B - to - B",
            "todos ganham", "front-end", "baseado na web", "difundido", "inteligente",
            "seis sigma", "caminho crítico", "dinâmico"};

        String[] wordListDois = {"habilitado", "adesivo", "valor agregado", "orientado",
            "central", "distribuído", "agrupado", "solidificado", "independente da máquina",
            "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
            "compartilhado", "cooperativo", "acelerado"};

        String[] wordListTres = {"processo", "ponto", "máximo", "solução", "arquitetura",
            "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço",
            "visão", "paradigma", "missão"};

        int tamanhoListaUm = wordListUm.length;
        int tamanhoListaDois = wordListDois.length;
        int tamanhoListaTres = wordListTres.length;

        int rand1 = (int) (Math.random() * tamanhoListaUm);
        int rand2 = (int) (Math.random() * tamanhoListaDois);
        int rand3 = (int) (Math.random() * tamanhoListaTres);

        String pharse = wordListUm[rand1] + " " + wordListDois[rand2] + " " + wordListTres[rand3];

        System.out.println("Tamanho da lista 1: " + tamanhoListaUm);
        System.out.println("Tamanho da lista 2: " + tamanhoListaDois);
        System.out.println("Tamanho da lista 3: " + tamanhoListaTres);
        
        System.out.println("");
        
        System.out.println("Número gerado ran1: " + rand1);
        System.out.println("Número gerado ran2: " + rand2);
        System.out.println("Número gerado ran3: " + rand3);

        System.out.println("");
        
        System.out.println("Precisamos de " + pharse);
    }

}
