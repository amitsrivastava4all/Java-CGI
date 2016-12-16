import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * Object Based Parsing (DOM) Document Object Model
 * DOM parser parses the entire XML document and loads it into memory;
 *  then models it in a “TREE” structure for easy traversal or manipulation.
 * DOM will read the entire XML and Load in Memory, DOM is little slow compare to SAX
 * DOM can insert/delete Nodes
 * Event Based Parsing (SAX) Simple API for XML, 
 * SAX events like startDocument, endDocument, startElement, endElement,characters (InnerTAG Element)
 * startDocument() and endDocument() – Method called at the start and end of an XML document.
startElement() and endElement() – Method called at the start and end of a document element.
characters() – Method called with the text contents in between the start and end tags of an XML document element.
 * SAX read node by node
 * SAX can't insert and delete nodes
 * SAX is good to process the big xml file , where DOM is good for small xml files
 */

class SAXParsingDemo extends DefaultHandler{
	boolean bfname = false;
	boolean blname = false;
	boolean bnname = false;
	boolean bsalary = false;
	public void startElement(String uri, String localName,String qName,
            Attributes attributes) throws SAXException {

	System.out.println("Start Element :" + qName);

	if (qName.equalsIgnoreCase("FIRSTNAME")) {
		bfname = true;
	}

	if (qName.equalsIgnoreCase("LASTNAME")) {
		blname = true;
	}

	if (qName.equalsIgnoreCase("NICKNAME")) {
		bnname = true;
	}

	if (qName.equalsIgnoreCase("SALARY")) {
		bsalary = true;
	}

}

public void endElement(String uri, String localName,
	String qName) throws SAXException {

	System.out.println("End Element :" + qName);

}

public void characters(char ch[], int start, int length) throws SAXException {

	if (bfname) {
		System.out.println("First Name : " + new String(ch, start, length));
		bfname = false;
	}

	if (blname) {
		System.out.println("Last Name : " + new String(ch, start, length));
		blname = false;
	}

	if (bnname) {
		System.out.println("Nick Name : " + new String(ch, start, length));
		bnname = false;
	}

	if (bsalary) {
		System.out.println("Salary : " + new String(ch, start, length));
		bsalary = false;
	}

}


}

public class XMLParsing {
	
	static void saxParsing() throws ParserConfigurationException, SAXException, IOException{
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		DefaultHandler handler = new SAXParsingDemo();
		saxParser.parse("/Users/amit/Documents/CGI-WS/Day-4/src/emp.xml", handler);
	}
	
	static void domParsing(){
		try {

			File fXmlFile = new File("/Users/amit/Documents/CGI-WS/Day-4/src/emp.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("staff");

			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("Staff id : " + eElement.getAttribute("id"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

				}
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }
	}
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		//domParsing();
		saxParsing();
		

	}

}
