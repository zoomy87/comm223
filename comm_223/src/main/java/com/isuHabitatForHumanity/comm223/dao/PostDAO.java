/**
 * 
 */
package com.isuHabitatForHumanity.comm223.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.isuHabitatForHumanity.comm223.model.Post;

/**
 * @author ericz
 *
 */
@Component
@PropertySource(value="classpath:application.properties")
public class PostDAO implements DAO {
	
	private static final Logger log = Logger.getLogger(PostDAO.class.getName());
	
	@Value("${db.name}")
	String endpoint;// connection string
	
	/* (non-Javadoc)
	 * @see com.isuHabitatForHumanity.comm223.dao.DAO#setItem()
	 */
	@Override
	public void setItem(String paragraph, String title) {
		ArrayList retVal= null;
		
		int rowCount = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
           log.log(Level.SEVERE, e.getMessage());
        }
        try {
        	log.info(endpoint);
            Connection DBConn = DriverManager.getConnection(endpoint, "group12", "Group12Meta");
            
//            String paragraph= "This is a paragraph I added with Java";
//            String title= "This is the article Title I added with Java";
            String insertString;
//            Statement stmt = DBConn.createStatement();
            insertString = "INSERT INTO post (paragraph, Title ) VALUES ( ?, ? )";
            PreparedStatement pstmt = DBConn.prepareStatement(insertString);
            pstmt.setString(1, paragraph);
            pstmt.setString(2, title);
            
            rowCount= pstmt.executeUpdate();
            log.info("rowCount: "+ rowCount);
            
        }catch(SQLException ex) {
        	log.log(Level.SEVERE, ex.getMessage());
        }
//		return retVal;
	}

	/* (non-Javadoc)
	 * @see com.isuHabitatForHumanity.comm223.dao.DAO#getItem()
	 */
	@Override
	public ArrayList getItem(int id) {
		ArrayList retVal= new ArrayList<Post>();
		
		int rowCount = 0;
		try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
           log.log(Level.SEVERE, e.getMessage());
        }
        try {
        	log.info("ID: "+id);
            Connection DBConn = DriverManager.getConnection(endpoint, "group12", "Group12Meta");
            log.info("Endpoint: "+endpoint);
            String insertString;
            insertString = "SELECT * from POST p WHERE p.postID= ?";
            log.info(insertString);
            PreparedStatement pstmt = DBConn.prepareStatement(insertString);
            pstmt.setInt(1, id);
            
            ResultSet rs= pstmt.executeQuery();
            if(rs.next()) {
            	Post p= new Post();
            	
            	p.setParagraph(rs.getString("paragraph"));
            	p.setPostID(rs.getString("postID"));
            	p.setTitle(rs.getString("Title"));
            	retVal.add(p);
            	
            }
            
        }catch(SQLException ex) {
        	log.log(Level.SEVERE, ex.getMessage());
        }
		
		return retVal;

	}

	@Override
	public ArrayList getAllItems() {
ArrayList retVal= new ArrayList<Post>();
		
		int rowCount = 0;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            Connection DBConn = DriverManager.getConnection(endpoint, "group12", "Group12Meta");

            String insertString;
            insertString = "SELECT * from POST";
            PreparedStatement pstmt = DBConn.prepareStatement(insertString);
            pstmt.setInt(1, 6);
            
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()) {
            	Post p= new Post();
            	
            	p.setParagraph(rs.getString("paragraph"));
            	p.setPostID(rs.getString("postID"));
            	p.setTitle(rs.getString("Title"));
            	
            	retVal.add(p);
            	
            }
            
        }catch(SQLException ex) {
        	log.log(Level.SEVERE, ex.getMessage());
        }
		
		return retVal;
	}

}
