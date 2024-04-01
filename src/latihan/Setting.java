/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author karel
 */
public class Setting implements Serializable {

    private static String title;
    private List<SettingMember> settings;

    public void setTitle(String title) {
        Setting.title = title;
    }

    public void setSettings(List<SettingMember> settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        String setting, settingMember = "";
        setting = "Nama Setting = " + title + "\r\n"
                + "**************************\r\n"
                + "Setting List:\r\n";
        if (this.settings != null) {
            settingMember = settings.stream().map((obj)
                    -> obj.toString()).reduce(settingMember, String::concat);
        }
        return setting + settingMember;
    }
}
