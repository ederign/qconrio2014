package org.uberfire.backend.server.impl.card;

@GeradoresNumeros( Geradores.REFEICAO )
public class GeradorRefeicao implements GeradorNumero {

    @Secure
    public String gera() {
        return "numero gerado para vale refeicao";
    }
}
