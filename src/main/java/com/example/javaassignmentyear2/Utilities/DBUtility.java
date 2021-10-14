package com.example.javaassignmentyear2.Utilities;

import com.example.javaassignmentyear2.Models.GotChar;
import javafx.scene.chart.XYChart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    //gets all the db info
    private static String user = "student";
    private static String pw = "student";
    private static String connectURL = "jdbc:mysql://localhost:3306/javaProjects";

    public static XYChart.Series<String, Integer> getScreenTime() //this method makes the bar graph
    {
        XYChart.Series<String, Integer> ScreenData = new XYChart.Series<>(); //Bar graph object created

        String sql ="SELECT name, screentime " +
                "FROM gotscreentimes " +
                "ORDER BY 2 DESC LIMIT 25;";//what is run of the db
        try(
                //db querry step
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {

            while (resultSet.next())//for each row returned by the query, add it to the chart
            {
                ScreenData.getData().add(new XYChart.Data<>(resultSet.getString("name"),
                        resultSet.getInt(2)));


            }
        }catch(Exception e)//if error with query
        {
            e.printStackTrace();
        }

        return ScreenData;//return to contoller with data
    }

    public static ArrayList<GotChar> getGotData()//creating the table method
    {
        ArrayList<GotChar> gotChars = new ArrayList<>();//array to hold the character objects

        String sql ="SELECT ID,name,screentime,episodes,portrayed_by_name AS actor " +
                    "FROM gotscreentimes;";//sql statement


        try(//querys db
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {

            while (resultSet.next())//for each row returned, make a new character object
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int episodes = resultSet.getInt("episodes");
                double screenTime = resultSet.getDouble("screentime");
                String actor = resultSet.getString("actor");

                GotChar newGotChar = new GotChar( id, episodes, name, actor, screenTime);
                //System.out.println(newCharacter.toString());
                gotChars.add(newGotChar);//array of all characters

            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return gotChars;//returns results
    }
}
