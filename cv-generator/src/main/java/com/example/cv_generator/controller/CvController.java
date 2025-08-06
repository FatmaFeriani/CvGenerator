package com.example.cv_generator.controller;

import com.example.cv_generator.model.CvData;
import com.example.cv_generator.service.CvGeneratorService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cv")
public class CvController {

    private final CvGeneratorService cvGeneratorService;

    public CvController(CvGeneratorService cvGeneratorService) {
        this.cvGeneratorService = cvGeneratorService;
    }


    @PostMapping(value = "/generate", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> generateCv(
            @RequestBody CvData cvData,
            @RequestParam(defaultValue = "cv_template") String template) {

        try {
            if (cvData.getName() == null || cvData.getName().trim().isEmpty()) {
                return ResponseEntity.badRequest().body(null);
            }


            byte[] pdfBytes = cvGeneratorService.generateCvPdf(cvData, template);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentLength(pdfBytes.length);
            headers.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=cv.pdf");

            return ResponseEntity.ok().headers(headers).body(pdfBytes);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("CV Generator API is working!");
    }
}
