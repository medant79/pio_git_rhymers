package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultcountingoutrhymer;
import edu.kis.vh.nursery.fiforhymer;
import edu.kis.vh.nursery.hanoirhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultcountingoutrhymer GetStandardRhymer() {
        return new defaultcountingoutrhymer();
    }

    @Override
    public defaultcountingoutrhymer GetFalseRhymer() {
        return new defaultcountingoutrhymer();
    }

    @Override
    public defaultcountingoutrhymer GetFIFORhymer() {
        return new fiforhymer();
    }

    @Override
    public defaultcountingoutrhymer GetHanoiRhymer() {
        return new hanoirhymer();
    }

}
