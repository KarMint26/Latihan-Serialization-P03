/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.io.Serializable;

/**
 *
 * @author karel
 */
public class SettingMember implements Serializable{
    protected final String name;
    protected transient String description;
    public SettingMember(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public String toString() {
        return "\r\nNama Setting=" + name + "\r\nDeskripsi Singkat=" + description + "\r\n";
    } 
}
