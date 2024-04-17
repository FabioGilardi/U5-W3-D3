package FabioGilardi.U5W3D3.chain.filter;

import FabioGilardi.U5W3D3.chain.classes.Ufficiale;

public class FilterGenerale extends Filter {

    @Override
    public void check(Ufficiale ufficiale) {
        if (ufficiale.getStipendio() >= 5000) {
            System.out.println("Sei un generale");
            passToNext(ufficiale);
        } else System.out.println("Sei un colonnello");
    }
}
