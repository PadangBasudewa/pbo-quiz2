/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

import java.util.*;

/**
 *
 * @author WINDOWS 10
 */
public class Transact {
    private final String code; // code variable to store  Transaction code
    private ArrayList<Item> items = new ArrayList<>(); // items variable to store item
    private float total; //total variable to store total

    public Transact(String code, ArrayList<Item>items) {
        this.code = code;
        this.items = items;
    }
    // total set
    public void setTotal() {
        float total = 0;
        for (Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    //Transaction Output
    public String prtDetail(){
        setTotal();
        String str = "";
        str += "Kode \t\t: "+this.code +"\n";
        str += "Daftar Belanja : \n";
        for (Item item : this.items){
            str += "\t"+ item.getName() +"(x"+ item.getQty() +") : "+ item.getTotal() +"\n";
        }
        str += "Total\t\t:"+this.total;
        return str;
    }
 
}
