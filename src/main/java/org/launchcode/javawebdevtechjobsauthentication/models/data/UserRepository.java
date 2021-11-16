package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    
    User findByUsername(String username);

}
