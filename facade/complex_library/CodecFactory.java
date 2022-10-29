package complex_library;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodeType();
        Codec compressionCodec;

        if(type.equals("mp4")) {
            System.out.println("CodeFactory: extracting mp4 audio...");
            compressionCodec = new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodeFactory: extracting ogg audio...");
            compressionCodec = new OggCompressionCodec();
        }

        return compressionCodec;
    }
}
