package org.uberfire.backend.server.impl.card;

import javax.enterprise.inject.Alternative;

@Alternative
@GeradoresNumeros( Geradores.ALIMENTACAO )
public class GeradorMock implements  GeradorNumero{

    @Override
    public String gera() {
        return "MOCK";
    }
}
