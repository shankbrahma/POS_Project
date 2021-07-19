package pos.model;


import lombok.Data;

//Data about the application
@Data
public class AboutAppData {

    private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	private String version;
}
