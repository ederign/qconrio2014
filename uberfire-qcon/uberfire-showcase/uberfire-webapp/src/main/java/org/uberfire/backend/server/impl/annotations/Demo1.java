package org.uberfire.backend.server.impl.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Print
public class Demo1 {

    @Print
    private int fieldCom;

    private String fieldSem;

    @Print
    public void methodCom( @Print Object param ) {

    }

    public void methodSem( @Print Object param ) {

    }

    public static void main( String[] args ) {
        Demo1 demo1 = new Demo1();
        if ( demo1.getClass().isAnnotationPresent( Print.class ) ) {
            System.out.println( "@Print na classe" );
        }

        for ( Field f : demo1.getClass().getDeclaredFields() ) {
            if ( f.isAnnotationPresent( Print.class ) ) {
                System.out.println( f.getName() );
            }
        }

        for ( Method f : demo1.getClass().getDeclaredMethods() ) {
            if ( f.isAnnotationPresent( Print.class ) ) {
                System.out.println( f.getName() );
            }
        }
    }

}
