package hello;

/**
 * Created by jiachen215 on 2017/5/16.
 */
import org.springframework.data.repository.CrudRepository;
import hello.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}