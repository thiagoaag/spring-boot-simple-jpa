package br.com.zup;

import br.com.zup.domain.Document;
import br.com.zup.domain.User;
import br.com.zup.repository.UserRepository;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AuditZupApplication.class)
public class AuditZupApplicationTests {

    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void testSaveUser() {
        
        User user = new User("Test Name Alterado");
        user.setDocument(new Document("RG"));
        user.setDocument(new Document("CPF"));
                
        userRepository.save(user);
        
        assertNotNull(userRepository.findOne(1L));
    }
}
