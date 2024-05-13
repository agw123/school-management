-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2024 at 01:12 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `Level` int(1) NOT NULL,
  `Section` char(1) NOT NULL CHECK (`Section` in ('a','b','c','d'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`Level`, `Section`) VALUES
(1, 'a'),
(1, 'b'),
(1, 'c'),
(1, 'd'),
(2, 'a'),
(2, 'b'),
(2, 'c'),
(2, 'd'),
(3, 'a'),
(3, 'b'),
(3, 'c'),
(3, 'd'),
(4, 'a'),
(4, 'b'),
(4, 'c'),
(4, 'd'),
(5, 'a'),
(5, 'b'),
(5, 'c'),
(5, 'd');

-- --------------------------------------------------------

--
-- Table structure for table `clerk`
--

CREATE TABLE `clerk` (
  `codiceFiscale` varchar(16) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `birthDate` date NOT NULL,
  `birthPlace` varchar(255) NOT NULL,
  `gender` char(1) NOT NULL,
  `office` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `clerk`
--

INSERT INTO `clerk` (`codiceFiscale`, `name`, `surname`, `birthDate`, `birthPlace`, `gender`, `office`, `email`) VALUES
('ABCDEF01G23H401A', 'John', 'Doe', '1990-05-15', 'Rome', 'M', 'Office A', 'john.doe@example.com'),
('BCDEFG12H34I402B', 'Alice', 'Smith', '1995-10-20', 'Milan', 'F', 'Office B', 'alice.smith@example.com'),
('CDEFGH23I45J403C', 'Robert', 'Johnson', '1988-03-25', 'Naples', 'M', 'Office C', 'robert.johnson@example.com'),
('DEFGHI34J56K404D', 'Emily', 'Brown', '1992-07-10', 'Turin', 'F', 'Office D', 'emily.brown@example.com'),
('EFGHIJ45K67L405E', 'Michael', 'Davis', '1985-12-05', 'Florence', 'M', 'Office E', 'michael.davis@example.com');

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `Date` date DEFAULT NULL,
  `Student_Key` varchar(16) DEFAULT NULL,
  `Student_Name` varchar(100) DEFAULT NULL,
  `Teacher_Key` varchar(16) DEFAULT NULL,
  `Teacher_Name` varchar(100) DEFAULT NULL,
  `Subject_Key` varchar(100) DEFAULT NULL,
  `Vote` int(11) DEFAULT NULL CHECK (`Vote` >= 1 and `Vote` <= 10)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`Date`, `Student_Key`, `Student_Name`, `Teacher_Key`, `Teacher_Name`, `Subject_Key`, `Vote`) VALUES
('2024-01-15', 'ABCDEF01G23H401A', 'Giorgio Conti', 'ABCDEF01G23H456I', 'Giuseppe Bianchi', 'Mathematics', 8),
('2024-02-20', 'BCDEFG12H34I402B', 'Silvia De Luca', 'BCDEFG12H34I567J', 'Maria Rossi', 'Physics', 7),
('2024-03-10', 'CDEFGH23I45J403C', 'Alessio Mancini', 'CDEFGH23I45J678K', 'Antonio Ferrari', 'Chemistry', 9),
('2024-04-05', 'DEFGHI34J56K404D', 'Sofia Gallo', 'DEFGHI34J56K789L', 'Anna Ricci', 'Biology', 6),
('2024-05-12', 'EFGHIJ45K67L405E', 'Luigi Moretti', 'EFGHIJ45K67L890M', 'Luca Esposito', 'History', 8),
('2024-06-18', 'FGHIJK56L78M406F', 'Valentina Ferrari', 'FGHIJK56L78M901N', 'Laura Mancini', 'English', 7),
('2024-07-25', 'GHIJKL67M89N407G', 'Matteo Ricci', 'GHIJKL67M89N012O', 'Paolo Gallo', 'Physical Education', 9),
('2024-08-30', 'HIJKLM78N90O408H', 'Anna Martini', 'HIJKLM78N90O123P', 'Francesca Martini', 'Geography', 8),
('2024-09-06', 'IJKLMN89O01P409I', 'Giovanni Marini', 'IJKLMN89O01P234Q', 'Marco Conti', 'Computer Science', 7),
('2024-10-14', 'JKLMNO90P12Q410J', 'Chiara Rossi', 'JKLMNO90P12Q345R', 'Elena De Luca', 'Arts', 9);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `CodiceFiscale` varchar(16) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Surname` varchar(50) NOT NULL,
  `BrthDate` date NOT NULL,
  `BrthPlace` varchar(100) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `gender` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`CodiceFiscale`, `Name`, `Surname`, `BrthDate`, `BrthPlace`, `Address`, `gender`) VALUES
('ABCDEF01G23H401A', 'Giorgio', 'Conti', '2005-02-15', 'Roma', 'Via del Corso 1, Roma', 'M'),
('ABCDEF01G23H456I', 'Marco', 'Rossi', '2009-05-01', 'Roma', 'Via Appia 123, Roma', 'M'),
('ABCDEF56G78H426Z', 'Aurora', 'Palmieri', '2010-03-10', 'Roma', 'Via Nazionale 26, Roma', 'F'),
('BCDEFG12H34I402B', 'Silvia', 'De Luca', '2006-03-16', 'Roma', 'Via Appia 2, Roma', 'F'),
('BCDEFG12H34I567J', 'Giulia', 'Bianchi', '2008-08-02', 'Milano', 'Via Montenapoleone 456, Milano', 'F'),
('BCDEFG67H89I427A', 'Giacomo', 'Battaglia', '2011-04-11', 'Roma', 'Via del Tritone 27, Roma', 'M'),
('CDEFGH23I45J403C', 'Alessio', 'Mancini', '2007-04-17', 'Roma', 'Via Veneto 3, Roma', 'M'),
('CDEFGH23I45J678K', 'Alessandro', 'Ricci', '2007-12-03', 'Napoli', 'Via Toledo 789, Napoli', 'F'),
('CDEFGH78I90J428B', 'Alice', 'Colombo', '2012-05-12', 'Roma', 'Via dei Fori Imperiali 28, Roma', 'F'),
('DEFGHI34J56K404D', 'Sofia', 'Gallo', '2008-05-18', 'Roma', 'Via Condotti 4, Roma', 'M'),
('DEFGHI34J56K789L', 'Chiara', 'Moretti', '2006-10-04', 'Torino', 'Via Po 1011, Torino', 'F'),
('DEFGHI89J01K429C', 'Lorenzo', 'Mariani', '2013-06-13', 'Roma', 'Via Sistina 29, Roma', 'M'),
('EFGHIJ45K67L405E', 'Luigi', 'Moretti', '2009-06-19', 'Roma', 'Via Nazionale 5, Roma', 'F'),
('EFGHIJ45K67L890M', 'Francesca', 'Conti', '2005-09-05', 'Firenze', 'Via dei Calzaiuoli 1213, Firenze', 'M'),
('EFGHIJ90K12L430D', 'Erika', 'Piazza', '2014-07-14', 'Roma', 'Via del Babuino 30, Roma', 'F'),
('FGHIJK56L78M406F', 'Valentina', 'Ferrari', '2010-07-20', 'Roma', 'Via Sistina 6, Roma', 'M'),
('FGHIJK56L78M901N', 'Luca', 'Romano', '2004-07-06', 'Roma', 'Via del Corso 1415, Roma', 'F'),
('GHIJKL67M89N012O', 'Elena', 'Galli', '2003-06-07', 'Palermo', 'Via Maqueda 1617, Palermo', 'M'),
('GHIJKL67M89N407G', 'Matteo', 'Ricci', '2011-08-21', 'Roma', 'Via del Tritone 7, Roma', 'F'),
('HIJKLM78N90O123P', 'Simone', 'Greco', '2002-04-08', 'Genova', 'Via Garibaldi 1819, Genova', 'M'),
('HIJKLM78N90O408H', 'Anna', 'Martini', '2012-09-22', 'Roma', 'Via dei Fori Imperiali 8, Roma', 'F'),
('IJKLMN89O01P234Q', 'Martina', 'Ferrari', '2001-03-09', 'Bologna', 'Via dell\'Indipendenza 2021, Bologna', 'M'),
('IJKLMN89O01P409I', 'Giovanni', 'Marini', '2013-10-23', 'Roma', 'Via del Babuino 9, Roma', 'F'),
('JKLMNO90P12Q345R', 'Davide', 'Marini', '2000-01-10', 'Roma', 'Via Veneto 2223, Roma', 'M'),
('JKLMNO90P12Q410J', 'Chiara', 'Rossi', '2014-11-24', 'Roma', 'Via del Corso 10, Roma', 'F'),
('LMNOPQ01R23S411K', 'Paolo', 'Galli', '2015-12-25', 'Roma', 'Via dei Condotti 11, Roma', ''),
('MNOPQR12S34T412L', 'Elisa', 'Esposito', '2016-01-26', 'Roma', 'Via della Conciliazione 12, Roma', ''),
('NOPQRS23T45U413M', 'Andrea', 'Romano', '2017-02-27', 'Roma', 'Via del Babuino 13, Roma', ''),
('OPQRST34U56V414N', 'Laura', 'Barbieri', '2018-03-28', 'Roma', 'Via Nazionale 14, Roma', ''),
('PQRSTU45V67W415O', 'Filippo', 'Pellegrini', '2019-04-29', 'Roma', 'Via Veneto 15, Roma', ''),
('QRSTUV56W78X416P', 'Valeria', 'Guerini', '2020-05-30', 'Roma', 'Via dei Fori Imperiali 16, Roma', ''),
('RSTUVW67X89Y417Q', 'Massimo', 'Costa', '2021-06-01', 'Roma', 'Via Sistina 17, Roma', ''),
('STUVWX78Y90Z418R', 'Federica', 'Monti', '2022-07-02', 'Roma', 'Via del Tritone 18, Roma', ''),
('TUVWXY89Z01A419S', 'Antonio', 'Santoro', '2023-08-03', 'Roma', 'Via Condotti 19, Roma', ''),
('UVWXYZ90A12B420T', 'Elena', 'Fabbri', '2024-09-04', 'Roma', 'Via Appia 20, Roma', ''),
('VWXYZA01B23C421U', 'Riccardo', 'Caruso', '2005-10-05', 'Roma', 'Via Nazionale 21, Roma', ''),
('WXYZAB12C34D422V', 'Francesca', 'Sanna', '2006-11-06', 'Roma', 'Via Veneto 22, Roma', ''),
('XYZABC23D45E423W', 'Davide', 'Cattaneo', '2007-12-07', 'Roma', 'Via del Corso 23, Roma', ''),
('YZABCD34E56F424X', 'Sara', 'De Angelis', '2008-01-08', 'Roma', 'Via Condotti 24, Roma', ''),
('ZABCDE45F67G425Y', 'Stefano', 'Vitali', '2009-02-09', 'Roma', 'Via Appia 25, Roma', '');

-- --------------------------------------------------------

--
-- Table structure for table `student_class`
--

CREATE TABLE `student_class` (
  `year` int(11) NOT NULL,
  `student_key` varchar(16) NOT NULL,
  `class_section` char(1) NOT NULL,
  `class_level` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_class`
--

INSERT INTO `student_class` (`year`, `student_key`, `class_section`, `class_level`) VALUES
(2024, 'ABCDEF01G23H401A', 'A', 1),
(2024, 'ABCDEF01G23H456I', 'B', 1),
(2024, 'ABCDEF56G78H426Z', 'B', 1),
(2024, 'BCDEFG12H34I402B', 'C', 1),
(2024, 'BCDEFG12H34I567J', 'A', 1),
(2024, 'BCDEFG67H89I427A', 'C', 1),
(2024, 'CDEFGH23I45J403C', 'A', 1),
(2024, 'CDEFGH23I45J678K', 'C', 1),
(2024, 'CDEFGH78I90J428B', 'D', 1),
(2024, 'DEFGHI34J56K404D', 'A', 1),
(2024, 'DEFGHI34J56K789L', 'D', 1),
(2024, 'DEFGHI89J01K429C', 'B', 1),
(2024, 'EFGHIJ45K67L405E', 'C', 1),
(2024, 'EFGHIJ45K67L890M', 'A', 1),
(2024, 'EFGHIJ90K12L430D', 'B', 1),
(2024, 'FGHIJK56L78M406F', 'D', 1),
(2024, 'FGHIJK56L78M901N', 'A', 1),
(2024, 'GHIJKL67M89N012O', 'C', 1),
(2024, 'GHIJKL67M89N407G', 'D', 1),
(2024, 'HIJKLM78N90O123P', 'A', 1),
(2024, 'HIJKLM78N90O408H', 'B', 1),
(2024, 'IJKLMN89O01P234Q', 'C', 1),
(2024, 'IJKLMN89O01P409I', 'D', 1),
(2024, 'JKLMNO90P12Q345R', 'A', 1),
(2024, 'JKLMNO90P12Q410J', 'B', 1);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `Name` varchar(100) NOT NULL,
  `Description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`Name`, `Description`) VALUES
('Arts', 'Arts encompass a wide range of creative expression, including visual arts, performing arts, and literary arts.'),
('Biology', 'Biology is the study of living organisms and their interactions with each other and their environments.'),
('Chemistry', 'Chemistry is the study of the composition, structure, and properties of substances and the changes they undergo.'),
('Computer Science', 'Computer Science is the study of computers and computational systems.'),
('English', 'English is the study of the English language, literature, and communication skills.'),
('Geography', 'Geography is the study of the Earth\'s landscapes, environments, and the relationships between people and their environments.'),
('History', 'History is the study of past events, particularly in human affairs.'),
('Mathematics', 'Mathematics is the study of numbers, quantities, and shapes.'),
('Physical Education', 'Physical Education focuses on physical fitness, sports, and exercise.'),
('Physics', 'Physics is the study of matter, energy, and the fundamental forces of nature.');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `CF` varchar(16) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Surname` varchar(50) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `gender` char(1) NOT NULL CHECK (`gender` in ('F','M')),
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`CF`, `Name`, `Surname`, `Address`, `gender`, `email`) VALUES
('ABCDEF01G23H456I', 'Giuseppe', 'Bianchi', 'Via del Corso 1, Roma', 'M', 'Giuseppe.Bianchi@example.com'),
('BCDEFG12H34I567J', 'Maria', 'Rossi', 'Via Nazionale 2, Roma', 'F', 'Maria.Rossi@example.com'),
('CDEFGH23I45J678K', 'Antonio', 'Ferrari', 'Via Appia 3, Roma', 'M', 'Antonio.Ferrari@example.com'),
('DEFGHI34J56K789L', 'Anna', 'Ricci', 'Via Veneto 4, Roma', 'F', 'Anna.Ricci@example.com'),
('EFGHIJ45K67L890M', 'Luca', 'Esposito', 'Via Condotti 5, Roma', 'M', 'Luca.Esposito@example.com'),
('FGHIJK56L78M901N', 'Laura', 'Mancini', 'Via dei Fori Imperiali 6, Roma', 'F', 'Laura.Mancini@example.com'),
('GHIJKL67M89N012O', 'Paolo', 'Gallo', 'Via del Tritone 7, Roma', 'M', 'Paolo.Gallo@example.com'),
('HIJKLM78N90O123P', 'Francesca', 'Martini', 'Via del Babuino 8, Roma', 'F', 'Francesca.Martini@example.com'),
('IJKLMN89O01P234Q', 'Marco', 'Conti', 'Via Sistina 9, Roma', 'M', 'Marco.Conti@example.com'),
('JKLMNO90P12Q345R', 'Elena', 'De Luca', 'Via dei Condotti 10, Roma', 'F', 'Elena.De Luca@example.com'),
('LMNOPQ01R23S456T', 'Giovanni', 'Romano', 'Via Maqueda 11, Roma', 'M', 'Giovanni.Romano@example.com'),
('MNOPQR12S34T567U', 'Roberta', 'Fabbri', 'Via Montenapoleone 12, Roma', 'F', 'Roberta.Fabbri@example.com'),
('NOPQRS23T45U678V', 'Stefano', 'Vitali', 'Via del Corso 13, Roma', 'M', 'Stefano.Vitali@example.com'),
('OPQRST34U56V789W', 'Silvia', 'Marchetti', 'Via Veneto 14, Roma', 'F', 'Silvia.Marchetti@example.com'),
('PQRSTU45V67W890X', 'Andrea', 'Marini', 'Via Appia 15, Roma', 'M', 'Andrea.Marini@example.com');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_class`
--

CREATE TABLE `teacher_class` (
  `year` int(11) NOT NULL,
  `teacher_key` varchar(16) NOT NULL,
  `class_section` char(1) NOT NULL,
  `class_level` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher_class`
