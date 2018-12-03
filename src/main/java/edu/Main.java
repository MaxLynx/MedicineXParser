package edu;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import edu.medicine.Medicine;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("src/main/resources/medicine.xml");
            InputStream xmlStream = new FileInputStream(xmlFile);
            File xsdFile = new File("src/main/resources/medicine.xsd");
            InputStream xsdStream = new FileInputStream(xsdFile);
            if(validateAgainstXSD(xmlStream, xsdStream)) {
                System.out.println("XML file is valid");

                try {
                    Parser parser = new JAXBParser();
                    Medicine person = (Medicine) parser.getObject(xmlFile, Medicine.class);

                    ObjectMapper mapper = new ObjectMapper();
                    AnnotationIntrospector introspector = new JaxbAnnotationIntrospector(mapper.getTypeFactory());
                    mapper.setAnnotationIntrospector(introspector);

                    System.out.println(mapper.writeValueAsString(person));
                }
                catch(JAXBException e){
                    System.out.println(e.getMessage());
                }

            }
            else{
                System.out.println("XML file is invalid");
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    static boolean validateAgainstXSD(InputStream xml, InputStream xsd)
    {
        try
        {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}
