-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2023 at 07:19 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biologia`
--

-- --------------------------------------------------------

--
-- Table structure for table `juegos`
--

CREATE TABLE `juegos` (
  `Palabra` varchar(1000) NOT NULL,
  `Descripcion` varchar(1000) NOT NULL,
  `Dificultad` int(10) NOT NULL,
  `id` int(11) NOT NULL,
  `Tipo` int(11) NOT NULL,
  `Orden` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `juegos`
--

INSERT INTO `juegos` (`Palabra`, `Descripcion`, `Dificultad`, `id`, `Tipo`, `Orden`) VALUES
('celula', 'Unidad fundamental de la vida.', 1, 1, 1, 1),
('adn', 'Molecula de información genetica hereditaria.', 1, 2, 2, 1),
('evolucion', 'Cambio a lo largo del tiempo.', 1, 3, 2, 2),
('Planta', 'Organismo fotosintético con raíces, tallo y hojas.', 1, 4, 1, 3),
('respiracion', 'Obtencion de energia mediante procesos quimicos.', 1, 5, 1, 2),
('Organo', 'Parte del cuerpo con función específica.', 1, 6, 2, 3),
('Ecosistema', 'Comunidad de seres vivos y su entorno.', 2, 7, 1, 1),
('Fotosíntesis', 'Proceso de conversión de luz en energía química.', 2, 8, 1, 2),
('Genética', 'Estudio de la herencia y la variación genética.', 2, 9, 1, 3),
('ADN', 'Molécula que almacena información genética hereditaria.', 2, 10, 2, 1),
('Organismo', 'Ser vivo con funciones biológicas específicas.', 2, 11, 2, 2),
('Evolución', 'Cambio gradual de las especies a lo largo del tiempo.', 2, 12, 2, 3),
('Célula', 'Unidad básica de la estructura y función biológica.  ', 2, 13, 2, 4),
('Reproducción', 'Proceso de creación de nuevas generaciones de organismos.', 2, 14, 2, 5),
('BiologíaSintética', 'Creación de organismos artificiales mediante la ingeniería genética.', 3, 15, 1, 1),
('Evolución', 'Cambio de especies a lo largo de las generaciones.', 3, 16, 1, 2),
('ADN', 'Molécula portadora de información genética en los seres vivos.', 3, 17, 1, 3),
('Mutación', 'Cambio en la secuencia de ADN que puede ser heredado.', 3, 18, 1, 4),
('Homeostasis', 'Regulación interna del equilibrio en los organismos.', 3, 19, 1, 5),
('Biodiversidad', 'Variedad de vida en un área geográfica particular.', 3, 20, 2, 1),
('Ecosistema', 'Comunidad biológica y su entorno físico interactuante.', 3, 21, 2, 2),
('Genética', 'Estudio de la herencia y variación genética en poblaciones.', 3, 22, 2, 3),
('Célula', 'Unidad estructural y funcional básica de los organismos.', 3, 23, 2, 4),
('Fotosíntesis', 'Proceso de conversión de luz en energía química.', 3, 24, 2, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `juegos`
--
ALTER TABLE `juegos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `juegos`
--
ALTER TABLE `juegos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
