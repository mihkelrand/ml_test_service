-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Loomise aeg: Nov 27, 2016 kell 11:41 AM
-- Serveri versioon: 10.1.13-MariaDB
-- PHP versioon: 5.5.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Andmebaas: `diga`
--

-- --------------------------------------------------------

--
-- Tabeli struktuur tabelile `document`
--

CREATE TABLE `document` (
  `id` int(11) NOT NULL,
  `name` text COLLATE utf8_estonian_ci,
  `year` int(11) DEFAULT NULL,
  `series` text COLLATE utf8_estonian_ci,
  `companyId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;

--
-- Andmete tõmmistamine tabelile `document`
--

INSERT INTO `document` (`id`, `name`, `year`, `series`, `companyId`) VALUES
(1, 'Document1', 1933, '1.2.3.4', 1),
(2, 'Document1', 1933, '1.2.3.4', 1),
(3, 'Document2', 2010, '2.2.2.2', 1),
(4, 'Document2', 2010, '2.2.2.2', 2);

--
-- Indeksid tõmmistatud tabelitele
--

--
-- Indeksid tabelile `document`
--
ALTER TABLE `document`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT tõmmistatud tabelitele
--

--
-- AUTO_INCREMENT tabelile `document`
--
ALTER TABLE `document`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
