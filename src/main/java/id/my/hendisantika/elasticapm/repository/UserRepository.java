package id.my.hendisantika.elasticapm.repository;


import id.my.hendisantika.elasticapm.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elastic-apm
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/01/25
 * Time: 08.21
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
