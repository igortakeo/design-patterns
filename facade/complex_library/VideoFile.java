package complex_library;

public class VideoFile {
    private String name;
    private String codeType;

    public VideoFile(String name) {
        this.name = name.substring(0, name.indexOf("."));
        this.codeType = name.substring(name.indexOf(".") + 1);
    }

    public String getName() {
        return name;
    }

    public String getCodeType() {
        return codeType;
    }
    
}
