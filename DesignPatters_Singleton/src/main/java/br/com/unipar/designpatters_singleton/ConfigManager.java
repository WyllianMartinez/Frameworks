/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatters_singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author marti
 */
public class ConfigManager {
        private Map<String, Object> settings = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    public void setLoggedInUser(String username) {
        settings.put("LoggedInUser", username);
    }

    public String getLoggedInUser() {
        return (String) settings.get("LoggedInUser");
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }    
}