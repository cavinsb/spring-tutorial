package com.bencavins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/bencavins/beans/beans.xml");

        Person person = (Person) context.getBean("person");

        person.setTaxId(456789);
        
        System.out.println(person);
        
        Address address2 = (Address) context.getBean("address2");
        System.out.println(address2);

        ((ClassPathXmlApplicationContext) context).close();
    }

}
