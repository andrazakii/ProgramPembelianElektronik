package main;

public class hitunghitung {
    public double saldo, harga = 0, pajak, total, adm = 0;
    public String operator = "PILIH", pulsa = "0K";

    public void cekPulsa() {
        switch (pulsa) {
            case "5K":
                harga = 5000;
                break;
            case "10K":
                harga = 10000;
                break;
            case "15K":
                harga = 15000;
                break;
            case "20K":
                harga = 20000;
                break;
            case "25K":
                harga = 25000;
                break;
            case "50K":
                harga = 50000;
                break;
            case "100K":
                harga = 100000;
                break;
            default:
                harga = 0;
                break;
        }
                
    }

    public void cekOperator() {
        switch (operator.toLowerCase()) {
            case "telkomsel":
                adm = 6000 + harga;
                break;
            case "tri":
                adm = 5000 + harga;
                break;
            case "smartfren":
                adm = 3000 + harga;
                break;
            case "xl":
                adm = 4000 + harga;
                break;
            case "axis":
                adm = 1000 + harga;
                break;
            case "indosat":
                adm = 2000 + harga;
                break;
            default:
                adm = 0;
                break;
        }
    }
    
    public void setPulsa(String pulsa) {
        this.pulsa = pulsa;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getHarga() {
        if (operator.equals("PILIH")) {
            return 0;
        } else {
            return adm;
        }
    }

    public void setHarga(double val) {
        harga = val;
    }
    
    public double getPajak() {
        if (operator.equals("PILIH")) {
            return 0;
        } else {
            pajak = 0.1*harga;
            return pajak;
        }
    }

    public double getTotal() {
        if (operator.equals("PILIH")) {
            return 0;
        } else {
            total = harga+pajak;
            return total;
        }
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
