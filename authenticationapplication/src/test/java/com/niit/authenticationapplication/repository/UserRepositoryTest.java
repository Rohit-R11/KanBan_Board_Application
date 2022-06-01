//package com.kanban_board.kanban_user_authentication.repository;
//
//import UserAlreadyExistsException;
//import UserNotFoundException;
//import User;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(MockitoExtension.class)
//@DataJpaTest
//public class UserRepositoryTest {
//    private User user1, user2;
//
//
//    //creating a mock layer of repository for testing purpose
//    @Autowired
//    private UserRepository userRepository;
//
//    @BeforeEach()
//    public void setUp(){
//        //using builder pattern to build the obj
//        user1= User.builder().userId(1).userName("shena").emailId("shen@er.com").password("s123").build();
//        user2= User.builder().userId(2).userName("Hari").emailId("Hari@gmail.com").password("h34123").build();
//
//    }
//
//    @AfterEach()
//    public void tearDown(){
//        user1=null;
//        user2=null;
//    }
//
//
////    @Test
////    public void givenUserDetailsToSaveUser()throws UserAlreadyExistsException {
////        User savedUser = userRepository.save(user1);
////        Assertions.assertThat(savedUser.getUserId()).isGreaterThan(0);
////    }
//
////    @Test
////    public void givenCorrectUserEmailForLogin()throws UserNotFoundException {
////
////        User savedUser = userRepository.save(user2);
////        User userFound=userRepository.findByEmailIdAndPassword(user2.getEmailId(),user2.getPassword());
////        assertEquals(user2.getEmailId(), userFound.getEmailId());
////    }
//
////    @Test
////    public void givenWrongUserEmailForLogin()throws UserNotFoundException {
////
////        User savedUser = userRepository.save(user2);
////        User userFound=userRepository.findByEmailIdAndPassword("wrongemail@e.com","12345");
////        assertEquals(null, userFound);
////        System.out.println("Expected: " + null);
////        System.out.println("Actual: " + userFound);
////    }
//
//}
