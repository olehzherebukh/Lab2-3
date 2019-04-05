package ua.lviv.iot.pharmacy.PharmacyManager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PharmacyController {
    
    @Autowired
    private GoodsOfPharmacyRepository pharmacyRepository;
    
    @GetMapping("/pharmacy/{id}")
    @ResponseBody
    public Optional<GoodsOfPharmacy> one(@PathVariable Integer id) {
        return pharmacyRepository.findById(id);
    }
    
    @PostMapping
    @RequestMapping
    public GoodsOfPharmacy updateStudent(@RequestBody GoodsOfPharmacy good) {
        return pharmacyRepository.save(good);
    }
    
    @PutMapping("/pharmacy/{id}")
    Optional<GoodsOfPharmacy> replaceGood(@RequestBody GoodsOfPharmacy newGood, @PathVariable Integer id) {
        return pharmacyRepository.findById(id)
                .map(good -> {
                    good.setPriceOfGood(newGood.getPriceOfGood());
                    good.setNameOfGood(newGood.getNameOfGood());
                    good.setQualityOfGood(newGood.getQualityOfGood());
                    good.setAmountOfCustomersPerDay(newGood.getAmountOfCustomersPerDay());
                    good.setTypeOfGood(newGood.getTypeOfGood());
                    return pharmacyRepository.save(good);
                });
    }
    
    @DeleteMapping("/pharmacy/{id}")
    void deleteGood(@PathVariable Integer id) {
        pharmacyRepository.deleteById(id);
    }
}
