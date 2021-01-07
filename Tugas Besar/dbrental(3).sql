-- phpMyAdmin SQL Dump
-- version 4.9.7deb1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 07, 2021 at 07:46 PM
-- Server version: 10.3.24-MariaDB-2
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbrental`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `idcustomer` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `nik` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`idcustomer`, `nama`, `alamat`, `nik`) VALUES
(1, 'Awang', 'Sidoarjo', '123'),
(2, 'Ilham', 'Surabaya', '321');

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `idmobil` int(11) NOT NULL,
  `plat` varchar(10) NOT NULL,
  `merek` varchar(10) NOT NULL,
  `cc` varchar(7) NOT NULL,
  `harga` int(25) NOT NULL,
  `bahanbakar` varchar(50) NOT NULL,
  `jenismesin` varchar(50) DEFAULT NULL,
  `jenistransmisi` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`idmobil`, `plat`, `merek`, `cc`, `harga`, `bahanbakar`, `jenismesin`, `jenistransmisi`) VALUES
(1, 'M 1924 RS', 'AVANZA', '1500', 150000, 'Pertamax', '-', 'CVT'),
(2, 'N 1234 LA', 'PAJERO D4D', '2442', 200000, 'Solar', 'Mesin Diesel', '-'),
(3, 'L 7777 P', 'Ferrari', '1000', 500000, 'Pertamax', 'mesin biasa', '-'),
(4, 'W 6666 PK', 'Xenia', '1200', 200000, 'Premium', '-', 'CVT'),
(5, 'N 4444 BO', 'Lamborgini', '2000', 700000, 'Pertamax', 'v8', '-');

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE `rental` (
  `idrental` int(11) NOT NULL,
  `idmobil` int(11) NOT NULL,
  `idcustomer` int(11) NOT NULL,
  `tanggalpinjam` date NOT NULL,
  `tanggalkembali` date NOT NULL,
  `totalbayar` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rental`
--

INSERT INTO `rental` (`idrental`, `idmobil`, `idcustomer`, `tanggalpinjam`, `tanggalkembali`, `totalbayar`) VALUES
(1, 1, 1, '2020-12-01', '2020-12-30', 4500000),
(2, 3, 2, '2020-01-01', '2021-01-01', 182000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`idcustomer`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`idmobil`);

--
-- Indexes for table `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`idrental`),
  ADD UNIQUE KEY `idmobil` (`idmobil`,`idcustomer`),
  ADD KEY `idcustomer` (`idcustomer`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `idcustomer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `mobil`
--
ALTER TABLE `mobil`
  MODIFY `idmobil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `rental`
--
ALTER TABLE `rental`
  MODIFY `idrental` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rental`
--
ALTER TABLE `rental`
  ADD CONSTRAINT `rental_ibfk_1` FOREIGN KEY (`idmobil`) REFERENCES `mobil` (`idmobil`),
  ADD CONSTRAINT `rental_ibfk_2` FOREIGN KEY (`idcustomer`) REFERENCES `customer` (`idcustomer`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
