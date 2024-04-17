package FabioGilardi.U5W3D3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info newInfo = new Info("Fabio", "Gilardi", LocalDate.of(2002, 1, 4));
        UserData newUserData = new UserData();
        newUserData.getData(newInfo);
        System.out.println("###  ADAPTER  ###");
        System.out.println(newUserData);
        System.out.println("###  END ADAPTER  ###");
    }
}
