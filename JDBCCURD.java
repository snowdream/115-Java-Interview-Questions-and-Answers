JDBC CRUD ( Create, Read, Update and Delete) example
The following are login credentials :
Database Server - localhost
User - root
Password - root
Database - test
Step1 : Establish connection with database     [ Type1 driver ]         [ Type4 driver ]

Step2 : Create following table in MySQL database server -
1 use test;
2 create table Emp
3 (
4 code varchar(10) primary key,
5 name varchar(40) null,
6 city varchar(20),
7 salary int
8 );
9 insert into Emp values('a001','Ram Kumar','Noida',10000);
Download


Step3 : Following code to insert record in the above table -
01 public void insertEmp(String code, String name, String city, int sal)
02     {
03         try {
04             ps = con.prepareStatement("insert into Emp values(?,?,?,?)");
05             ps.setString(1, code);
06             ps.setString(2, name);
07             ps.setString(3, city);
08             ps.setInt(4, sal);
09             int i = ps.executeUpdate();
10             if (i != 0){
11               System.out.println("Inserted");
12             } 
13             else {
14               System.out.println("not Inserted");
15             }
16         }
17         catch (Exception e) {
18             e.printStackTrace();
19         }
20     }
Step4 : Following source code is to update employee city and salary based on employee code -
01 public void updateEmp(String code, String city, int salary) {
02         try {
03             ps = con.prepareStatement("update emp set city=?,salary=salary+? 
               where code=?");
04             ps.setString(1, city);
05             ps.setInt(2, salary);
06             ps.setString(3, code);
07             int i = ps.executeUpdate();
08             if (i != 0) {
09                 System.out.println("updated");
10             } else {
11                 System.out.println("not updated");
12             }
13         } catch (Exception e) {
14             e.printStackTrace();
15         }
16     }


Step5 : Following source code is to delete an employee record based on employee code -


01 public void deleteEmp(String code) {
02         try {
03             ps = con.prepareStatement("delete from emp where code=?");
04             ps.setString(1, code);
05             int i = ps.executeUpdate();
06             if (i != 0) {
07                 System.out.println("deleted");
08             } else {
09                 System.out.println("not deleted");
10             }
11         } catch (Exception e) {
12             e.printStackTrace();
13         }
14     }
Step6 : Following source code is to display an employee record based on employee code -
01 public void dispAnEmp(String s) {
02         try {
03             ps = con.prepareStatement("select * from Emp where code=?");
04             ps.setString(1, s);
05             ResultSet res = ps.executeQuery();
06             if (res.next()) {
07                 System.out.print(res.getString(1));
08                 System.out.print(res.getString(2));
09                 System.out.print(res.getString(3));
10                 System.out.println(res.getString(4));
11             }
12         } catch (SQLException e) {
13             e.printStackTrace();
14         }
15     }
Step7 : Following source code is to display whole records from employee table -
01 public void dispAll() {
02         try {
03             Statement st = con.createStatement();
04             ResultSet res = st.executeQuery("select * from emp");
05             while (res.next()) {
06                 System.out.print(res.getString(1));
07                 System.out.print(res.getString(2));
08                 System.out.print(res.getString(3));
09                 System.out.println(res.getString(4));
10             }
11         } catch (SQLException e) {
12             e.printStackTrace();
13         }
14     }
