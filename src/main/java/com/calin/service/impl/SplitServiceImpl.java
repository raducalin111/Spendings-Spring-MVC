package com.calin.service.impl;

import com.calin.dao.GenericDao;
import com.calin.modelview.PersonResult;
import com.calin.modelview.Product;
import com.calin.modelview.Split;
import com.calin.modelview.SplitResult;
import com.calin.service.SplitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Calin on 6/26/2016.
 */

@Service
public class SplitServiceImpl implements SplitService {

    @Autowired
    GenericDao genericDao;


    public SplitResult getSplitResult(Split split) {
        ArrayList<PersonResult> results = new ArrayList<PersonResult>();

        for(String personName : split.getPersons()) {
            results.add(new PersonResult(personName, BigDecimal.ZERO));
        }

        for(Product product : split.getProducts()) {
            int numberOfPersons = product.getPersons().size();
            BigDecimal pricePerPerson = product.getPrice().divide(BigDecimal.valueOf(numberOfPersons), 2, BigDecimal.ROUND_HALF_UP);
            for(String personName : product.getPersons()) {
                addPrice(results, pricePerPerson, personName);
            }
        }

        return new SplitResult(results);
    }

    private void addPrice(ArrayList<PersonResult> results, BigDecimal pricePerPerson, String personName) {
        for(PersonResult personResult : results) {
            if(personResult.getName().equals(personName)) {
                personResult.setAmount(personResult.getAmount().add(pricePerPerson));
            }
        }
    }
}
