package br.com.max.personapi.service;

import br.com.max.personapi.dto.response.MessageResponseDTO;
import br.com.max.personapi.entity.Person;
import br.com.max.personapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with id " + savedPerson.getId())
                .build();
    }
}
