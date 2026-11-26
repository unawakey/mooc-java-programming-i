/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author k
 */
public class Container {

    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return liquidAmount;
    }

    public void add(int amount) {
        if (!(amount < 0)) {
            liquidAmount += amount;
            if (liquidAmount > 100) {
                liquidAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (!(amount < 0)) {
            liquidAmount -= amount;
            if (liquidAmount < 0) {
                liquidAmount = 0;
            }
        }
    }

    public int getLiquidAmount() {
        return liquidAmount;
    }

    @Override
    public String toString() {
        return liquidAmount + "/100";
    }

}
