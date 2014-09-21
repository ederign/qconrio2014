package pugs;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class DogExemplos {

    public static void main( String[] args ) {
        List<Dog> dogs = Arrays.asList(
        new Dog("Dora",true, 10, Dog.RACA.PUG ),
        new Dog("Bento",true, 13, Dog.RACA.PUG ),
        new Dog("Rex",false, 8, Dog.RACA.SRD ),
        new Dog("Teté",false, 5, Dog.RACA.PINSCHER ),
        new Dog("Banzé",true, 5, Dog.RACA.BULLDOG ),
        new Dog("Rin-Tin-Tin",false, 15, Dog.RACA.PASTOR )
       );


        List<String> doisCachorrosMaisPesados =
                dogs.stream()
                .sorted(comparing(Dog::getPeso).reversed())
                .map(Dog::getNome)
                .limit( 2 )
                .collect( toList() );

        doisCachorrosMaisPesados.forEach(System.out::println);

    }



}
