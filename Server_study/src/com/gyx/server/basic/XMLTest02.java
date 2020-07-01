package com.gyx.server.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author Administrator
 *
 */
public class XMLTest02 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//SAX解析
		//1 获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2 从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		//3 编写处理器
		//4 加载文档Document注册处理器
		PersonHandler handler=new PersonHandler();
		//5、解析
		parse.parse(Thread.currentThread().getContextClassLoader()
		.getResourceAsStream("com/gyx/server/basic/p.xml")
		,handler);
	}
}
class PersonHandler extends DefaultHandler{
	private List<Person> persons;
	private Person person;
	private String tag;//存储操作标签
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch, start, length).trim();
		if (null != tag) {// 处理了空
			if(tag.equals("name")){
				person.setName(contents);
			}else if(tag.equals("age")){
				if(contents.length()>0){
					person.setAge(Integer.valueOf(contents));
				}
			}
		}
	}

	@Override
	public void endDocument() throws SAXException {
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(null!=qName){
			if(qName.equals("person")){
				persons.add(person);
			}
		}
		tag = null;//tag丢弃了
	}

	@Override
	public void startDocument() throws SAXException {
		persons = new ArrayList<Person>();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(null!=qName){
			tag=qName;//存储标签名
			if(tag.equals("person")){
				person = new Person();
			}
		}
	}	
	
	public List<Person> getPersons(){
		return persons;
	}
}