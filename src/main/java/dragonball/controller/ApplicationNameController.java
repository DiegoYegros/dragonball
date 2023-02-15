package dragonball.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dragonball.config.DragonballConfig;

@RestController
@RequestMapping("/applicationname")
public class ApplicationNameController {
	
	@Autowired
	DragonballConfig configuration;
		
	@GetMapping
	public ResponseEntity<String> getAppName(){
		return ResponseEntity.ok(configuration.getApplicationName());
	}
}
