/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.backend.server.impl;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.uberfire.backend.server.impl.card.Cartao;
import org.uberfire.backend.server.impl.card.CartaoDAO;
import org.uberfire.backend.server.impl.card.GeradorAlimentacao;
import org.uberfire.backend.server.impl.card.GeradorNumero;
import org.uberfire.backend.server.impl.card.Geradores;
import org.uberfire.backend.server.impl.card.GeradoresNumeros;
import org.uberfire.backend.server.impl.card.Secure;

public class CartaoService extends HttpServlet {

    private GeradorNumero geradorAlimentacao;

    @Inject
    CartaoDAO cartaoDAO;

    @Inject
    public void setGeradorAlimentacao(@GeradoresNumeros(Geradores.ALIMENTACAO) GeradorNumero geradorAlimentacao ) {
        this.geradorAlimentacao = geradorAlimentacao;
    }

    protected void doGet( final HttpServletRequest req,
                          final HttpServletResponse resp )
            throws ServletException, IOException {
        Cartao cartao = new Cartao();
        cartao.setNumero( geradorAlimentacao.gera() );
      //  cartaoDAO.save( cartao );
        cartaoDAO.update( cartao );
        resp.getWriter().println(cartao.getNumero() );
    }

    @Override
    protected void doPost( HttpServletRequest req,
                           HttpServletResponse resp ) throws ServletException, IOException {
        super.doPost( req, resp );
    }
}
