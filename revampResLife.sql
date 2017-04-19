create database revampResLife;

use revampResLife;


/* user rick, pass squanch */

create table CUMember (firstname VARCHAR(15), lastname VARCHAR(15), 
	email VARCHAR(20), phone_number BIGINT, gender CHAR(1), CU_ID INTEGER);

create table ResidentProfile ();

create table Building ();

create table Room ();

create table RoomAttribute ();

create table RoommateAgreement ();

create table RoomConditionForm ();

create table FrontDeskManager ();

create table ResidentManager ();