package org.uberfire.backend.server.impl.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo2 {

    private String fieldSem;

    @Test
    public void arrobaTest() {
        System.out.println( ":)" );
    }

    @Test
    public void arrobaTestFail() {
        throw new RuntimeException();
    }

    public void semArrobaTest() {
        System.out.println( ":(" );
    }

    public static void main( String[] args ) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Demo2 demo2 = Demo2.class.newInstance();
        int testesExecutados = 0;
        int testesExecutadosComSucesso = 0;
        int testesExecutadosComFalha = 0;
        for ( Method f : demo2.getClass().getDeclaredMethods() ) {
            if ( f.isAnnotationPresent( Test.class ) ) {
                testesExecutados++;
                try {
                    f.invoke( demo2 );
                    testesExecutadosComSucesso++;
                } catch ( Exception e ) {
                    testesExecutadosComFalha++;
                }
            }
        }
        System.out.println( "Testes executados: " + testesExecutados );
        System.out.println( "Testes executados com sucesso: " + testesExecutadosComSucesso );
        System.out.println( "Testes executados com falha: " + testesExecutadosComFalha );
    }

}
