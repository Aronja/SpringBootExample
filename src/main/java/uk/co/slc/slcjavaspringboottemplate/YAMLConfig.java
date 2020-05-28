package uk.co.slc.slcjavaspringboottemplate;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(value="security")
public class YAMLConfig {

    public Map<String, List<String>> getPermissions() {
        return permissions;
    }

    public void setPermissions(Map<String, List<String>> permissions) {
        this.permissions = permissions;
    }

    private Map<String, List<String>> permissions;


    Map<String, List<String>> translateToMap() {
        Map<String, List<String>> catches = new HashMap<>();
        String role = null;

        for (Map.Entry<String, List<String>> entry : permissions.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if(key.endsWith(".role")) {
                role = value.get(0);
            }
            if(key.endsWith(".actions")) {
                catches.put(role, value);
            }
        }
        return catches;
    }
}