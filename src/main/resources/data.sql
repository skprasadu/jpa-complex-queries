insert into course (course_Id, course_Name, name_Of_Instructor, room_Number) values ('1', 'dotnet', 'Krishna', '412');
insert into course (course_Id, course_Name, name_Of_Instructor, room_Number) values ('2', 'java', 'Aaron', '408');
insert into course (course_Id, course_Name, name_Of_Instructor, room_Number) values ('3', 'javascript', 'Saran', '410');
insert into course (course_Id, course_Name, name_Of_Instructor, room_Number) values ('4', 'python', 'Tom', '411');

insert into student (student_Id,  first_Name, last_Name) values ('1', 'Alex', 'A');
insert into student (student_Id,  first_Name, last_Name) values ('2', 'Jonathan', 'R');
insert into student (student_Id,  first_Name, last_Name) values ('3', 'David', 'A');
insert into student (student_Id,  first_Name, last_Name) values ('4', 'John', 'G');
insert into student (student_Id,  first_Name, last_Name) values ('5', 'Amir', 'R');

insert into student_course_score (id, student_id, course_id, score) values (1, 1, 1, 40);
insert into student_course_score (id, student_id, course_id, score) values (2, 1, 2, 41);
insert into student_course_score (id, student_id, course_id, score) values (3, 2, 3, 42);
insert into student_course_score (id, student_id, course_id, score) values (4, 3, 2, 43);
insert into student_course_score (id, student_id, course_id, score) values (5, 4, 2, 45);
insert into student_course_score (id, student_id, course_id, score) values (6, 5, 2, 46);
insert into student_course_score (id, student_id, course_id, score) values (7, 2, 2, 47);
insert into student_course_score (id, student_id, course_id, score) values (8, 5, 3, 48);