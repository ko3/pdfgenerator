package com.monks.innovation.pdfgenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class PdfGeneratorService {
	
	@Autowired
	private TemplateEngine templateEngine;
	
	public void createPdf() {
		Context context = new Context();
		context.setVariable("name", "bose dk bose");
		String processedHtml = templateEngine.process("SheetOne", context);
		System.out.println(processedHtml);
	}

}
