package com.example.hibernate03.service;

import com.example.hibernate03.entity.Address;
import com.example.hibernate03.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
public class InsertIntoTable {
    public static void main(String[] args) throws IOException {
        // Creating student
        Student st = new Student();
        st.setName("JOHN");
        st.setCity("DELHI");
        // Creating address
        Address address = new Address();
        address.setStreet("Street-1");
        address.setCity("DELHI");
        address.setOpen(true);
        address.setX(10.2);
        address.setAddedDate(new Date());
        // Load image from resources
        Resource resource = new ClassPathResource("static/images/bg.png");
        byte[] data;
        try (InputStream in = resource.getInputStream()) {
            data = in.readAllBytes();
        }
        byte[] resizedImage = resizeImage(data, 200, 200);
        address.setImage(resizedImage);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(st);
        session.save(address);

        transaction.commit();
        session.close();
    }
    public static byte[] resizeImage(byte[] originalImage, int targetWidth, int targetHeight) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(originalImage));
        Image scaledImage = bufferedImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);

        resizedImage.getGraphics().drawImage(scaledImage, 0, 0, null);

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(resizedImage, "jpg", baos);
            return baos.toByteArray();
        }
    }
}
