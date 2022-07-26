package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.service.interfaces.IImageService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService implements IImageService {

  private final Path root = Paths.get("src//main//resources//static/images");

  @Override
  public void init() {
    try {
      Files.createDirectory(root);
    } catch (IOException e) {
      throw new RuntimeException("No se puede inicializar la carpeta uploads");
    }
  }

  @Override
  public void saveImage(MultipartFile image) {
    if (!image.isEmpty()) {
      String absPath = root.toFile().getAbsolutePath();
      try {
        byte[] bytesImage = image.getBytes();
        Path completePath = Paths.get(absPath + "//" + image.getOriginalFilename());
        Files.write(completePath, bytesImage);
      } catch (IOException e) {
        throw new RuntimeException("No se puede guardar el archivo. Error " + e.getMessage());
      }
    }
  }

  @Override
  public ResponseEntity<byte[]> loadImage(String name) {
    String absPath = root.toFile().getAbsolutePath();
	  Path completePath = Paths.get(absPath + "//" + name);
	  try {
		byte[] bytesImage = Files.readAllBytes(completePath);
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytesImage);
	  } catch (IOException e) {
		throw new RuntimeException("No se puede cargar la imagen. Error " + e.getMessage());
	  }
  }

  @Override
  public void deleteImage(String name) {
    try {
      Boolean delete = Files.deleteIfExists(this.root.resolve(name));
    } catch (IOException e) {
      throw new RuntimeException("Error: " + e.getMessage());
    }
  }

}
