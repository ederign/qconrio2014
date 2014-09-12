package org.uberfire.backend.server.impl.card;

@GeradoresNumeros( Geradores.ALIMENTACAO )
public class GeradorAlimentacao implements GeradorNumero {

    @Secure
    public String gera() {
        return "numero gerado para vale alimentacao";
    }
}
