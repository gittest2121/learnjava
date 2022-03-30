public class Engine extends Part {
    // Engine is a special case of Part
    
    public String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
	super(identifier, manufacturer, description);
	this.engineType = engineType;
    }

    public String getEngineType() {
	return this.engineType;
    }
}
