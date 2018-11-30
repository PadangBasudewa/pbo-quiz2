/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

/**
 *
 * @author WINDOWS 10
 */
public class Item {
    private String name; // nama variable untuk menyimpan nama barang
    private float price; // harga pada variable untuk menyimpan harga
    private int qty; // qty variable untuk menyimpan item qty
    
    // Constructor

    public Item(String name, float price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    //get Name
    public String getName() {
        return name;
    }
    //set Name
    public void setName(String name) {
        this.name = name;
    }
    //get Price
    public float getPrice() {
        return price;
    }
    //set Price
    public void setPrice(float price) {
        this.price = price;
    }
    //get Qty
    public int getQty() {
        return qty;
    }
    //setQty
    public void setQty(int qty) {
        this.qty = qty;
    }
    //returns result of item * qty
    public float getTotal(){
        return this.price * this.qty;
    }
    public String toString(){
        return this.name;
    }
}
