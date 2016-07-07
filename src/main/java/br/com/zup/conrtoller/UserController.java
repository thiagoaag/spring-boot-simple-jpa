package br.com.zup.conrtoller;

import br.com.zup.domain.User;
import br.com.zup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserRepository userRepository;
    
    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }
      
    @RequestMapping("/")
    public String index(){
        
        userRepository.save(new User("Test Name"));
        
        
        return userRepository.findAll().toString();
    }
    
}
