package com.fakenews.detector.scraperserver.service;

import com.fakenews.detector.scraperserver.pojo.New;
import com.fakenews.detector.scraperserver.restClient.NewsClientRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;


/**
 * @author Alex Sánchez - @AleXxSnJR
 */

@Slf4j
@Service
public class PersistenceService implements IPersistenceService {

    @Autowired
    private NewsClientRest restClient;

    @Override
    public void save(New newParsed) {
        log.info(String.format("Enviando noticia a la api --  %s", newParsed.getUrl()));
        restClient.create(newParsed);
    }

    @Override
    public List<New> findAll() {
        return null;
    }

    @Override
    public New findById(Long id, Integer cantidad) {
        return null;
    }

    @Override
    public New update(New newParsed, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
