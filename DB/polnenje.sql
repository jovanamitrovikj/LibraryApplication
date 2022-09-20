insert into PERSON(id_person, namee, surname, address, town, phone_num, birth, email, pass)
  values (1,'Marija','Markovska','ul.Partizanski Odredi','Skopje','070555666', '2001-10-27', 'marija@gmail.com', 'marija5932'),
         (2, 'Aleks','Aleksikj','ul.Oktomvriska Revolucija','Kumanovo','075855744', '2001-12-31', 'aleksa@hotmail.com', 'aleks8908');

insert into LIBRARY_DB(id_library, names, city) 
  values (201,'Sv.Braka Miladinovci', 'Skopje'),
       (202, 'Tane Georgievski','Kumanovo');

insert into EMPLOYEE(id_person,id_library,positionn)
   values (1,201,'bibliotekar');

insert into SCHOOL_TYPE (id_school, school_type_name)
   values (21,'Osnovno uciliste');

insert into MEMBERSHIP_TYPE (id_membership, mem_type_name)
   values(010, 'ucenik-clenstvo');

insert into MEMBER_LIBRARY (id_person, id_school, id_membership, id_library, isPayedMemebership, isPayedBook)
   values (1, 21, 010, 202, True, True);

insert into PRICELIST  (id_price , id_membership, price)
   values (41,010,200);

insert into ROOM (id_room, places, free_places, id_library)
   values (2,60,10,202);

insert into GENRE (id_genre, namee)
   values (17,'novel');

insert into BOOK (id_book, id_library, namee, book_num, if_free, book_price, book_price_late, id_genre)
   values (1,201,'Game of Thrones',4,True, 30, 45,17);


insert into REVIEW (id_review, rent_num, rate, id_book)
   values (7,15,8,1);

insert into WRITER (id_writer, namee, book_num)
   values (5,'George R. R. Martin',60);

insert into ONLINE_DOWNLOAD (id_onlineDown, id_book, id_member, downloaded)
   values(21,1,1,1);

insert into RESERVATION_BOOK (id_resBook, id_book, id_member, take_date, return_date, isReservedBook)
   values (07, 1, 1, '2022-02-5', '2021-02-18', True);


insert into RESERVATION_PLACE (id_resRoom, id_member, id_room, coming_date, comingTime, leavingTime)
   values(205, 1, 2, '2022-02-15', '13:00', '10:00');

insert into MEMBERSHIP_OF_SCHOOLTYPE (id_membership, id_school)
   values (010,21);


insert into WRITER_OF_BOOK (id_book,id_writer)
   values(1,5);