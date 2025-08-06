package com.example.cv_generator.service;

import com.example.cv_generator.model.CvData;
import net.sf.jasperreports.engine.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CvGeneratorService {

    private final Map<String, JasperReport> jasperTemplates;


    public CvGeneratorService(Map<String, JasperReport> jasperTemplates) {
        this.jasperTemplates = jasperTemplates;
    }

    public byte[] generateCvPdf(CvData cvData, String templateName) throws Exception {

        JasperReport jasperReport = jasperTemplates.get(templateName);

        if (jasperReport == null) {
            throw new IllegalArgumentException("Template not found: " + templateName);
        }

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", safeValue(cvData.getName()));
        parameters.put("professionalTitle", safeValue(cvData.getProfessionalTitle()));
        parameters.put("email", safeValue(cvData.getEmail()));
        parameters.put("phone", safeValue(cvData.getPhone()));
        parameters.put("address", safeValue(cvData.getAddress()));
        parameters.put("profile", safeValue(cvData.getProfile()));

        parameters.put("company1", safeValue(cvData.getCompany1()));
        parameters.put("position1", safeValue(cvData.getPosition1()));
        parameters.put("dates1", safeValue(cvData.getDates1()));
        parameters.put("achievements1", safeValue(cvData.getAchievements1()));

        parameters.put("company2", safeValue(cvData.getCompany2()));
        parameters.put("position2", safeValue(cvData.getPosition2()));
        parameters.put("dates2", safeValue(cvData.getDates2()));
        parameters.put("achievements2", safeValue(cvData.getAchievements2()));

        parameters.put("university1", safeValue(cvData.getUniversity1()));
        parameters.put("degree1", safeValue(cvData.getDegree1()));
        parameters.put("year1", safeValue(cvData.getYear1()));
        parameters.put("diploma", safeValue(cvData.getDiploma()));

        parameters.put("skills", safeValue(cvData.getSkills()));

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }

    private String safeValue(String value) {
        return value != null ? value : "";
    }
}
