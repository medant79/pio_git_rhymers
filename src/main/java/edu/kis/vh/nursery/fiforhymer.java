package edu.kis.vh.nursery;

public class fiforhymer extends defaultcountingoutrhymer {

    public defaultcountingoutrhymer temp = new defaultcountingoutrhymer();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
            temp.countIn(super.countOut());
        
        int ret = temp.countOut();
        
        while (!temp.callCheck())
            
            countIn(temp.countOut());
        
        return ret;
    }
}
