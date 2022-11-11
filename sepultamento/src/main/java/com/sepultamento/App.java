package com.sepultamento;
public class App 
{
    public static void main( String[] args )
    {
        Corpo corpo = new Corpo (12, "Antônio");
        Tumulo tumulo = new Tumulo (1, "Recife");
        Sepultamento sepultamento = new Sepultamento(22, "11/11/2022" , corpo, tumulo);
        Exumacao exumacao = new Exumacao(13, "11/11/2025", sepultamento);


        System.out.println("Situação do corpo: " + corpo.getSituacao());
        System.out.println();
        System.out.println("--------------------------------------");
        sepultamento.sepultar();
        sepultamento.getTumulo().getOcupado();
        System.out.println("Situação do corpo:  " + corpo.getSituacao());
        System.out.println("Situação do túmulo: " + tumulo.getOcupado());
        System.out.println("--------------------------------------");
        System.out.println();
        exumacao.exumar();
        System.out.println("Situação do corpo:  " + corpo.getSituacao());
        System.out.println("Situação do túmulo: " + tumulo.getOcupado());









    }
}
