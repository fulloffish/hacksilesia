package com.example.hacksilesia.track;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface TrackRepository extends CrudRepository<Track, Long> {

    List<Track> findAll();
    Track findByLink(String link);
    Track findById(Long id);
}
