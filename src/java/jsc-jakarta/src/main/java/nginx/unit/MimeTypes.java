package nginx.unit;

import static nginx.unit.Type.text;

import java.util.HashMap;

public enum MimeTypes {

	html( text, "html", "html", "htm", "shtml" );

	MimeTypes(Type type, String subtype, String... extensions) {
		this.mimeType = new MimeType(type, subtype);
		for (String ext: extensions) {
			MimeType.types.put(ext, mimeType);
		}
	}

	public MimeType mimeType;

	static String getMimeByExtension(String ext) {
		MimeType mimeType = MimeType.types.get(ext);
		if (mimeType == null) {
			return "*";
		}
		return mimeType.toString();
	}


}

class MimeType {
	static HashMap<String, MimeType> types = new HashMap<String, MimeType>();

	Type type;
	String subtype;
	
	MimeType(Type type, String subtype) {
		super();
		this.type = type;
		this.subtype = subtype;
	}
	
	@Override
	public String toString() {
		return type.name() + "/" + subtype;
	}
}

enum Type {	
	text, image, application;
}
