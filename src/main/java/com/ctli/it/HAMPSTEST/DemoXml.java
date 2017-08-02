package com.ctli.it.HAMPSTEST;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DemoXml {
public static void main(String[] args) {
	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	try {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document Doc=builder.parse("data.xml");
		NodeList personlist = Doc.getElementsByTagName("container");
		System.out.println(personlist.getLength());
		for(int i=0;i<personlist.getLength();i++)
		{
			Node p = personlist.item(i);
			
		}
		//System.out.println(Doc);
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	  
}
}
