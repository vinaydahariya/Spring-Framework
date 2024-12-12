package org.example;


import org.example.college.Student;
import org.example.college.Teacher;
import org.example.concepts.Car;
import org.example.concepts.ConfigClass;
import org.example.concepts.Engine;
import org.example.lifecycle.UserDao;
import org.example.qualifier.Human;
import org.example.scopes.Samosa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Project Strated" );
//        System.out.println("Starting point");
//
////        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
//
//        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);
//
//        //container
//        Engine engine1 = container.getBean("engine1", Engine.class);
//        engine1.startEngine();
//        System.out.println("-----------------");
//        Car car = container.getBean("car", Car.class);
//        car.start();
//
//        Student student = container.getBean("student", Student.class);
//        System.out.println(student);
//        student.show();
//
//        Teacher teacher = container.getBean("getTeacher", Teacher.class);
//        System.out.println(teacher);
//
//        Human vinay = container.getBean("human", Human.class);
//        vinay.tryColdDrink();

//        Car car = container.getBean("car", Car.class);
//        car.start();

//        UserDao userDao = container.getBean("userDao", UserDao.class);
//        userDao.saveUser();

//        container.registerShutdownHook();

        Samosa samosa = container.getBean("samosa", Samosa.class);
        Samosa samosa1 = container.getBean("samosa", Samosa.class);
        System.out.println(samosa);
        System.out.println(samosa1);
        container.close();


    }
}

/*
The control of creating and managing objects is
transferred to a container (Spring IOC Container).
It allows loose coupling between objects.
Design Principle : Spring IOC Container
 */
