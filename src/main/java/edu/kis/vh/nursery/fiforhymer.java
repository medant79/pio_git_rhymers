package edu.kis.vh.nursery;

public class fiforhymer extends defaultcountingoutrhymer {

    public defaultcountingoutrhymer temp = new defaultcountingoutrhymer();
    
    @Override
    public int countout() {
        while (!callcheck())
            
            temp.countin(super.countout());
        
        int ret = temp.countout();
        
        while (!temp.callcheck())
            
            countin(temp.countout());
        
        return ret;
    }
}
