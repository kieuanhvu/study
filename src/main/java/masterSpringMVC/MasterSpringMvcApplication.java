package masterSpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import masterSpringMVC.config.PicturesUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({PicturesUploadProperties.class})
public class MasterSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterSpringMvcApplication.class, args);
	}
}
