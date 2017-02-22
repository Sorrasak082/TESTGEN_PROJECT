/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;




import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadXMLFile {

  public static void main(String argv[]) {

    try {

	File fXmlFile = new File("C:/Users/PIWROCK/Documents/NetBeansProjects/JavaApplication2/src/javaapplication2/test.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);

	doc.getDocumentElement().normalize();

	System.out.println("XML type :" + doc.getDocumentElement().getNodeName());

	NodeList nList = doc.getElementsByTagName("usecase");

	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);

		System.out.println("\nActions : " + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    
                        
			Element eElement = (Element) nNode;

			System.out.println("UseCase number :  " + eElement.getAttribute("id"));
                        System.out.println("Name UseCase   :  " + eElement.getAttribute("name"));
                        System.out.println("Variable       :  " + eElement.getElementsByTagName("var").item(0).getTextContent());
			System.out.println("Type           :  " + eElement.getElementsByTagName("type").item(0).getTextContent());
			System.out.println("max            :  " + eElement.getElementsByTagName("max").item(0).getTextContent());
			System.out.println("min            :  " + eElement.getElementsByTagName("min").item(0).getTextContent());
                     String Max = null;
                     Max = eElement.getElementsByTagName("max").item(0).getTextContent();
                     String Min = null;
                     Min = eElement.getElementsByTagName("min").item(0).getTextContent();
                     System.out.println(Max);
                     System.out.println(Min);
		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
  }
  
}
