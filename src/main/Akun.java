package main;

public class Akun {
    public static String name;
    public static String username;
    public static String password;
    public static double saldo = 0;
    
    public static double getSaldo() {
        return saldo;
    }
    
    public static void setSaldo(double saldo) {
        Akun.saldo = saldo;
    }
    
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Akun.name = name;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Akun.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Akun.password = password;
    }

}
