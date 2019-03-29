package ua.lviv.iot.pharmacy.PharmacyManager;

import org.springframework.boot.CommandLineRunner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PharmacyManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacyManagerApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner demo(GoodsOfPharmacyRepository repository) {
        return (args) -> {
            repository.save(new GoodsOfPharmacy(120, "NaN",
                    "Perfect", 6, "Nutrition"));
            repository.save(new GoodsOfPharmacy(80, "Duovit",
                    "Good", 13, "Vitamins"));
            repository.save(new GoodsOfPharmacy(110, "Strepsils",
                    "Bad", 6, "Medicine"));
            
            repository.findAll().forEach(student ->
            System.out.println(student));
            
        };
    }
}
