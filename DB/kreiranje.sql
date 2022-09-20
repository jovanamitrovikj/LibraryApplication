--drop schema if exists project cascade;
create schema project;

--drop table if exists PERSON;
--drop table if exists LIBRARY_DB;
--drop table if exists EMPLOYEE;
--drop table if exists SCHOOL_TYPE;
--drop table if exists MEMBERSHIP_TYPE;
--drop table if exists MEMBER_LIBRARY;
--drop table if exists PRICE;
--drop table if exists ROOM;
--drop table if exists BOOK;
--drop table if exists GENRE;
--drop table if exists REVIEW;
--drop table if exists WRITER;
--drop table if exists ONLINE_DOWNLOAD;
--drop table if exists RESERVATION_BOOK;
--drop table if exists RESERVATION_PLACE;
--drop table if exists MEMBERSHIP_OF_SCHOOLTYPE;
--drop table if exists WRITER_OF_BOOK;


create table PERSON (
 id_person serial primary key,
 namee varchar(9) not null,
 surname varchar (12) not null,
 address varchar (25) not null,
 town varchar(10) not null, 
 phone_num varchar(15) not null,
 birth date,
 email varchar(45) not null,
 pass varchar (16) not null
);

create table LIBRARY_DB(
 id_library serial  primary key,
 names varchar (30) not null,
 city varchar(13) not null 
);

create table EMPLOYEE(
 id_person integer primary key,
 id_library integer not null,
 constraint fk_idperson_employee foreign key(id_person) references PERSON  (id_person),
 constraint fk_library_employee foreign key(id_library) references LIBRARY_DB (id_library),
 positionn varchar(14) not null
);

  
create table SCHOOL_TYPE(
 id_school serial  primary key,
 school_type_name varchar (40) not null 
);

create table MEMBERSHIP_TYPE (
 id_membership serial  primary key,
 mem_type_name varchar (35) not null
);


create table MEMBER_LIBRARY(
 id_person integer primary key,
 id_school integer not null,
 id_membership integer not null,
 id_library integer not null,
 isPayedMemebership boolean not null,
 isPayedBook boolean not null,
 constraint fk_person_member foreign key (id_person) references PERSON (id_person),
 constraint fk_school_member foreign key (id_school) references SCHOOL_TYPE (id_school),
 constraint fk_membership_member foreign key (id_membership) references MEMBERSHIP_TYPE (id_membership),
 constraint fk_libraryy_member foreign key (id_library) references LIBRARY_DB (id_library)
);


create table PRICELIST (
 id_price integer  primary key,
 id_membership  integer not null,
 price integer not null,
 constraint fk_membership_price foreign key (id_membership) references MEMBERSHIP_TYPE (id_membership)
);


create table ROOM (
 id_room integer primary  key,
 places integer not null,
 free_places integer not null,
 id_library integer not null,
 constraint fk_library_room foreign key (id_library) references LIBRARY_DB (id_library)
);


create table GENRE(
 id_genre serial primary key,
 namee varchar(60) not null
);


create table BOOK(
 id_book serial  primary key,
 id_library  integer not  null,
 id_genre integer  not null,
 namee varchar(120) not null, 
 book_num integer not null, 
 if_free boolean not null,
 book_price integer  not null,
 book_price_late integer not null, 
 constraint fk_library_book foreign key (id_library) references  LIBRARY_DB (id_library),
 constraint fk_genre_book foreign key (id_genre) references  GENRE (id_genre)
);

create table REVIEW (
 id_review integer primary key,
 rent_num integer not null,
 rate integer not null,
 id_book integer not null,
 constraint fk_book_review foreign key (id_book) references BOOK (id_book)
);


create table WRITER (
 id_writer serial primary key, 
 namee varchar(70) not null,
 book_num integer not null
);


create table ONLINE_DOWNLOAD (
 id_onlineDown integer primary  key,
 id_book integer not null,
 id_member integer not null,
 downloaded integer not null,
 constraint fk_book_download foreign key (id_book) references  BOOK (id_book),
 constraint fk_personmember_down foreign key (id_member) references  MEMBER_LIBRARY (id_person)
);


create table RESERVATION_BOOK(
 id_resBook serial  primary key,
 id_book integer  not null,
 id_member integer not null,
 take_date date not null,
 return_date date not null,
 isReservedBook boolean not null,
 constraint fk_book_reservation foreign key (id_book) references BOOK (id_book),
 constraint fk_person_member_reservation  foreign  key (id_member) references MEMBER_LIBRARY (id_person)
);

  
create table RESERVATION_PLACE(
 id_resRoom serial primary key,
 id_member integer not null,
 id_room integer not null,
 coming_date date not null,
 comingTime time not null,
 leavingTime time not null,
 constraint fk_person_member_place foreign key (id_member) references MEMBER_LIBRARY (id_person),
 constraint fk_room_place foreign key (id_room) references  ROOM (id_room)
);


create table MEMBERSHIP_OF_SCHOOLTYPE(
 id_membership integer  primary key,
 id_school  integer not null,
 constraint fk_membership_of foreign key (id_membership) references MEMBERSHIP_TYPE  (id_membership),
 constraint fk_school_of foreign key (id_school) references SCHOOL_TYPE  (id_school)
);

  
create table WRITER_OF_BOOK(
 id_book integer primary key,
 id_writer integer not null,
 constraint fk_book_who_write foreign key (id_book) references BOOK (id_book),
 constraint fk_write_who foreign key (id_writer) references WRITER (id_writer)
);


--DEL ZA BRISHENJE NA TABELI--

--delete from PERSON;
--delete from LIBRARY_DB;
--delete from EMPLOYEE;
--delete from SCHOOL_TYPE;
--delete from MEMBERSHIP_TYPE;
--delete from MEMBER_LIBRARY;
--delete from PRICE;
--delete from ROOM;
--delete from BOOK;
--delete from GENRE;
--delete from REVIEW;
--delete from WRITER;
--delete from ONLINE_DOWNLOAD;
--delete from RESERVATION_BOOK;
--delete from RESERVATION_PLACE;
--delete from MEMBERSHIP_OF_SCHOOLTYPE;
--delete from WRITER_OF_BOOK;

