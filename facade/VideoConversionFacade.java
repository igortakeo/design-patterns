import complex_library.AudioMixer;
import complex_library.BitrateReader;
import complex_library.Codec;
import complex_library.CodecFactory;
import complex_library.MPEG4CompressionCodec;
import complex_library.OggCompressionCodec;
import complex_library.VideoFile;

public class VideoConversionFacade {
    public void convertVideo(String file, String targetFormat) {
        System.out.println("VideoConversion: convesion started.");
        VideoFile videoFile = new VideoFile(file);
        System.out.println(videoFile.getName());

        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec;
        if (targetFormat.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile videoConverted = BitrateReader.convert(buffer, destinationCodec);
        (new AudioMixer()).fix(videoConverted);
        System.out.println(file + " converted to " + videoFile.getName() + "." + targetFormat);
    }
}
