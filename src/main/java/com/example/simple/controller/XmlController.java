package com.example.simple.controller;

import com.example.simple.service.XmlService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@RestController
@RequestMapping("/api/xml")
public class XmlController {

    private final XmlService xmlService;

    public XmlController(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @PostMapping("/root")
    public String root(@RequestBody String xml) throws ParserConfigurationException, SAXException, IOException {
        return xmlService.rootName(xml);
    }
}
