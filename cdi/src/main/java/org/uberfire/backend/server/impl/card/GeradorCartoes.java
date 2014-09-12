package org.uberfire.backend.server.impl.card;

public class GeradorCartoes {

    private GeradorNumero geradorNumero;

    private GeradorCartoes( GeradorNumero geradorNumero ) {
        this.geradorNumero = geradorNumero;
    }

//    public static GeradoresNumeros alimentacao(){
//        return new GeradoresNumeros( new GeradorAlimentacao() );
//    }
//
//    public static GeradoresNumeros refeicao(){
//        return new GeradoresNumeros( new GeradorRefeicao() );
//    }


    public Cartao gera(Cartao cartao){
        //...
        cartao.setNumero( geradorNumero.gera() );
        return cartao;
    }


    public void a (){

//        //via construtor
//        GeradorCartoes geradorAlimentacao = new GeradorCartoes( new GeradorAlimentacao() );
//        GeradorCartoes geradorRefeicao = new GeradorCartoes( new GeradorRefeicao() );
//
//        //via setter
//        GeradorCartoes gerador = new GeradorCartoes( );
//        gerador.setGeradorNumero(new GeradorAlimentacao());
//        gerador.setGeradorNumero(new GeradorRefeicao() );

        //client
        //Cartao cartaoAlimentacao = GeradoresNumeros.alimentacao().gera(null);

    }

}
