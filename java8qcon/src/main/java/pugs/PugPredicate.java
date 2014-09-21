package pugs;

public interface PugPredicate {
     boolean test(Pug pug);
}


class BlackPugPredicate implements  PugPredicate{

    @Override
    public boolean test( Pug pug ) {
        return pug.getColor().equals( "black" );
    }
}

class FatPugPredicate implements  PugPredicate{

    @Override
    public boolean test( Pug pug ) {
        return pug.getWeight()>10;
    }
}

