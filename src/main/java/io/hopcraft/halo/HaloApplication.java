package io.hopcraft.halo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
@ServletComponentScan
public class HaloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaloApplication.class, args);
	}

	@RequestMapping(path="/halo", method=RequestMethod.GET)
	public String getForHalo(
		@RequestParam(
			value="name", required=true, defaultValue="hopcraft"
		) String param
	) {
		return "HALO" + param;
	}
}