--

INSERT INTO `teacher_class` (`year`, `teacher_key`, `class_section`, `class_level`) VALUES
(2024, 'ABCDEF01G23H456I', 'A', 1),
(2024, 'BCDEFG12H34I567J', 'B', 1),
(2024, 'CDEFGH23I45J678K', 'B', 2),
(2024, 'DEFGHI34J56K789L', 'C', 3),
(2024, 'EFGHIJ45K67L890M', 'A', 3);

-- --------------------------------------------------------

--
-- Table structure for table `teacher_subject`
--

CREATE TABLE `teacher_subject` (
  `teacher_key` varchar(16) NOT NULL,
  `subject_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher_subject`
--

INSERT INTO `teacher_subject` (`teacher_key`, `subject_name`) VALUES
('ABCDEF01G23H456I', 'Arts'),
('BCDEFG12H34I567J', 'Arts'),
('CDEFGH23I45J678K', 'Arts'),
('DEFGHI34J56K789L', 'Mathematics'),
('EFGHIJ45K67L890M', 'Mathematics'),
('FGHIJK56L78M901N', 'Mathematics'),
('GHIJKL67M89N012O', 'Biology'),
('HIJKLM78N90O123P', 'Chemistry'),
('IJKLMN89O01P234Q', 'Computer Science'),
('JKLMNO90P12Q345R', 'English'),
('LMNOPQ01R23S456T', 'Geography'),
('MNOPQR12S34T567U', 'History'),
('NOPQRS23T45U678V', 'Physical Education'),
('OPQRST34U56V789W', 'Physics'),
('PQRSTU45V67W890X', 'Arts');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`Level`,`Section`);

