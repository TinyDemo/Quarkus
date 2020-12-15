package cn.tinydemo.repository;

import cn.tinydemo.model.domain.UserDO;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

/**
 * @author where.liu
 */
@ApplicationScoped
public class UserRepository implements PanacheRepository<UserDO> {
    public Optional<UserDO> findByUsername(String username) {
        return find("username",username).firstResultOptional();
    }
}
