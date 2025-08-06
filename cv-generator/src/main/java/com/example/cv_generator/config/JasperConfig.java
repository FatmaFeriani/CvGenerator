package com.example.cv_generator.config;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class JasperConfig {

    @Bean
    public Map<String, JasperReport> jasperTemplates() throws Exception {
        Map<String, JasperReport> templates = new HashMap<>();


        String[] templateNames = {"cv_template1", "cv_template2", "cv_template3","cv_template4"};

        for (String name : templateNames) {
            String path = "templates/" + name + ".jrxml";
            try (InputStream inputStream = new ClassPathResource(path).getInputStream()) {
                templates.put(name, JasperCompileManager.compileReport(inputStream));
            }
        }


        return templates;
    }
}
