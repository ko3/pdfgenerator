package com.monks.innovation.pdfgenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monks.innovation.pdfgenerator.service.PdfGeneratorService;

@RestController
public class EmployeeController {
	
	@Autowired
	PdfGeneratorService pdfGeneratorService;

	@GetMapping("/employee")
	public ResponseEntity<String> getEmployeeId(){
		pdfGeneratorService.createPdf();
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