--
-- Indexes for table `clerk`
--
ALTER TABLE `clerk`
  ADD PRIMARY KEY (`codiceFiscale`);

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD KEY `Student_Key` (`Student_Key`),
  ADD KEY `Teacher_Key` (`Teacher_Key`),
  ADD KEY `Subject_Key` (`Subject_Key`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`CodiceFiscale`);

--
-- Indexes for table `student_class`
--
ALTER TABLE `student_class`
  ADD PRIMARY KEY (`year`,`student_key`,`class_section`,`class_level`),
  ADD KEY `student_key` (`student_key`),
  ADD KEY `class_section` (`class_section`,`class_level`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`CF`);

--
-- Indexes for table `teacher_class`
--
ALTER TABLE `teacher_class`
  ADD PRIMARY KEY (`year`,`teacher_key`,`class_section`,`class_level`),
  ADD KEY `teacher_key` (`teacher_key`),
  ADD KEY `class_section` (`class_section`,`class_level`);

--
-- Indexes for table `teacher_subject`
--
ALTER TABLE `teacher_subject`
  ADD PRIMARY KEY (`teacher_key`,`subject_name`),
  ADD KEY `subject_name` (`subject_name`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `exam`
--
ALTER TABLE `exam`
  ADD CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`Student_Key`) REFERENCES `student` (`CodiceFiscale`),
  ADD CONSTRAINT `exam_ibfk_2` FOREIGN KEY (`Teacher_Key`) REFERENCES `teacher` (`CF`),
  ADD CONSTRAINT `exam_ibfk_3` FOREIGN KEY (`Subject_Key`) REFERENCES `subject` (`Name`);

--
-- Constraints for table `student_class`
--
ALTER TABLE `student_class`
  ADD CONSTRAINT `student_class_ibfk_1` FOREIGN KEY (`student_key`) REFERENCES `student` (`CodiceFiscale`);

--
-- Constraints for table `teacher_class`
--
ALTER TABLE `teacher_class`
  ADD CONSTRAINT `teacher_class_ibfk_1` FOREIGN KEY (`teacher_key`) REFERENCES `teacher` (`CF`);

--
-- Constraints for table `teacher_subject`
--
ALTER TABLE `teacher_subject`
  ADD CONSTRAINT `teacher_subject_ibfk_1` FOREIGN KEY (`teacher_key`) REFERENCES `teacher` (`CF`),
  ADD CONSTRAINT `teacher_subject_ibfk_2` FOREIGN KEY (`subject_name`) REFERENCES `subject` (`Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
