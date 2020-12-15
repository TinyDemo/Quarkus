package cn.tinydemo.controller;

import cn.tinydemo.model.domain.UserDO;
import cn.tinydemo.repository.UserRepository;
import cn.tinydemo.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author where.liu
 */
@Consumes("*/*")
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
    @Inject
    UserRepository userRepository;
    @Inject
    UserService userService;

    @GET
    @Path("/count")
    @Produces(MediaType.APPLICATION_JSON)
    public Long count() {
        return userRepository.count();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDO> list() {
        return userRepository.listAll();
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public UserDO add() {
        UserDO userDO = new UserDO();
        userDO.setUsername("username");
        userDO.setPassword("password");
       return userService.add(userDO);
    }
}
