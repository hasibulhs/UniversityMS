-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 29, 2021 at 06:06 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ums`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `name` varchar(20) DEFAULT NULL,
  `fathers_name` varchar(20) DEFAULT NULL,
  `age` varchar(5) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `rollno` varchar(15) DEFAULT NULL,
  `course` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `rollno`, `course`) VALUES
('Najifa Akter', 'F', '20', '00.00.0000', 'Mohammadpur', '017', 'najifaakter@gmail.com', '1533649', 'Computer Science'),
('Marjahan Akther', 'F', '20', '00.00.0000', 'Mirpur', '0011', 'marjahanakther@gmail.com', '15339597', 'Computer Science'),
('Jannatul Mawa', 'F', '20', '00.00.0000', 'Savar', '01879377856', 'jannatulmawa@gmail.com', '15336179', 'Civil'),
('Hasibul Hossain', 'F', '20', '00.00.0000', 'Shahbag', '01966901950', 'hasibulhossain@gmail.com', '15331193', 'Electronics');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `name` varchar(20) DEFAULT NULL,
  `fathers_name` varchar(20) DEFAULT NULL,
  `age` varchar(5) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `education` varchar(50) DEFAULT NULL,
  `emp_id` varchar(15) DEFAULT NULL,
  `dept` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `education`, `emp_id`, `dept`) VALUES
('Ali Azgar', 'FF', '', '00.00.0000', '', '01771932324', 'azgar@bubt.edu.bd', 'B.Sc', '1017128', 'Computer Science'),
('Md. Ashiqur Rahman', 'FF', '', '00.00.0000', '', '', 'ashiqur@bubt.edu.bd', 'B.Sc', '1014908', 'Computer Science'),
('Humayra Ahmed', 'FF', '', '00.00.0000', '', '', 'humayra_ahmed@bubt.edu.bd', 'B.Sc', '1018632', 'Computer Science'),
('Mohammad Zaeed', 'FF', '', '00.00.0000', '', '01991592404', 'zaeed@bubt.edu.bd', 'B.Sc', '1019962', 'Computer Science'),
('Md Abu Quwsar Ohi', 'FF', '', '00.00.0000', '', '01821659485', 'quwsarohi@bubt.edu.bd', 'B.Sc', '1017238', 'Computer Science');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
