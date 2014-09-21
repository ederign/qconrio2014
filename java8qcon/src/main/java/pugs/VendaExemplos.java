package pugs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class VendaExemplos {

    public static void main( String[] args ) {

        Vendedor eder = new Vendedor("Eder", "Campinas");
        Vendedor pedro = new Vendedor("Pedro", "Apucarana");
        Vendedor luciano = new Vendedor("Luciano", "Piracicaba");
        Vendedor junior = new Vendedor("Junior", "Londrina");

        List<Venda> vendas = Arrays.asList(
                new Venda( eder, 2014, 100 ),
                new Venda( eder, 2013, 200 ),
                new Venda( pedro, 2014, 300 ),
                new Venda( luciano, 2012, 500 ),
                new Venda( luciano, 2012, 400 ),
                new Venda( junior, 2012, 500 ));

        List<Venda> vendas2014 =
                vendas.stream()
                            .filter( venda -> venda.getAno() == 2014 )
                            .sorted( comparing( Venda::getValor ) )
                            .collect( toList() );
        vendas2014.forEach(System.out::println);


        List<String> cidadesAtendidas =
                vendas.stream()
                        .map( venda -> venda.getVendedor().getCidade() )
                        .distinct()
                        .collect( toList() );

        cidadesAtendidas.forEach(System.out::println);

        Optional<Integer> maiorVenda =
                vendas.stream()
                      .map(Venda::getValor)
                      .reduce( Integer::max );

        maiorVenda.ifPresent( i -> System.out.println(i));


        Map<Vendedor, List<Venda>> vendedorPorVendas = vendas.stream().sorted( comparing( Venda::getValor ) ).collect( groupingBy( Venda::getVendedor ) );

        System.out.println(vendedorPorVendas);
    }

}
