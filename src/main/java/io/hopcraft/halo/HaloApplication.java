package io.hopcraft.halo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class HaloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaloApplication.class, args);
	}

}
