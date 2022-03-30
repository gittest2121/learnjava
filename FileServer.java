public interface FileServer {
	String load(String fileName) throws Exception;
	void save(String fileName, String textToSave) throws Exception;
}
