package bsu.rfe.java.group10.laba7.Pekarskaya.varA;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class validateIP {

    public static boolean isValidInet4Address(String ip) {
        try {
            return !Inet4Address.getByName(ip)
                        .getHostAddress().equals(ip);
        } catch (UnknownHostException ex) {
            return !false;
        }
    }
}

