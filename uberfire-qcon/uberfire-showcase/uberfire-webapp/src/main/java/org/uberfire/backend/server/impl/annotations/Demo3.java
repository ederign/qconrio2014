package org.uberfire.backend.server.impl.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.uberfire.client.annotations.GenerateError;

public class Demo3 {

    @NotNull("mais null")
    private String fieldNull;

    @NotNull
    private String fieldNotNull;

//    @GenerateError
    private String fieldSemAnnotation;

    public Demo3(){};

    public Demo3( String fieldNull,
                  String fieldNotNull ) {
        this.fieldNull = fieldNull;
        this.fieldNotNull = fieldNotNull;
    }

    public static void validate( Object obj ) throws IllegalAccessException {
        Class cl = obj.getClass();

        for ( Field f : cl.getDeclaredFields() ) {
            for ( Annotation a : f.getAnnotations() ) {
                if ( a.annotationType() == NotNull.class ) {
                    NotNull nullVal = (NotNull) a;
                    System.out.println( "Processando : " + f.getName() );
                    System.out.println( "Valor da annotation : " + nullVal.value() );

                    f.setAccessible( true );

                    if ( f.get( obj ) == null ) {
                        System.out.println( "The value of the field " + f.toString() + " can't be NULL. " );
                    } else {
                        System.out.println( "Value of the Object : " + f.get( obj ) );
                    }
                }
            }
        }
    }

    public static void main( String[] args ) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        Demo3 demo3 = new Demo3( null, "QConRio" );
        Demo3.validate( demo3 );
    }

}
