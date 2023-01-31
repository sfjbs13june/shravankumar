package com.shravankumar.db.repository;

import com.shravankumar.db.model.Message;
import com.shravankumar.db.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

