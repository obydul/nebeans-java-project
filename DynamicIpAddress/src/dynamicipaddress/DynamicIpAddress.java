package dynamicipaddress;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DynamicIpAddress {

    public static void main(String[] args) {
        try {
            String url = Inet4Address.getLocalHost().getHostAddress();
            System.out.println(url);
        } catch (UnknownHostException ex) {
            Logger.getLogger(DynamicIpAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
