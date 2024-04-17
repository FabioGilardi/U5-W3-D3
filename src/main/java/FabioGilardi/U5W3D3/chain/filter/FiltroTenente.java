package FabioGilardi.U5W3D3.chain.filter;

import FabioGilardi.U5W3D3.chain.classes.Ufficiale;

public class FiltroTenente extends Filter {

    @Override
    public void check(Ufficiale ufficiale) {
        if (ufficiale.getStipendio() >= 1000) passToNext(ufficiale);
        else System.out.println("Non sei un tenente");
    }
}
