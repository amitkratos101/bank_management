package bank.management.system;

import java.sql.*;

public class test1 {
    Connection connection;
    Statement statement;
    public test1() {
      try{
       connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","password");
       statement=connection.createStatement();
      }catch (Exception e){
          e.printStackTrace();
          /// sldjjahkjdhaskhdkasdhakshdakjhsancbxsakuhc
      }
    }
}
