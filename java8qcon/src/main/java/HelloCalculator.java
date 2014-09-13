public class HelloCalculator {

    public interface Calculator {

        public Double calculate( Double num1,
                                 Double num2 );
    }

    public double process( double num1,
                           double num2,
                           Calculator calculator ) {
        return calculator.calculate( num1, num2 );
    }

    public static void main( String[] args ) {
        HelloCalculator hl = new HelloCalculator();

        // Classe anonima
        System.out.println( "+: " + hl.process( 3, 4, new Calculator() {
            public Double calculate( Double num1,
                                     Double num2 ) {
                return num1 + num2;
            }
        } ) );

        // Lambda Way
        Calculator calcSubtraction = ( Double num1,
                                       Double num2 ) -> {
            return num1 - num2;
        };
        System.out.println( "-: " + hl.process( 3, 4, calcSubtraction ) );

        System.out.println( "*: " + hl.process( 3, 4, ( num1,
                                                        num2 ) -> {
            return num1 * num2;
        } ) );

        System.out.println( "/: " + hl.process( 3, 4, ( num1,
                                                        num2 ) -> {
            return num1 / num2;
        } ) );

        System.out.println( "/: " + hl.process( 3, 4, ( num1,num2 ) -> num1 / num2 ) );

        //http://vitalflux.com/java-8-lambda-expressions-examples-using-calculator-implementation/
    }
}