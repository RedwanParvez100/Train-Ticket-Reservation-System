-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 28, 2022 at 05:06 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `train_ticket`
--

-- --------------------------------------------------------

--
-- Table structure for table `available_seats`
--

CREATE TABLE `available_seats` (
  `Train_name` text NOT NULL,
  `AC` int(3) NOT NULL,
  `Snighdha` int(3) NOT NULL,
  `Chair` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `available_seats`
--

INSERT INTO `available_seats` (`Train_name`, `AC`, `Snighdha`, `Chair`) VALUES
('Sundarban Express', 0, 2, 2),
('Banalata Express', 42, 20, 10),
('Kopotakha Express', 25, 20, 10);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sign_up_info`
--

CREATE TABLE `tbl_sign_up_info` (
  `name` varchar(40) NOT NULL,
  `phone_number` int(11) NOT NULL,
  `age` int(2) NOT NULL,
  `nid` int(8) NOT NULL,
  `mail` varchar(40) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_sign_up_info`
--

INSERT INTO `tbl_sign_up_info` (`name`, `phone_number`, `age`, `nid`, `mail`, `password`) VALUES
('Anis', 1820293924, 22, 22336655, 'anis@yahoo.com', 'khulja'),
('Rafid', 1820293925, 52, 55663322, 'rafid@gmail.com', 'kaamkor'),
('Parvez', 1820293927, 22, 22553344, 'parvez@gmail.com', 'ok123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_sign_up_info`
--
ALTER TABLE `tbl_sign_up_info`
  ADD PRIMARY KEY (`phone_number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
