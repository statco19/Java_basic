interface Parseable {
	void parse(String fileName);
}

class ParserManager {
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		}
		
		else {
			return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String FileName) {
		System.out.println(FileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String FileName) {
		System.out.println(FileName + " - HTML parsing completed.");
	}
}

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("docuemnt.XML");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.HTML");
	}
}