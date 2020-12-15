package cn.tinydemo.service;

import cn.tinydemo.model.domain.UserDO;
import cn.tinydemo.repository.UserRepository;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author where.liu
 */
@ApplicationScoped
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Inject
    UserRepository userRepository;

    @Transactional
    public UserDO add(UserDO userDO) {
        logger.info(userDO.getUsername());
        Optional<UserDO> userOptional = userRepository.findByUsername(userDO.getUsername());
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        try {
            userRepository.persist(userDO);
            return userDO;
        } catch (ConstraintViolationException exception) {
            logger.info("保存用户出错");
        } catch (Exception exception) {
            logger.error(exception.getMessage());
        }
        return userDO;
    }


}
