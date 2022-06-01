//package com.kanban_board.kanban_user_authentication.services;
//
//import UserAlreadyExistsException;
//import User;
//import UserRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//import javax.persistence.Column;
//import java.util.Optional;
//
//@ExtendWith(MockitoExtension.class)
//public class UserServicesTest {
//
//    //reference for User
//    private User user1, user2;
//
//
//    //creating a mock layer of repository for testing purpose
//    @Mock
//    private UserRepository userRepository;
//
//    //creating a reference of service layer and inject the mock
//    @InjectMocks
//    private UserServicesImpl userServicesimpl;
//
//    @BeforeEach()
//    public void setUp(){
//        user1= new User(1,"kevin", "kevin@gmail.com", "kev123");
//        user2= new User(2,"Kevin Mathew", "kevin@gmail.com", "kev123");
//    }
//
//    @AfterEach()
//        public void tearDown(){
//            user1=null;
//            user2=null;
//            userRepository.deleteAll();
//        }
//
//
////    @Test
////    public void givenUserEmailForRegistration()throws UserAlreadyExistsException{
////        when(userRepository.save(user1)).thenReturn(user1);
////        assertEquals(user1, userServicesimpl.registerUser(user1));
////        verify(userRepository, times(1)).save(any());
////
////    }
////
////    @Test
////    public void givenSameEmailIdAgainForRegistration()throws UserAlreadyExistsException{
////
////        when(userRepository.save(user2)).thenReturn(user2);
////        assertEquals(user2, userServicesimpl.registerUser(user2));
////        verify(userRepository, times(1)).save(any());
////        System.out.println("Registration Failed. Email Already Exists");
////    }
//
//}
