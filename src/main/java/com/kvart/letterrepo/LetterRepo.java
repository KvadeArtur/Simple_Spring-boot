package com.kvart.letterrepo;

import com.kvart.model.Letter;
import org.springframework.data.repository.CrudRepository;

public interface LetterRepo extends CrudRepository<Letter, Integer> {

}
