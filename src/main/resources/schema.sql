create table course (
course_Id integer,
course_Name varchar(100),
name_Of_Instructor varchar(100), 
room_Number varchar(100));


create table student (
student_Id integer, 
first_Name varchar(100), 
last_Name varchar(100));

create table student_course_score (
id integer, 
student_id integer, 
course_id integer, 
score integer); 