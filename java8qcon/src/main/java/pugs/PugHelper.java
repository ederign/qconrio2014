package pugs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class PugHelper {

    private static List<Pug> filterAbricotPugs( List<Pug> pugs ) {
        List<Pug> abricots = new ArrayList<>();
        for ( Pug pug : pugs ) {
            if ( pug.getColor().equals( "abricot" ) ) {
                abricots.add( pug );
            }

        }
        return abricots;
    }

    private static List<Pug> filterPugByColor( List<Pug> pugs,
                                               String color ) {
        List<Pug> abricots = new ArrayList<>();
        for ( Pug pug : pugs ) {
            if ( pug.getColor().equals( color ) ) {
                abricots.add( pug );
            }

        }
        return abricots;
    }

    private static List<Pug> filterPugBySize( List<Pug> pugs,
                                              int size ) {
        List<Pug> abricots = new ArrayList<>();
        for ( Pug pug : pugs ) {
            if ( pug.getWeight() > size ) {
                abricots.add( pug );
            }

        }
        return abricots;
    }

    private static List<Pug> filterPug( List<Pug> pugs,
                                        String color,
                                        int weight,
                                        boolean flag ) {
        List<Pug> result = new ArrayList<>();
        for ( Pug pug : pugs ) {
            if ( ( flag && pug.getColor().equals( color ) ) ||
                    ( !flag && pug.getWeight() > weight ) ) {
                result.add( pug );
            }

        }
        return result;
    }

    private static List<Pug> filterPug( List<Pug> pugs,
                                        PugPredicate predicate ) {
        List<Pug> result = new ArrayList<>();
        for ( Pug pug : pugs ) {
            if ( predicate.test( pug ) ) {
                result.add( pug );
            }
        }
        return result;
    }

    public static void main( String[] args ) {
        Pug dora = new Pug( "Dora", "abricot", 10, new Dono( "Eder" ) );
        Pug bento = new Pug( "Bento", "abricot", 13 );
        Pug jesse = new Pug( "Jesse", "black", 9 );

        List<Pug> pugs = Arrays.asList( dora, bento, jesse );

        List<Pug> abricot = filterAbricotPugs( pugs );

//        List<Pug> black = filterPugByColor( pugs, "black" );
//
//        List<Pug> fat = filterPugBySize( pugs, 10 );

        List<Pug> black = filterPug( pugs, new BlackPugPredicate() );

        List<Pug> fat = filterPug( pugs, new FatPugPredicate() );

        List<Pug> abricotsNotFat = filterPug( pugs, new PugPredicate() {
            @Override
            public boolean test( Pug pug ) {
                return pug.getColor().equals( "abricot" ) && pug.getWeight() <= 10;
            }
        } );

        List<Pug> blacks = filterPug( pugs, new BlackPugPredicate() );

        blacks = filterPug( pugs, ( Pug pug ) -> "black".equals( pug.getColor() ) );
        blacks = filterPug( pugs, ( pug ) -> "black".equals( pug.getColor() ) );

//        blacks.forEach( System.out::println );
        pugs.sort( ( Pug p1,
                     Pug p2 ) -> p1.getWeight().compareTo( p2.getWeight() ) );
        pugs.sort( ( p1,
                     p2 ) -> p1.getWeight().compareTo( p2.getWeight() ) );
        pugs.sort( comparing( Pug::getWeight ) );

//        pugs.forEach( System.out::println );

        List<Pug> gordinhos = new ArrayList<>();
        for ( Pug pug : pugs ) {
            if ( pug.getWeight() > 9 ) {
                gordinhos.add( pug );
            }
        }
        Collections.sort( gordinhos, new Comparator<Pug>() {
            @Override
            public int compare( Pug p1,
                                Pug p2 ) {
                return Integer.compare( p1.getWeight(), p2.getWeight() );
            }
        } );

        List<String> nomeGordinhos = new ArrayList<String>();
        for ( Pug pug : gordinhos ) {
            nomeGordinhos.add( pug.getNome() );
        }

        nomeGordinhos.forEach( System.out::println );

        List<String> gordinhosNome =
                pugs.stream()
                        .filter( d -> d.getWeight() > 9 )
                        .sorted( comparing( Pug::getWeight ) )
                        .map( Pug::getNome )
                        .collect( toList() );

//        for ( Pug pug : pugs ) {
//            if ( pug.getDono() != null ) {
//                System.out.println( pug.getDono().getNome() );
//            }
//        }
//        pugs.forEach( p ->
//                              System.out.println( p.getDono().getNome() ) );

        for ( Pug pug : pugs ) {
            pug.getDono().ifPresent( dono -> System.out.println( dono.getNome() ) );
        }

        pugs.forEach( pug -> {
            pug.getDono().ifPresent( dono ->
                                             System.out.println( dono.getNome() ) );
        } );

        pugs.forEach( pug -> pug.getDono().orElse( new Dono( "desconhecido" ) )
                    );

        pugs.forEach( pug -> {
            pug.getDono().ifPresent( dono ->
                                             System.out.println( dono.getNome() ));
        } );

    }
}
